package com.zc.clazz;

//局部类部类
public class JuBuLeiBuLei {
	
	private int size = 5, y = 7;
	
	public Object makeInner(int localVar){
		final int finalLocalVar = localVar;
		
		class MyInner{
			int y = 4;
			public String toString(){
				return "JuBuLeiBuLei中size\t" + size + "\nfinalLocalVar\t" + finalLocalVar + "\nthis.y=\t" + this.y;
			}
		}
		
		return new MyInner();
	}
}

/*class Main{
	public static void main(String[] args) {
		Object obj = new JuBuLeiBuLei().makeInner(47);
		System.out.println(obj.toString());
	}
}*/
