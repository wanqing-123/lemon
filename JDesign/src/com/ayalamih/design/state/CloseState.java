package com.ayalamih.design.state;
/**
 * CloseState.java
 * JDesign
 * 
 * Created by ayalamih on 2016年6月4日 下午2:30:20 TODO
 * Copyright (c) 2016 __AYALAMIH__. All rights reserved.
 */
public class CloseState extends LiftState {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		super.context.setLiftState(Context.openState);
		super.context.getLiftState().open();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("电梯门关闭...");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.context.setLiftState(Context.runState);
		super.context.getLiftState().run();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.context.setLiftState(Context.stopState);
		super.context.getLiftState().stop();
	}

}
