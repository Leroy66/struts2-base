package cn.itheima.c_api;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

//action类的配置
//实现接口Action，里面的execute().提供方法的规范,预置一些字符串，返回时调用
/*public class ApiDemoAction implements Action{

	public String execute() throws Exception {
		System.out.println("默认方法");
		return null;
	}
}*/


//继承ActionSupport类
//更优于上一个方法，  implements Action, Validateable, ValidationAware, TextProvider, LocaleProvider, Serializable
public class ApiDemoAction extends ActionSupport{

}



