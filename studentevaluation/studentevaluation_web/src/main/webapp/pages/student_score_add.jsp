<%@ page import="java.util.List" %>
<%@ page import="pers.fzm.studentevaluation.domain.StudentScores" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>成绩详情</title>
    <meta name="description" content="AdminLTE2定制版">
    <meta name="keywords" content="AdminLTE2定制版">

    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <!-- Font Awesome -->
    <!-- Ionicons -->
    <!-- iCheck -->
    <!-- Morris chart -->
    <!-- jvectormap -->
    <!-- Date Picker -->
    <!-- Daterange picker -->
    <!-- Bootstrap time Picker -->
    <!--<link rel="stylesheet" href="../../../plugins/timepicker/bootstrap-timepicker.min.css">-->
    <!-- bootstrap wysihtml5 - text editor -->
    <!--数据表格-->
    <!-- 表格树 -->
    <!-- select2 -->
    <!-- Bootstrap Color Picker -->
    <!-- bootstrap wysihtml5 - text editor -->
    <!--bootstrap-markdown-->
    <!-- Theme style -->
    <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
    <!-- Ion Slider -->
    <!-- ion slider Nice -->
    <!-- bootstrap slider -->
    <!-- bootstrap-datetimepicker -->

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- jQuery 2.2.3 -->
    <!-- jQuery UI 1.11.4 -->
    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
    <!-- Bootstrap 3.3.6 -->
    <!-- Morris.js charts -->
    <!-- Sparkline -->
    <!-- jvectormap -->
    <!-- jQuery Knob Chart -->
    <!-- daterangepicker -->
    <!-- datepicker -->
    <!-- Bootstrap WYSIHTML5 -->
    <!-- Slimscroll -->
    <!-- FastClick -->
    <!-- iCheck -->
    <!-- AdminLTE App -->
    <!-- 表格树 -->
    <!-- select2 -->
    <!-- bootstrap color picker -->
    <!-- bootstrap time picker -->
    <!--<script src="../../../plugins/timepicker/bootstrap-timepicker.min.js"></script>-->
    <!-- Bootstrap WYSIHTML5 -->
    <!--bootstrap-markdown-->
    <!-- CK Editor -->
    <!-- InputMask -->
    <!-- DataTables -->
    <!-- ChartJS 1.0.1 -->
    <!-- FLOT CHARTS -->
    <!-- FLOT RESIZE PLUGIN - allows the chart to redraw when the window is resized -->
    <!-- FLOT PIE PLUGIN - also used to draw donut charts -->
    <!-- FLOT CATEGORIES PLUGIN - Used to draw bar charts -->
    <!-- jQuery Knob -->
    <!-- Sparkline -->
    <!-- Morris.js charts -->
    <!-- Ion Slider -->
    <!-- Bootstrap slider -->
    <!-- bootstrap-datetimepicker -->
    <!-- 页面meta /-->

    <link rel="stylesheet" href="../plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="../plugins/iCheck/square/blue.css">
    <link rel="stylesheet" href="../plugins/morris/morris.css">
    <link rel="stylesheet" href="../plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet" href="../plugins/datepicker/datepicker3.css">
    <link rel="stylesheet" href="../plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" href="../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet" href="../plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet" href="../plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet" href="../plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet" href="../plugins/select2/select2.css">
    <link rel="stylesheet" href="../plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet" href="../plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet" href="../plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="../plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet" href="../plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet" href="../plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet" href="../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">

    <style>
        .center
        {
            text-align: center;
            font-size : 120%
        }
    </style>
</head>

<body class="hold-transition skin-purple sidebar-mini">

