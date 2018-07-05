<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>form1</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/demo3Action" method="post">
		用户名:<input type="text" name="userName"/><br/>
		list[0]:<input type="text"  name="list"/><br/>
		list[1]:<input type="text"  name="list[1]"/><br/>
		map：<input type="text"  name="map['userId']" /><br/>
		<input type="submit" value="提交" />
	</form>
</body>
</html>