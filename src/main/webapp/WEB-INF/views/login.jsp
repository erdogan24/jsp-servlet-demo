<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>Login</title>
</head>
<body>
<h2>Login</h2>

<p style="color:red;">${error}</p>

<form action="<%= request.getContextPath() %>/login" method="post">
  <label>Username:</label>
  <input type="text" name="username" required />
  <br/><br/>

  <button type="submit">Login</button>
</form>

<p>
  <a href="<%= request.getContextPath() %>/form">Back to Form</a>
</p>
</body>
</html>