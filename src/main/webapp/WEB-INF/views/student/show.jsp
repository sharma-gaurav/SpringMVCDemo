<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Student</title>
</head>
<body>
    ${heading}<br/>
    <br/>
    Name :  ${student.firstName} ${student.lastName} <br/>
    Phone : ${student.phoneNumber} <br/>
    DOB : ${student.dateOfBirth} <br/>
    Subjects : ${student.subjects} <br/>
</body>
</html>
