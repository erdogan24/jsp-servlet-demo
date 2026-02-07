<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Submission Result</title>
</head>
<body>
<h2>Submission Result</h2>

<p><b>Name:</b> ${name}</p>
<p><b>Age:</b> ${age}</p>

<a href="<%= request.getContextPath() %>/form">Back to Form</a>
</body>
</html>