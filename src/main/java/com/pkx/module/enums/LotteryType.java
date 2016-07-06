package com.pkx.module.enums;

public enum LotteryType {
	
	//通过括号赋值,而且必须带有一个参构造器和一个属性跟方法，否则编译出错
    //赋值必须都赋值或都不赋值，不能一部分赋值一部分不赋值；如果不赋值则不能写构造器，赋值编译也出错
	NATIONAL_LOTTERY("1","全国彩票"),HIGH_FREQUENCY_LOTTERY("2","高频彩票"),	
	LOW_FREQUENCY_LOTTERY("3","表示低频彩票"),IDENTIFY_OUTSIDE_HIGH_FREQUENCY_LOTTERY("4","标识境外高频彩票"),
	IDENTIFY_OUTSIDE_LOW_FREQUENCY_LOTTERY("5","标识境外低频彩票");
	
	private final String value;
	private final String message;
	//构造器默认也只能是private, 从而保证构造函数只能在内部使用
	LotteryType(String value,String message){
		this.value=value;
		this.message=message;
	}
	
	public String getValue(){
		return value;
	}
	
	public String getMessage(){
		return message;
	}
	
	public static void main(String args[]){
		System.out.println(LotteryType.HIGH_FREQUENCY_LOTTERY.getMessage());
	}
}


