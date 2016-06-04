package com.ayalamih.design.state;
/**
 * Context.java
 * JDesign
 * 
 * Created by ayalamih on 2016年6月4日 下午2:25:40 TODO
 * Copyright (c) 2016 __AYALAMIH__. All rights reserved.
 */
public class Context {

	public static final OpenState openState = new OpenState();
	public static final CloseState closeState = new CloseState();
	public static final RunState runState = new RunState();
	public static final StopState stopState = new StopState();
	
	private LiftState liftState;
	
	public LiftState getLiftState() {
		return liftState;
	}
	
	public void setLiftState(LiftState liftState) {
		this.liftState = liftState;
		this.liftState.setContext(this);
	}
	
	public void open() {
		this.liftState.open();
	}
	
	public void close() {
		this.liftState.close();
	}
	
	public void run() {
		this.liftState.run();
	}
	
	public void stop() {
		this.liftState.stop();
	}
	
}