<div class="wrapper">

    <!-- 页面头部 -->
    <jsp:include page="header.jsp"></jsp:include>
    <!-- 页面头部 /-->

    <!-- 页面侧栏 -->
    <jsp:include page="asider.jsp"></jsp:include>
    <!-- 页面侧栏 /-->

    <!-- 内容区域 -->
    <!-- @@master = admin-layout.html-->
    <!-- @@block = content -->

    <div class="content-wrapper">

        <!-- 内容头部 -->
        <section class="content-header">
            <h1>
                添加学习成绩
            </h1>
        </section>
        <!-- 内容头部 /-->

        <!-- 正文区域 -->
        <section class="content">

            <form action="${pageContext.request.contextPath}/scores/addAcademicScores" method="post">

                <!-- .box-body -->
                <div class="box">


                    <div class="box-body">
                        <!-- 数据表格 -->
                        <div class="table-box">
                            <div class="box-header">
                                <h6 class="box-title">第一学年</h6>
                            </div>

                            <!--数据列表-->
                            <table  class="table table-bordered table-striped table-hover dataTable">
                                <thead>
                                <tr>
                                    <th class="text-center">课程编号</th>
                                    <th class="text-center">课程名称</th>
                                    <th class="text-center">学分</th>
                                    <th class="text-center">成绩</th>
                                </tr>
                                </thead>
                                <tbody>

                                <c:set var="count" value="0" />
                                <c:forEach var="studentScore" items="${studentScores}" varStatus="status">
                                    <c:if test="${studentScore.course.yearOfCollege == 1}">
                                        <tr class="studentScore1">
                                            <td class="center" id="studentScores[${count}].courseId">${studentScore.courseId}</td>
                                            <td class="center" id="studentScores[${count}].courseName">${studentScore.course.courseName}</td>
                                            <td class="center" id="studentScores[${count}].courseCredit">${studentScore.course.credit}</td>
                                            <td class="center">
                                                <input name="studentScores[${count}].studentId" value="${studentScore.studentId}"  type="hidden">
                                                <input name="studentScores[${count}].courseId" value="${studentScore.courseId}"  type="hidden">
                                                <input class="center" name="studentScores[${count}].score" id="studentScores[${count}].courseScore" type="text">
                                            </td>
                                            <c:set var="count" value="${count+1}" />
                                        </tr>
                                    </c:if>
                                </c:forEach>
                                </tbody>

                            </table>
                            <!--数据列表/-->
                        </div>
                        <!-- 数据表格 /-->
                    </div>
                    <!-- /.box-body -->
                </div>

                <!-- .box-body -->
                <div class="box">


                    <div class="box-body">
                        <!-- 数据表格 -->
                        <div class="table-box">
                            <div class="box-header">
                                <h6 class="box-title">第二学年</h6>
                            </div>

                            <!--数据列表-->
                            <table  class="table table-bordered table-striped table-hover dataTable">
                                <thead>
                                <tr>
                                    <th class="text-center">课程编号</th>
                                    <th class="text-center">课程名称</th>
                                    <th class="text-center">学分</th>
                                    <th class="text-center">成绩</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="studentScore" items="${studentScores}" varStatus="status">
                                    <c:if test="${studentScore.course.yearOfCollege == 2}">
                                        <tr class="studentScore1">
                                            <td class="center">${studentScore.courseId}</td>
                                            <td class="center">${studentScore.course.courseName}</td>
                                            <td class="center" >${studentScore.course.credit}</td>
                                            <td class="center">
                                                <input name="studentScores[${count}].studentId" value="${studentScore.studentId}"  type="hidden">
                                                <input name="studentScores[${count}].courseId" value="${studentScore.courseId}"  type="hidden">
                                                <input class="center" name="studentScores[${count}].score" type="text">
                                            </td>
                                            <c:set var="count" value="${count+1}" />
                                        </tr>
                                    </c:if>
                                </c:forEach>

                                </tbody>

                            </table>
                            <!--数据列表/-->
                        </div>
                        <!-- 数据表格 /-->
                    </div>
                    <!-- /.box-body -->
                </div>

                <!-- .box-body -->
                <div class="box">


                    <div class="box-body">
                        <!-- 数据表格 -->
                        <div class="table-box">
                            <div class="box-header">
                                <h6 class="box-title">第三学年</h6>
                            </div>

                            <!--数据列表-->
                            <table  class="table table-bordered table-striped table-hover dataTable">
                                <thead>
                                <tr>
                                    <th class="text-center">课程编号</th>
                                    <th class="text-center">课程名称</th>
                                    <th class="text-center">学分</th>
                                    <th class="text-center">成绩</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="studentScore" items="${studentScores}" varStatus="status">
                                    <c:if test="${studentScore.course.yearOfCollege == 3}">
                                        <tr class="studentScore1">
                                            <td class="center">${studentScore.courseId}</td>
                                            <td class="center">${studentScore.course.courseName}</td>
                                            <td class="center" >${studentScore.course.credit}</td>
                                            <td class="center">
                                                <input name="studentScores[${count}].studentId" value="${studentScore.studentId}"  type="hidden">
                                                <input name="studentScores[${count}].courseId" value="${studentScore.courseId}"  type="hidden">
                                                <input class="center" name="studentScores[${count}].score" type="text">
                                            </td>
                                            <c:set var="count" value="${count+1}" />
                                        </tr>
                                    </c:if>
                                </c:forEach>

                                </tbody>

                            </table>
                            <!--数据列表/-->
                        </div>
                        <!-- 数据表格 /-->
                    </div>
                    <!-- /.box-body -->
                </div>

                <!-- .box-body -->
                <div class="box">

                    <div class="box-body">
                        <!-- 数据表格 -->
                        <div class="table-box">
                            <div class="box-header">
                                <h6 class="box-title">第四学年</h6>
                            </div>

                            <!--数据列表-->
                            <table  class="table table-bordered table-striped table-hover dataTable">
                                <thead>
                                <tr>
                                    <th class="text-center">课程编号</th>
                                    <th class="text-center">课程名称</th>
                                    <th class="text-center">学分</th>
                                    <th class="text-center">成绩</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="studentScore" items="${studentScores}" varStatus="status">
                                    <c:if test="${studentScore.course.yearOfCollege == 4}">
                                        <tr class="studentScore1">
                                            <td class="center">${studentScore.courseId}</td>
                                            <td class="center">${studentScore.course.courseName}</td>
                                            <td class="center" >${studentScore.course.credit}</td>
                                            <td class="center">
                                                <input name="studentScores[${count}].studentId" value="${studentScore.studentId}"  type="hidden">
                                                <input name="studentScores[${count}].courseId" value="${studentScore.courseId}"  type="hidden">
                                                <input class="center" name="studentScores[${count}].score" type="text">
                                            </td>
                                            <c:set var="count" value="${count+1}" />
                                        </tr>
                                    </c:if>
                                </c:forEach>



                                </tbody>

                            </table>
                            <!--数据列表/-->
                        </div>
                        <!-- 数据表格 /-->
                    </div>
                    <!-- /.box-body -->
                    <button type="submit"  class="btn bg-maroon" id="save">保存</button>

                </div>

            </form>

        </section>
        <!-- 正文区域 /-->

    </div>
    <!-- @@close -->
    <!-- 内容区域 /-->




    <script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
    <script src="../plugins/jQueryUI/jquery-ui.min.js"></script>
    <script>
        $.widget.bridge('uibutton', $.ui.button);
    </script>
    <script src="../plugins/bootstrap/js/bootstrap.min.js"></script>
    <script src="../plugins/raphael/raphael-min.js"></script>
    <script src="../plugins/morris/morris.min.js"></script>
    <script src="../plugins/sparkline/jquery.sparkline.min.js"></script>
    <script src="../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="../plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
    <script src="../plugins/knob/jquery.knob.js"></script>
    <script src="../plugins/daterangepicker/moment.min.js"></script>
    <script src="../plugins/daterangepicker/daterangepicker.js"></script>
    <script src="../plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
    <script src="../plugins/datepicker/bootstrap-datepicker.js"></script>
    <script src="../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
    <script src="../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
    <script src="../plugins/slimScroll/jquery.slimscroll.min.js"></script>
    <script src="../plugins/fastclick/fastclick.js"></script>
    <script src="../plugins/iCheck/icheck.min.js"></script>
    <script src="../plugins/adminLTE/js/app.min.js"></script>
    <script src="../plugins/treeTable/jquery.treetable.js"></script>
    <script src="../plugins/select2/select2.full.min.js"></script>
    <script src="../plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
    <script src="../plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
    <script src="../plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
    <script src="../plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
    <script src="../plugins/bootstrap-markdown/js/markdown.js"></script>
    <script src="../plugins/bootstrap-markdown/js/to-markdown.js"></script>
    <script src="../plugins/ckeditor/ckeditor.js"></script>
    <script src="../plugins/input-mask/jquery.inputmask.js"></script>
    <script src="../plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
    <script src="../plugins/input-mask/jquery.inputmask.extensions.js"></script>
    <script src="../plugins/datatables/jquery.dataTables.min.js"></script>
    <script src="../plugins/datatables/dataTables.bootstrap.min.js"></script>
    <script src="../plugins/chartjs/Chart.min.js"></script>
    <script src="../plugins/flot/jquery.flot.min.js"></script>
    <script src="../plugins/flot/jquery.flot.resize.min.js"></script>
    <script src="../plugins/flot/jquery.flot.pie.min.js"></script>
    <script src="../plugins/flot/jquery.flot.categories.min.js"></script>
    <script src="../plugins/ionslider/ion.rangeSlider.min.js"></script>
    <script src="../plugins/bootstrap-slider/bootstrap-slider.js"></script>
    <script src="../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
    <script src="../plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>
    <script>
        $(document).ready(function() {
            // 选择框
            $(".select2").select2();

            // WYSIHTML5编辑器
            $(".textarea").wysihtml5({
                locale: 'zh-CN'
            });
        });



        // 设置激活菜单
        function setSidebarActive(tagUri) {
            var liObj = $("#" + tagUri);
            if (liObj.length > 0) {
                liObj.parent().parent().addClass("active");
                liObj.addClass("active");
            }
        }


        $(document).ready(function() {

            // 激活导航位置
            setSidebarActive("admin-datalist");

            // 列表按钮
            $("#dataList td input[type='checkbox']").iCheck({
                checkboxClass: 'icheckbox_square-blue',
                increaseArea: '20%'
            });
            // 全选操作
            $("#selall").click(function() {
                var clicks = $(this).is(':checked');
                if (!clicks) {
                    $("#dataList td input[type='checkbox']").iCheck("uncheck");
                } else {
                    $("#dataList td input[type='checkbox']").iCheck("check");
                }
                $(this).data("clicks", !clicks);
            });
        });
    </script>
</body>

</html>