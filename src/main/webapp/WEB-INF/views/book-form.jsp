<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Create new book</title>
</head>
<body>
<form action="POST" target="/books">
    <label>
        ISBN:
        <input name="isbn" type="text" required>
    </label>
    <br>
    <label>
        Title:
        <input name="title" type="text" required>
    </label>
    <br>
    <label>
        Author:
        <input name="author" type="text" required>
    </label>
    <br>
    <label>
        Publisher:
        <input name="publisher" type="text" required>
    </label>
    <br>
    <label>
        Type:
        <input name="publisher" type="text" required>
    </label>
    <br>
</form>
</body>
</html>
