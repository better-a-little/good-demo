package com.zc.thread;

public class Son10Main50 {
	
	private static Object object = new Object();
	
	public static void main(String[] args) throws InterruptedException {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i = 0; i<50; i++){
					synchronized (object) {
						for(int j=0; j<10; j++){
							System.out.println("子线程在循环" + (j+1));
						}
						System.out.println("子线程执行完第" + (i+1) + "次");
						object.notify();
						try {
							object.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				
			}
		}).start();
		
		for(int i=0; i<50; i++){
			synchronized (object) {
				//主线程让出锁，等待子线程唤醒
				object.wait();
				for(int j=0; j<100; j++){
					System.out.println("主循环在循环" + (j+1));
				}
				System.out.println("主线程执行完第" + (i+1) + "次");
				object.notify();
			}
		}
		
	}
}
