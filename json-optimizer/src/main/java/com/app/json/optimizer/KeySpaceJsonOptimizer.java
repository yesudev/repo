/**
 * 
 */
package com.app.json.optimizer;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * @author yesu
 *
 */
public class KeySpaceJsonOptimizer implements JsonOptimizer {

	private ObjectMapper mapper = null;
	
	public KeySpaceJsonOptimizer() {
		mapper = new ObjectMapper();
	}
	
	public KeySpaceJsonOptimizer(ObjectMapper mapper) {
		this.mapper = mapper;
	}

	public <T> String optimizeJson(T object) throws JsonProcessingException {
		if (mapper != null) {
			JsonNode jsonNode = mapper.valueToTree(object);
			return optimize(jsonNode);
		}
		return null;
	}

	private String optimize(JsonNode jsonNode) throws JsonProcessingException {
		int index = 0;
		ObjectNode optJsonNode = mapper.createObjectNode();
		ObjectNode keySpaceNode = mapper.createObjectNode();
		
		ArrayDeque<JsonNode> stack = new ArrayDeque<JsonNode>();
		stack.push(jsonNode);
		
		Map<String, JsonNode> tmp = new HashMap<String, JsonNode>();
		
		while (!stack.isEmpty()) {
			JsonNode currentNode = stack.pop();
			if (currentNode.isArray()) {
				for (int i = currentNode.size() - 1; i >= 0; i--) {
					if (currentNode.get(i).isArray() 
							|| currentNode.get(i).isObject()) {
						stack.push(currentNode.get(i));
					}
				}
			} else if (currentNode.isObject()) {
				
				ObjectNode currObjNode = (ObjectNode) currentNode;
				Iterator<Entry<String, JsonNode>> fileds = currObjNode.fields();
				
				tmp.clear();
				while (fileds.hasNext()) {
				
					Entry<String, JsonNode> field = (Entry<String, JsonNode>) fileds.next();
					
					if (keySpaceNode.get(field.getKey()) == null) {
						keySpaceNode.put(field.getKey(), index++);
					}
					
					Integer keyIndex = keySpaceNode.get(field.getKey()).asInt();
					tmp.put(String.valueOf(keyIndex), field.getValue());
					
					if (field.getValue().isArray() || field.getValue().isObject()) {
						stack.push(field.getValue());
					}
					
				}
				
				currObjNode.removeAll();
				for (String key : tmp.keySet()) {
					currObjNode.set(key, tmp.get(key));
				}
			}
		}
		
		optJsonNode.set("keys", keySpaceNode);
		optJsonNode.set("data", jsonNode);
		
		return mapper.writeValueAsString(optJsonNode);
	}

}
