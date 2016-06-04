package com.ayalamih.design.state;
/**
 * LiftState.java
 * JDesign
 * 
 * Created by ayalamih on 2016年6月4日 下午2:17:37 TODO
 * Copyright (c) 2016 __AYALAMIH__. All rights reserved.
 */
public abstract class LiftState {
	
	protected Context context;

	public void setContext(Context context) {
		this.context = context;
	}

	public abstract void open();
	
	public abstract void close();
	
	public abstract void run();
	
	public abstract void stop();
	
	
}
