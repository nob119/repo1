<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>基础性素质</title>
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
    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                基础性素质
            </h1>

        </section>

        <!-- Main content -->
        <section class="content">
            <div class="row">
                <form method="post" id="basicQualityForm">

                <!-- left column -->
                <div class="col-md-6">
                    <!-- general form elements -->
                    <div class="box box-primary">
                        <% String studentId = request.getParameter("id"); %>
                        <input type="hidden" name="studentId" value="<%=studentId%>">
                        <div class="box-header with-border">
                            <h3 class="box-title">思想政治</h3>
                        </div>
                        <div class="box-body">
                            <div class="form-group">
                                <label>政治表现:</label>
                                <input class="form-control" name="politicalPerformance" id="politicalPerformance" type="text" placeholder="满分10分">
                            </div>

                            <div class="form-group">
                                <label>法制意识:</label>
                                <input class="form-control" name="legalAwareness" id="legalAwareness" type="text" placeholder="满分10分">
                            </div>

                            <div class="form-group">
                                <label>道德品质:</label>
                                <input class="form-control" name="moralCharacter" id="moralCharacter" type="text" placeholder="满分10分">
                            </div>
                        </div>

                    <!-- /.box-body -->

                    <!-- /.box -->

                    <div class="box box-primary">


                        <!-- Form Element sizes -->

                        <div class="box-header with-border">
                            <h3 class="box-title">文明状况</h3>
                        </div>
                        <div class="box-body">
                            <input class="form-control" name="civilization" id="civilization" type="text" placeholder="满分50分">
                            <br>
                        </div>

                    <div class="box box-primary">


                        <!-- Form Element sizes -->

                        <div class="box-header with-border">
                            <h3 class="box-title">身体素质</h3>
                        </div>
                        <div class="box-body">
                            <input class="form-control" name="physicalFitness" id="physicalFitness" type="text" placeholder="满分20分">

                        </div>


                </div>
                <!-- /.box-body -->


                        <div class="box-footer">
                            <div id="errorMsg" style="color:red;text-align:left"></div>
                            <button type="submit" class="btn btn-info pull-right">提交</button>
                        </div>
                </form>
            </div>
            <!--/.col (right) -->


        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->
    <!-- 内容区域 /-->


</div>


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

    window.onload=function(){
        document.getElementById("politicalPerformance").value='${basicQualityScore.politicalPerformance}';
        document.getElementById("civilization").value='${basicQualityScore.civilization}';
        document.getElementById("legalAwareness").value='${basicQualityScore.legalAwareness}';
        document.getElementById("moralCharacter").value='${basicQualityScore.moralCharacter}';
        document.getElementById("physicalFitness").value='${basicQualityScore.physicalFitness}';
    }

    function checkPoliticalPerformance() {
        var politicalPerformance = $("#politicalPerformance").val();
        if(politicalPerformance <= 10){
            //满足条件
            $("#politicalPerformance").css("border","");
            return true;
        }else {
            //不满足条件
            $("#politicalPerformance").val("");
            $("#politicalPerformance").css("border","1px solid red");
            $("#politicalPerformance").focus();
            $("#errorMsg").html("请填写一个小于10的数值");
            return false;
        }
    }

    function checkLegalAwareness() {
        var legalAwareness = $("#legalAwareness").val();
        if(legalAwareness <= 10){
            //满足条件
            $("#legalAwareness").css("border","");
            return true;
        }else {
            //不满足条件
            $("#legalAwareness").val("");
            $("#legalAwareness").css("border","1px solid red");
            $("#legalAwareness").focus();
            $("#errorMsg").html("请填写一个小于10的数值");
            return false;
        }
    }

    function checkMoralCharacter() {
        var moralCharacter = $("#moralCharacter").val();
        if(moralCharacter <= 10){
            //满足条件
            $("#moralCharacter").css("border","");
            return true;
        }else {
            //不满足条件
            $("#moralCharacter").val("");
            $("#moralCharacter").css("border","1px solid red");
            $("#moralCharacter").focus();
            $("#errorMsg").html("请填写一个小于10的数值");
            return false;
        }
    }

    function checkCivilization() {
        var civilization = $("#civilization").val();
        if(civilization <= 50){
            //满足条件
            $("#civilization").css("border","");
            return true;
        }else {
            //不满足条件
            $("#civilization").val("");
            $("#civilization").css("border","1px solid red");
            $("#civilization").focus();
            $("#errorMsg").html("请填写一个小于10的数值");
            return false;
        }
    }

    function checkPhysicalFitness() {
        var physicalFitness = $("#physicalFitness").val();
        if(physicalFitness <= 20){
            //满足条件
            $("#physicalFitness").css("border","");
            return true;
        }else {
            //不满足条件
            $("#physicalFitness").val("");
            $("#physicalFitness").css("border","1px solid red");
            $("#physicalFitness").focus();
            $("#errorMsg").html("请填写一个小于10的数值");
            return false;
        }
    }

    $(function () {
        //表单提交之前对所有的信息进行校验
        $("#basicQualityForm").submit(function () {
            if(checkPoliticalPerformance() && checkCivilization() && checkLegalAwareness() &&
        checkMoralCharacter() && checkPhysicalFitness()){
                $.ajax({
                    url : "${pageContext.request.contextPath}/scores/addBasicQualityEval",
                    type : "POST",
                    dataType : "JSON",
                    data : $("#basicQualityForm").serialize()
                });
            }
            return false;
        });

    });

    function GetRequest() {
        var url = location.search; //获取url中"?"符后的字串
        var theRequest = new Object();
        if (url.indexOf("?") != -1) {
            var str = url.substr(1);
            strs = str.split("&");
            for(var i = 0; i < strs.length; i ++) {
                theRequest[strs[i].split("=")[0]]=unescape(strs[i].split("=")[1]);
            }
        }
        return theRequest;
    }


    // 设置激活菜单
    function setSidebarActive(tagUri) {
        var liObj = $("#" + tagUri);
        if (liObj.length > 0) {
            liObj.parent().parent().addClass("active");
            liObj.addClass("active");
        }
    }


    // 激活导航位置
    setSidebarActive("form-general");
</script>
</body>

</html>