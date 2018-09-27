package com.zc.clazz;

//普通类部类
public class ClazzInClazz1 {
	
	private int x = 100;
	
	class MyInner{
		private String y ="hello";
		
		public void innerMethod(){
			System.out.println("外部类属性x\t" + x);
			System.out.println("内部类属性y\t" + y);
			outerMethod();
			System.out.println("内部类调用外部内方法x\t" + ClazzInClazz1.this.x);
		}

	}
	
	public void outerMethod(){
		x++;
	}
	
	//在外部类方法中创建内部类实例
	public void makeInner(){
		MyInner inner = new MyInner();
//		inner.innerMethod();
	}
	
}
