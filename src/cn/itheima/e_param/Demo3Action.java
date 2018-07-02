package cn.itheima.e_param;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

//action获取参数
//每次请求都会创建新的实列对象
public class Demo3Action extends ActionSupport {
	public Demo3Action() {
		super();
		System.out.println("Demo3Action创建了");
	}

	private String userName;
	private List<String> list;
	private Map<String,String> map;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String execute() {
		System.out.println("用户名:" + userName);
		System.out.println("list:" + list.toString());
		System.out.println("map:" + map.toString());
		return "success";
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
}
