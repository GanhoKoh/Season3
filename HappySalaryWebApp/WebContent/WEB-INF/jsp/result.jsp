<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>

<%@ page import="com.gk.itpm.develop.happysalary.controller.*" %>
<%@	page import="com.gk.itpm.develop.happysalary.model.*" %>

<%
	User user = (User) request.getAttribute("user");
	String errMsgEngineerRank = (String) request.getAttribute("errMsgEngineerRank");
	String errMsgCost = (String) request.getAttribute("errMsgCost");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>計算結果</title>
</head>
<body>
 <h1>計算結果</h1>

 <% if(errMsgEngineerRank != null) { %>
  <h2><%= errMsgEngineerRank %></h2>
 <% } %>

 <% if(errMsgCost != null) { %>
  <h2><%= errMsgCost %></h2>
 <% } %>

 <% if(user != null) { %>
 あなたの単金は....
  <h1><%= user.getSalay() %>円</h1>ですね！
 <% } %>
 <br>
 <a href="/HappySalaryWebApp/">戻る</a>
</body>
</html>