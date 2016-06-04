package com.ayalamih.design.state;
/**
 * ILift.java
 * JDesign
 * 定义电梯接口
 * Created by ayalamih on 2016年6月4日 上午11:54:39 TODO
 * Copyright (c) 2016 __AYALAMIH__. All rights reserved.
 */
public interface ILift {
	
	/**
	 * 打开电梯门
	 */
	void open();
	
	/**
	 * 关闭电梯门
	 */
	void close();
	
	/**
	 * 电梯跑起来
	 */
	void run();
	
	/**
	 * 电梯停止
	 */
	void stop();
}
