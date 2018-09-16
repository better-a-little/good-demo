package com.zc.array;

public class StringBeforeK {
	
	private static void getArrayBeforeK(String str, String k, String location){
		
		System.out.println(str.contains(k));
		if(str.contains(k)){
			
			if(location.equals("min")){
				int num = str.indexOf(k);
				System.out.println(num);
				String getK = str.substring(0, num + 1);
				System.out.println(getK);
			}
			
			if(location.equals("max")){
				int num = str.lastIndexOf(k);
				System.out.println(num);
				String getK = str.substring(0, num + 1);
				System.out.println(getK);
			}
			
		}else{
			System.out.println("字符不在字符串中");
		}
		
	}
	
	public static void main(String[] args) {
//		getArrayBeforeK("abcrerbtetn", "b", "min");
		getArrayBeforeK("abcrerbtetn", "b", "max");
	}

}
