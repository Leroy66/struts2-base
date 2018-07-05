package cn.itheima.f_ognl;

import com.opensymphony.xwork2.ActionSupport;

//action获取参数
//每次请求都会创建新的实列对象
public class Demo4Action extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("Demo4Action-----------");
		return SUCCESS;
	}

}
