package com.zc.thread;

public class TwoAddTwoDelete {
	
	private int j;
	
	public static void main(String[] args) {
		
		TwoAddTwoDelete tt = new TwoAddTwoDelete();
		// 普通内部类的实例化
		Inc inc = tt.new Inc();
		Del del = tt.new Del();
		
		// 创建 2*n 个线程 此处 n=2
		for(int i = 0; i<2; i++){
			
			Thread t = new Thread(inc);
			t.start();
			
			t = new Thread(del);
			t.start();
		}
		
	}
	
	private synchronized void inc(){
		j++;
		System.out.println(Thread.currentThread().getName() + "-inc:" + j);
	}
	
	private synchronized void del(){
		j--;
		System.out.println(Thread.currentThread().getName() + "-del:" + j);
	}
	
	class Inc implements Runnable{

		@Override
		public void run() {
			for(int i=0; i<100; i++){
				inc();
			}
		}
	}
	
	class Del implements Runnable{

		@Override
		public void run() {
			del();
		}
	}

}
