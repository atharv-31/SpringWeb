<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Information</title>
</head>
<body>
	<h1>Student Information</h1>

	<h2>
	 FirstName : ${stud.firstName} <br>
	 LastName : ${stud.lastName} <br>
	 Gender : ${stud.gender} <br>
	 Courses :
	          <c:forEach var="courses" items="${stud.courses}">
	             ${courses} |
	          </c:forEach>  <br>
 	Year of Passing : ${stud.yearOfPassing }
	</h2>
</body>
</html>