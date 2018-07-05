package cn.itheima.g_interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

//继承
public class MyInterceptor3 extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("MyInterceptor3拦截器处理放行之前");
		//放行
		invocation.invoke();
		System.out.println("MyInterceptor3拦截器处理方行之后");
		return "success";
	}


}
