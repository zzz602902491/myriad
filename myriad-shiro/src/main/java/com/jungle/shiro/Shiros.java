package com.jungle.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

/**
 * @author jungle
 * @created 2017/10/11 0011 下午 5:32
 */
public class Shiros {

	public static Subject getSubject(){
		return SecurityUtils.getSubject();
	}
}
