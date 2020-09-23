<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 导航侧栏 -->
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${pageContext.request.contextPath}/img/user2-160x160.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p><security:authentication property="principal.userName" scope="session" var="userId"></security:authentication></p>
            </div>
            <span class="hidden">
                <security:authentication property="principal.roleName" scope="session" var="rolename"></security:authentication>
                <security:authentication property="principal.username" scope="session" var="username"></security:authentication>
            </span>

        </div>


        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">菜单</li>

            <li id="admin-index"><a href="${pageContext.request.contextPath}/pages/homepage.jsp"><i class="fa fa-dashboard"></i> <span>首页</span></a></li>

            <!-- 菜单 -->
            <c:if test="${rolename != '学生'}">
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-male"></i> <span>学生</span>
                    <span class="pull-right-container">
                  <i class="fa fa-angle-left pull-right"></i>
              </span>
                </a>
                <ul class="treeview-menu">

                    <li id="system-setting">
                        <a href="${pageContext.request.contextPath}/students/allStudents?page=1&size=4">
                            <i class="fa fa-circle-o"></i> 信息管理
                        </a>
                    </li>


                    <li id="system-setting">
                        <a href="${pageContext.request.contextPath}/scores/studentScores?page=1&size=4">
                            <i class="fa fa-circle-o"></i> 测评信息
                        </a>
                    </li>

                </ul>
            </li>


            <li class="treeview">
                <a href="#">
                    <i class="fa fa-user"></i> <span>管理员</span>
                    <span class="pull-right-container">
                  <i class="fa fa-angle-left pull-right"></i>
              </span>
                </a>
                <ul class="treeview-menu">

                    <li id="travellog-manage">
                        <a href="${pageContext.request.contextPath}/users/allUsers?page=1&size=4">
                            <i class="fa fa-circle-o"></i> 信息管理
                        </a>
                    </li>

                </ul>
            </li>
        </c:if>

            <c:if test="${rolename == '学生'}">
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-male"></i> <span>学生</span>
                        <span class="pull-right-container">
                  <i class="fa fa-angle-left pull-right"></i>
              </span>
                    </a>
                    <ul class="treeview-menu">

                        <li id="system-setting">
                            <a href="${pageContext.request.contextPath}/students/studentDetails?id=${username}">
                                <i class="fa fa-circle-o"></i> 学生信息
                            </a>
                        </li>

                        <li id="system-setting">
                            <a href="${pageContext.request.contextPath}/scores/academicScore?id=${username}">
                                <i class="fa fa-circle-o"></i> 成绩信息
                            </a>
                        </li>


                        <li id="system-setting">
                            <a href="${pageContext.request.contextPath}/scores/eval?id=${username}">
                                <i class="fa fa-circle-o"></i> 测评信息
                            </a>
                        </li>

                    </ul>
                </li>

                </li>
            </c:if>








            <!-- 菜单 /-->



        </ul>
    </section>
    <!-- /.sidebar -->
</aside>
<!-- 导航侧栏 /-->