package cn.itheima.g_interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

//拦截器---第二种创建--继承AbstractInterceptor
//struts2空实现了init和destroy方法
public class MyInterceptor2 extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



}
