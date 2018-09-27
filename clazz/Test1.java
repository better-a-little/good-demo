package com.zc.clazz;

import com.zc.clazz.ClazzInClazz1.MyInner;

public class Test1 {
	
	public static void main(String[] args) {
		ClazzInClazz1 outer = new ClazzInClazz1();
		// 使用外部类构造方法创建mo对象
		MyInner inner = outer.new MyInner();
		//常规内部类需要通过外部类的实例才能创建对象，与实例变量需要通过对象来访问相似
		inner.innerMethod();
	}

}
