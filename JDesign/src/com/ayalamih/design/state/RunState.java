package com.ayalamih.design.state;
/**
 * RunState.java
 * JDesign
 * 
 * Created by ayalamih on 2016年6月4日 下午2:30:40 TODO
 * Copyright (c) 2016 __AYALAMIH__. All rights reserved.
 */
public class RunState extends LiftState {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("电梯上下跑...");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.context.setLiftState(Context.stopState);
		super.context.getLiftState().stop();
	}

}
