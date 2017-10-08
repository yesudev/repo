package com.app.json.optimizer;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Test {

	public int a;
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.a = 10;
		List<Test> ts = new ArrayList<Test>();
		ts.add(t);
		ObjectMapper oM = new ObjectMapper();
		System.out.println(oM.valueToTree(ts) instanceof ArrayNode);
	}

}
