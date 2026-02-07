<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<h2>Kullanıcı Formu</h2>

<form action="<%= request.getContextPath() %>/submit" method="post">
    <label>İsim:</label>
    <input type="text" name="name" required />
    <br/><br/>

    <label>Yaş:</label>
    <input type="number" name="age" min="1" required />
    <br/><br/>

    <button type="submit">Gönder</button>
</form>

<p>
    <a href="<%= request.getContextPath() %>/hello">HelloServlet (GET) </a>
</p>
</body>
</html>