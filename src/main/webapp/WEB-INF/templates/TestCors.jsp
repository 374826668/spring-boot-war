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
    <title>testCors</title>
</head>
    <body>
    <h1 id="title">点击跳转测试</h1>
    <script type="text/javascript" src="/webjars/jquery/2.1.4/jquery.min.js"></script>
    <script>
            $(function () {
                $('#title').click(function () {
                    $.ajax({
                        url:"http://localhost:8888/app/rest/get",
                        type:"POST",
                        data:{
                            name:"测试"
                        },
                        success:function (data,status,xhr) {
                            console.log(data);
                            alert(data.name);
                        }
                    });
                })
            })



        </script>
    </body>
</html>