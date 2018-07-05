package cn.itheima.g_interceptor;

import com.opensymphony.xwork2.ActionSupport;

//拦截器
public class Demo5Action extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("Demo5Action-----------");
		return SUCCESS;
	}

}
