<%--
  Created by GodWei.
  User: GodWei
  Date: 2018/7/24
  Good Good Study! Day Day Up!
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/init/Init.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>HomePage</title>
    <style>
        *{
            margin:0;
            padding:0;
        }
        .nav_top{
            position:fixed; /* 绝对定位，fixed是相对于浏览器窗口定位。 */
            top:0; /* 距离窗口顶部距离 */
            left:0; /* 距离窗口左边的距离 */
            width:100%; /* 宽度设置为100% */
            height:50px; /* 高度 */
            z-index:99; /* 层叠顺序，数值越大就越高。页面滚动的时候就不会被其他内容所遮挡。 */
        }
        .nav_index{
            position:fixed; /* 绝对定位，fixed是相对于浏览器窗口定位。 */
            top:50px; /* 距离窗口顶部距离 */
            left:0; /* 距离窗口左边的距离 */
            width:100%; /* 宽度设置为100% */
            height:50px; /* 高度 */
            z-index:99; /* 层叠顺序，数值越大就越高。页面滚动的时候就不会被其他内容所遮挡。 */
        }
        .top_bg{
            left:0;
            height: 230px;
            width: 100%;

        }
        .index{
            left:0;
            height: 50px;
            width: 100%;
            background: #f8f8f8;
        }
        .index_block{
            width: 4%;
            height: 100%;
            margin-left: 10%;
            float: left;
            text-align: center;
            line-height: 270%;
            cursor: pointer;
        }
        .index_innerbox{
            margin: 0 auto;
            text-align: center;
            line-height: 270%;
        }
        a{
            text-decoration: none;
            color: darkgray;
        }
    </style>
</head>
<body>

<div id="top" class="nav_top" style="background: white;">
    <div style="float:left;margin-left: 25%;margin-top: 0.55%;">
        <img src="/img/logo.png" />
    </div>
    <div style="float:left;width: 11%;height: 1px;"></div>
    <div style="float:left;">
        <form id="search" name="search" action="javascript:doSearch();">
            <input id="searchText" name="searchText" type="text" style="float: left;width: 310px;height: 30px;margin-top: 2.55%;border: 1px solid #DBDBDB;" />
            <div id="searchBtn" style="float: left;width: 40px;height: 30px;margin-top: 2.55%;cursor:pointer" onclick="doSearch();"><img src="/img/SearchBtn.png" style="width: 40px;height: 30px;" /></div>
        </form>
    </div>
    <div style="float:left;width: 11%;height: 1px;"></div>
    <div style="float: left;margin-top: 0.55%;color: darkgray;">
        <c:if test="${empty userinfo}" >
            <a href="/login/login">登录</a>&nbsp;&nbsp;
            <a href="/login/register">注册</a>
        </c:if>
        <c:if test="${!empty userinfo}" >
           Welcome to WeiHome!&nbsp;&nbsp;&nbsp; ${userinfo.name }
        </c:if>
    </div>
</div>
<div class="top_bg" style="background:url(/img/top-bar.jpg);background-repeat: no-repeat;background-size: cover;" ></div>
<div id="index" class="index">

    <div class="index_block" boxindex="1" style="margin-left: 22%;">
        <div class="index_innerbox">
            <span >首页</span>
        </div>
        <div id="index_bottom_1"  style="background: red;width: 80%;height: 7%;margin-left: 10%;"></div>
    </div>

    <div class="index_block" boxindex="2">
        <div class="index_innerbox">
            <span >待定</span>
        </div>
        <div id="index_bottom_2"  style="display:none;background: red;width: 80%;height: 7%;margin-left: 10%;"></div>
    </div>

    <div class="index_block" boxindex="3">
        <div class="index_innerbox">
            <span >待定</span>
        </div>
        <div id="index_bottom_3"  style="display:none;background: red;width: 80%;height: 7%;margin-left: 10%;"></div>
    </div>

    <div class="index_block" boxindex="4">
        <div class="index_innerbox">
            <span >待定</span>
        </div>
        <div id="index_bottom_4"  style="display:none;background: red;width: 80%;height: 7%;margin-left: 10%;"></div>
    </div>

    <div class="index_block" boxindex="5">
        <div class="index_innerbox" >
            <span >待定</span>
        </div>
        <div id="index_bottom_5"  style="display:none;background: red;width: 80%;height: 7%;margin-left: 10%;"></div>
    </div>

</div>
<div style="height: 2000px;"></div>

</body>

</html>
<script type="text/javascript">
    $(function() {

        $(".index_block").click(function () {
            var boxindex=$(this).attr("boxindex");
            $("div[id^='index_bottom_']").hide();
            $("#index_bottom_"+boxindex).show();
        });

        $(window).scroll(function() {
            if($(document).scrollTop() > 180) {
                $("#index").addClass("nav_index");
                $("#index").css("box-shadow","0 3px 3px rgba(0,0,0,0.1)");
            } else {
                $("#index").removeClass("nav_index");
                $("#index").css("box-shadow","");
            }
        })
    })


    function doSearch() {
        alert("功能开发中，敬请期待！");
    }

</script>