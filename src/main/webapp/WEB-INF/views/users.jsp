<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>Users</title>
</head>
<body>
<h2>Users Page</h2>

<p>Welcome, <b>${username}</b> ✅</p>

<p>
  <a href="<%= request.getContextPath() %>/logout">Logout</a>
</p>
</body>
</html>