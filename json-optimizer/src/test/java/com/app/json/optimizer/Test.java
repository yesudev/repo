package com.app.json.optimizer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Test {

	public int a;
	
	public static void main(String[] args) throws Exception {
		ObjectMapper oM = new ObjectMapper();
		Example ex = oM.readValue(new File("/home/yesu/git/json-optimizer/src/test/java/com/app/json/optimizer/test.json"), Example.class);
		JsonOptimizer optimizer = new KeySpaceJsonOptimizer();
		System.out.println(oM.writeValueAsString(ex).length());
		System.out.println(optimizer.optimizeJson(ex).length());
	}

}
