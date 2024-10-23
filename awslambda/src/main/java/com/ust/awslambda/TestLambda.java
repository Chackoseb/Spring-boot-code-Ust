package com.ust.awslambda;

import com.amazonaws.services.lambda.runtime.Context;

public class TestLambda {
//	public String status(int x) {
//		return x*4 + "";
//	}
	
	public String handleRequest(Data obj, Context context) {
		return (obj.getX() + obj.getY() + "");
	}
}
