package com.zc.clazz;

//静态类部类
public class ClazzInClazz2 {
	
	private int x1 = 100;
	public static int x = 100;
	
	public static class MyInner{
		private String y ="hello";
		public void innerMethod(){
			System.out.println("外部类属性x\t" + x);
			System.out.println("内部类属性y\t" + y);
		}
	}
}
