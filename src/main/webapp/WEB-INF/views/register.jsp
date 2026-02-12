<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Register</title>
</head>
<body>

<h2>Register New User</h2>

<p style="color:red;">${error}</p>
<p style="color:green;">${message}</p>

<form action="<%= request.getContextPath() %>/register" method="post">
    <label>Full Name:</label>
    <input type="text" name="name" required />
    <button type="submit">Register</button>
</form>

<p style="margin-top: 12px;">
    <a href="<%= request.getContextPath() %>/form">Back to Form</a>
</p>

</body>
</html>