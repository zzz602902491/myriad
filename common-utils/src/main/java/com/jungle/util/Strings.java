package com.jungle.util;

/**
 * @author jungle
 * @created 2017/10/11 0011 下午 4:55
 */
public abstract class Strings {

	public static boolean isNullOrEmpty(String... str){
			String[] strs = str;
			int length = strs.length;
			for(int i=0;i<length;i++){
				if(strs[i]==null||strs[i].length()==0){
					return true;
				}
			}
			return false;
	}
}
