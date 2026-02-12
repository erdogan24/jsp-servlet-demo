<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>Users</title>
</head>
<body>
<h2>Users Page</h2>

<p>Welcome, <b>${username}</b> ✅</p>

<h3>Registered Users</h3>

<ul>
  <%
    java.util.Set<String> users = (java.util.Set<String>) request.getAttribute("users");
    if (users != null && !users.isEmpty()) {
      for (String u : users) {
  %>
  <li><%= u %></li>
  <%
    }
  } else {
  %>
  <li>No registered users yet.</li>
  <%
    }
  %>
</ul>

<p>
  <a href="<%= request.getContextPath() %>/logout">Logout</a>
</p>
</body>
</html>