<%--
  Created by GodWei.
  User: GodWei
  Date: 2018/7/23
  Good Good Study! Day Day Up!
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/init/Init.jsp"%>
<html>
<head>
    <title>Test</title>
    <style>
        *{
            margin:0;
            padding:0;
        }
        a{
            text-decoration: none;
        }
    </style>
</head>
<body>
<div style="width: 100%;height: auto;background: darkgray;">
    <a href="javascript:doSubmit();">This is Test Page.</a>
    <form id="form" method="post" action="/show/showSth">
        <input type="hidden" name="id" value="1">
        <input type="hidden" name="loginid" value="2">
        <input type="hidden" name="password" value="3">
        <input type="hidden" name="name" value="4">
        <input type="hidden" name="hobby" value="游泳">
        <input type="hidden" name="hobby" value="健身">
        <input type="hidden" name="hobby" value="看书">
        <input type="hidden" name="hobby" value="学习">
    </form>
</div>


<script type="text/javascript">
    function doSubmit() {

        $("#form").submit();
        
    }
</script>

</body>
</html>
