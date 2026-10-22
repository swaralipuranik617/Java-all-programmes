<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Details</title>
</head>
<body>
    <h2>Student Information</h2>

    <%
        String name = request.getParameter("name");
        String prn = request.getParameter("prn");
        String semester = request.getParameter("semester");
        String branch = request.getParameter("branch");
    %>

    <p>Name: <%= name %></p>
    <p>PRN: <%= prn %></p>
    <p>Semester: <%= semester %></p>
    <p>Branch: <%= branch %></p>

    <a href="student.jsp">Go Back</a>
</body>
</html>