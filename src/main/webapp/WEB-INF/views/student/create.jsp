<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create a Student</title>
</head>
<body>
${heading}<br/>
<form:errors path="student.*"/>
<form action="/student/save" method="POST">
    <label>First Name : </label><input type="text" name="firstName"><br/>
    <label>Last Name : </label><input type="text" name="lastName"> <br/>
    <label>Phone Number : </label><input type="text" name="phoneNumber"> <br/>
    <label>Subjects : </label>
    <input type="checkbox" name="subjects" value="Math"> Math&nbsp;&nbsp;
    <input type="checkbox" name="subjects" value="English"> English&nbsp;&nbsp;
    <input type="checkbox" name="subjects" value="Hindi"> Hindi<br/>
    <label>DOB : </label><input type="text" name="dateOfBirth"> <br/>
    Address: <br/>
    <label>City : </label><input type="text" name="address.city"> <br/>
    <label>State : </label><input type="text" name="address.state"> <br/>
    <label>Country : </label><input type="text" name="address.country"> <br/>
    <button type="submit" value="Save">Save</button>
</form>

</body>
</html>
