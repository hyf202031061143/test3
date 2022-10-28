﻿<%@ page import="com.wolfcode.entity.T_User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    T_User userInfo= (T_User) session.getAttribute("userInfo");
%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title> 静态资源后台管理系统</title>
    <link rel="stylesheet" href="css/public.css"/>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<!--头部-->
<header class="publicHeader">
    <h1> 个人通讯录管理系统</h1>
    <div class="publicHeaderR">
        <div style="width: 46px;height: 46px;border-radius: 50%;overflow: hidden;margin-left: -100px;float: left">
            <img style="width: 100%" src="img/head_img.jpeg" alt="头像">
        </div>
        <span style="float: left" ><a href="login.html">退出</a></span>
    </div>
</header>
<!--时间-->
<section class="publicTime">
    <span id="time">2019年1月1日 11:11  星期一</span>
    <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
</section>
<!--主体内容-->
<section class="publicMian ">
    <div class="left"></div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>用户管理页面 >> 用户信息查看页面</span>
        </div>
        <div class="providerView">
            <p><strong>用户编号：</strong><span>${userInfo.ucode}</span></p>
            <p><strong>用户名称：</strong><span>${userInfo.uname}</span></p>
            <p><strong>用户性别：</strong><span>${userInfo.usex}</span></p>
            <p><strong>出生日期：</strong><span>${userInfo.ubirthday}</span></p>
            <p><strong>用户电话：</strong><span>${userInfo.uphone}</span></p>
            <p><strong>用户地址：</strong><span>${userInfo.uaddress}</span></p>
            <p><strong>用户类别：</strong><span>${userInfo.utype}</span></p>
            <p><strong>用户状态：</strong><span>启动</span></p>
            <a href="userList.html">返回</a>
        </div>
    </div>
</section>
<footer class="footer">
</footer>
<script src="js/time.js"></script>
<script src="js/jquery.js"></script>
<script>
    $(function () {
        $(".left").load("common_pri.html");
    }) ;
</script>
</body>
</html>