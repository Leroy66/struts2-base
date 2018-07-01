package cn.itheima.b_dynamic;

//动态方法配置
public class DynamicAction {

	public String add() {
		System.out.println("添加方法!");
		return "success";
	}
	
	public String delete() {
		System.out.println("删除方法!");
		return "success";
	}
	
	public String update() {
		System.out.println("修改方法!");
		return "success";
	}
	
	public String find() {
		System.out.println("查找方法!");
		return "success";
	}
	
}
