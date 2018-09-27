package com.zc.niminglei;

public class Main {
	
	public static void main(String[] args) {
		
		//A写法，就是匿名内部类实现接口的写法，会看得更明白。
		class A implements InterfaceA{
			@Override
			public void sayA() {
				System.out.printf("A.....");
			}
		}
		A a = new A();
		
		//B写法，等同于A写法，不过更加简洁。乍一看好像new了一个接口出来。
		InterfaceB b = new InterfaceB() {
			@Override
			public void sayB() {
				System.out.printf("B.....");
			}
		};
		
		a.sayA();
		b.sayB();
		
		//简洁
		new InterfaceB() {
			@Override
			public void sayB() {
				System.out.printf("B.....");
			}
		}.sayB();
		
	}

}
