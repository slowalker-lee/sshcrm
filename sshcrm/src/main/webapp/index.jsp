<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
  </head>
  <body>
    <h1>Welcome To Struts 2!!!!</h1>
    
    <form action="${pageContext.request.contextPath }/sys/sysUserGroup_save">
    	部门名称:<input name="name" type="text"/>
    	部门负责人:<input name="principal" type="text">
    	部门职责:<input name="incumbent" type="text">
    	备注:<input name="remark" type="text"/>
    	<input type="submit" value="提交">
    	
    </form>
  </body>
</html>