package com.classwork.java;

import java.util.Arrays;
import java.util.List;

public class ClassWorkLinkList {

	public static void main(String[] args) {
    List<String> furniture = Arrays.asList("Table","Chair","Box","Door","Bed");
    for (String getvalue : furniture) {
    	if (getvalue.equals("Chair")) {
    		System.out.println("Chair Found");
    		break;
    	}
    	else {
    		System.out.println(getvalue);
    	}
		
	}
	}

}
