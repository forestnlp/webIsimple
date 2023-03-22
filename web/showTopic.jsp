<%--
  Created by IntelliJ IDEA.
  User: jay
  Date: 2023/3/22
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="jquery.min.js"></script>
    <script lang="javascript">
        function changePage(currentPage){
            if(currentPage<1){
                alert("已经是第一页了")
                return;
            }
            if(currentPage>${pageBean.totalPage}){
                alert("已经是最后一页了")
                return;
            }
            // alert(currentPage);
            // alert($("#pageSize").val());
            window.location.href="showTopic?&title="+$("#title").val()+"&currentPage="+currentPage+"&pageSize="+$("#pageSize").val();
        }
    </script>
    <style>
        table{
            border: 1px red solid;
            margin:0px auto;
            width: 80%;
        }
        td,th{
            border:1px solid green;
        }
    </style>
    <title>查看</title>
<body>
<div style="text-align: center">
    名字关键字:<input type="text" id="title" value="${title}">
    <input type="button" value="查询" onclick="changePage(1)" >
</div>
        <table>
        <tr>
        <th>id</th>
        <th>名称</th>
        <th>url</th>
        <th>查看次数</th>
        <th>创建时间</th>
        </tr>

            <c:forEach items="${pageBean.data}" var="topic">
                <tr>
                    <td>${topic.id}</td>
                    <td>${topic.title}</td>
                    <td><a href="${topic.url}" target="_blank">${topic.url}</a> </td>
                    <td>${topic.view_count}</td>
                    <td>${topic.page_create_time}</td>
                    <td>
                        <a href="#">删除</a>
                    </td>
                </tr>
            </c:forEach>
            <tr align="center">
                <td colspan="4">
                    <input type="button"  onclick="changePage(${pageBean.currentPage-1})" value="上一页">
                    <c:forEach begin="1" end="${pageBean.totalPage}" var="num">
                        <c:choose>
                            <c:when test="${num eq pageBean.currentPage}">
                                [${num}]
                            </c:when>
                            <c:otherwise>
                                ${num}
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                    <input type="button"  onclick="changePage(${pageBean.currentPage+1})" value="下一页">
                    &nbsp;&nbsp;&nbsp;
                    <a href="javascript:void(0)"  onclick="changePage(${pageBean.totalPage})">尾页</a>
                    &nbsp;&nbsp;&nbsp;
                    每页
                    <input id="pageSize" style="width: 40px" type="text" value="${pageBean.pageSize}">
                    条
                    &nbsp;&nbsp;&nbsp;
                    当前第
                    ${pageBean.currentPage}
                    页
                    &nbsp;&nbsp;&nbsp;
                    共${pageBean.totalPage}页
                    &nbsp;&nbsp;&nbsp;
                    共
                    ${pageBean.totalSize}
                    条记录
                    &nbsp;&nbsp;&nbsp;
                </td>
            </tr>
        </table>
</body>
</html>
