<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="pragma" content="no-cache" />
    <meta http-equiv="cache-control" content="no-cache" />
    <meta http-equiv="expires" content="0" />
    <title>testUpload</title>
</head>
    <body>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <h1 id="title">测试</h1>
    <form action="/app/file/uploadFile" enctype="multipart/form-data" method="post">
        文件：<input type="file" name="pengFile"/>
        <input type="submit" value="上传"/>
    </form>

    </body>
</html>