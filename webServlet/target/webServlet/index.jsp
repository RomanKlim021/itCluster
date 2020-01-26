<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

</body>
</html>
<html>
<body>
<form name="loginForm" method="post" action="loginServlet">
    Username: <input type="text" name="username"/> <br/>
    Password: <input type="password" name="password"/> <br/>
    <input type="submit" value="Login" /> <br/>
    Speaking language:
    <input type="checkbox" name="language" value="english" />English
    <input type="checkbox" name="language" value="french" />French<br/>
    <br/>Gender:
    <input type="radio" name="gender" value="male" />Male
    <input type="radio" name="gender" value="female" />Female<br/>
    <br/>Feedback:<br/>
    <textarea rows="5" cols="30" name="feedback"></textarea><br/>
    <br/>Job Category:
    <select name="jobCat">
        <option value="tech">Technology</option>
        <option value="admin">Administration</option>
        <option value="biology">Biology</option>
        <option value="science">Science</option>
    </select><br/>
</form>
</body>
</html>
<br/>
<br/>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>File Upload</title>
</head>
<body>
    <h1>File Upload</h1>
    <form method="post" action="UploadServlet" enctype="multipart/form-data">
        Select file to upload: <input type="file" name="file" size="60" /><br />
        <br /> <input type="submit" value="Upload" />
    </form>
</body>
</html>


