package com.jungle.web;

/**
 * @author jungle
 * @created 2017/10/11 0011 下午 5:21
 */
public abstract class BaseController {

	public String REDIRECT(String url){
		return "redirect:"+url;
	}
}
