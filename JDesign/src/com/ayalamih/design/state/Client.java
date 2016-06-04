package com.ayalamih.design.state;
/**
 * Client.java
 * JDesign
 * 
 * Created by ayalamih on 2016年6月4日 下午12:08:12 TODO
 * Copyright (c) 2016 __AYALAMIH__. All rights reserved.
 */
public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		context.setLiftState(new RunState());
		
		context.open();
		context.close();
		context.run();
		context.stop();
	}
}
