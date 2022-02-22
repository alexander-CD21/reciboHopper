<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simple Receipt</title>
</head>
<body>
	<h1>Customer Name : <c:out value="${first}"></c:out></h1>
	<h2>Item name : <c:out value="${item}"></c:out></h2>
	<h2>Price :$ <c:out value="${price}"></c:out></h2>
	<h2>Description : <c:out value="${description}"></c:out></h2>
	<h2>vendor: <c:out value="${vendor}"></c:out></h2>
</body>
</html>