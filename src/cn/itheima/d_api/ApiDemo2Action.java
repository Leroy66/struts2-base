package cn.itheima.d_api;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ApiDemo2Action extends ActionSupport {

	public String execute() {
		//request域=>map(struts2不推荐使用原生request域)
		//Map<String, Object> requestScope = (Map<String, Object>) ActionContext.getContext().get("request");
		//推荐
		ActionContext.getContext().put("name", "requestTom");
		
		//session域=>map
		Map<String, Object> sessionScope = ActionContext.getContext().getSession();
		sessionScope.put("name", "sessionTom");
		
		//application域=>map
		Map<String, Object> applicationScope = ActionContext.getContext().getApplication();
		applicationScope.put("name", "applicationTom");
		
		return "success";
	}
}




















