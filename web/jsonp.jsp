<%--
  Created by IntelliJ IDEA.
  User: jay
  Date: 2023/3/22
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>$Title%sSourceCode%lt;</title>
    <meta charset="UTF-8"/>
    <script src="http://localhost:8080/web/jquery.min.js"></script>
    <script>


        function checkUname() {
            // 获取输入框中的内容
            if (null == $("#unameI").val() || '' == $("#unameI").val()) {
                $("#unameInfo").text("用户名不能为空");
                return;
            }
            $("#unameInfo").text("");
            // 通过jQuery.ajax() 发送异步请求
            $.ajax(
                {
                    type: "GET",// 请求的方式 GET  POST
                    url: "http://localhost:8080/web/unameCheckServlet2.do?", // 请求的后台服务的路径
                    data: {uname: $("#unameI").val()},// 提交的参数
                    dataType: "jsonp",
                    jsonp: "aaa",
                    success: function (info) {
                        $("#unameInfo").text(info)
                    }

                }
            )
        }


    </script>
</head>
<body>
<form action="myServlet1.do">
    用户名:<input id="unameI" type="text" name="uname" onblur="checkUname()">
    <span id="unameInfo" style="color: red"></span><br/>
    密码:<input type="password" name="pwd"><br/>
    <input type="submit" value="提交按钮">
</form>
</body>
</html>
