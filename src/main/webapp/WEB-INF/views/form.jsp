<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>User Form</title>
</head>
<body>
<h2>User Form</h2>
<p style="color:red;">${error}</p>
<form action="<%= request.getContextPath() %>/submit" method="post">
    <label>Full Name:</label>
    <input type="text" name="name" required />
    <br/><br/>

    <label>Age:</label>
    <input type="number" name="age" min="1" required />
    <br/><br/>

    <button type="submit">Submit</button>
</form>

<p>
    <a href="<%= request.getContextPath() %>/hello">HelloServlet (GET)</a>
</p>
</body>
</html>