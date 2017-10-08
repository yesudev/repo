/**
 * 
 */
package com.app.json.optimizer;

import java.util.ArrayDeque;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
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

	public <T> String optimizeJson(T object) {
		if (mapper != null) {
			JsonNode jsonNode = mapper.valueToTree(object);
			return optimize(jsonNode);
		}
		return null;
	}

	private String optimize(JsonNode jsonNode) {
		ObjectNode keySpaceNode = mapper.createObjectNode();
		
		ArrayDeque<JsonNode> stack = new ArrayDeque<JsonNode>();
		stack.push(jsonNode);
		
		while (!stack.isEmpty()) {
			JsonNode currentNode = stack.pop();
			if (currentNode.isArray()) {
				ArrayNode arrayNode = (ArrayNode) currentNode;
				for (int i = arrayNode.size() - 1; i >= 0; i--) {
					
				}
			} else if (currentNode.isObject()) {
				
			}
		}
		return null;
	}

}
