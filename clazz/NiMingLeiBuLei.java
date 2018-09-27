package com.zc.clazz;

public class NiMingLeiBuLei {
	
	private int size=5;
	
	public Object makeInner(int localVar){
		final int finalLocalVar = localVar;
		return new Object(){
			//使用匿名内部类
			public String toString() {
				
				return "NiMingLeiBuLei.size=" + size + "\nfinalLocalVar=" + finalLocalVar;
			}
		};
		
	}
}

