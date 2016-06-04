package com.ayalamih.design.state;
/**
 * OpenState.java
 * JDesign
 * 
 * Created by ayalamih on 2016年6月4日 下午2:27:16 TODO
 * Copyright (c) 2016 __AYALAMIH__. All rights reserved.
 */
public class OpenState extends LiftState {
	
	@Override
	public void open() {
		System.out.println("电梯门开启...");
	}

	@Override
	public void close() {
		super.context.setLiftState(Context.closeState);
		super.context.close();
	}

	@Override
	public void run() {
		
	}

	@Override
	public void stop() {
		
	}

}
