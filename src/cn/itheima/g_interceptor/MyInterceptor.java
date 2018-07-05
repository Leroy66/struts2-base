package cn.itheima.g_interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

//拦截器---第一种创建--一般不用
//拦截器生命周期:随项目的启动而创建,随项目的关闭而销毁
public class MyInterceptor implements Interceptor {

	//销毁
	public void destroy() {
		
	}

	//处初始化
	public void init() {
		
	}

	//拦截方法
	public String intercept(ActionInvocation arg0) throws Exception {

		return null;
	}

}
