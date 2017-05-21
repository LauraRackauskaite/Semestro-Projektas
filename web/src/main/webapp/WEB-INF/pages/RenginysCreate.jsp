<!DOCTYPE html>
<html lang="en">

<head>

    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Renginių paieškos ir rezervavimo informacinė sistema</title>

    <!-- Bootstrap Core CSS -->
    <link href="../../resources/bootstrap/startbootstrap-grayscale-gh-pages/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../../resources/bootstrap/startbootstrap-grayscale-gh-pages/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">

    <!-- Theme CSS -->
    <link href="../../resources/bootstrap/startbootstrap-grayscale-gh-pages/css/grayscale.min.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link type="text/css" href="css/bootstrap.min.css" />
    <link type="text/css" href="css/bootstrap-timepicker.min.css" />
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/bootstrap-timepicker.min.js"></script>


</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">

<script type="text/javascript">
    $('#timepicker3').timepicker({
        minuteStep: 5,
        showInputs: false,
        disableFocus: true
    });
</script>
<!-- Navigation -->
<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                Menu <i class="fa fa-bars"></i>
            </button>
            <a class="navbar-brand page-scroll" href="#page-top">
                <i class="fa fa-play-circle"></i> <span class="light">Renginių</span> IS
            </a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
            <ul class="nav navbar-nav">
                <!-- Hidden li included to remove active class from about link when scrolled up past about section -->
                <li class="hidden">
                    <a href="#page-top"></a>
                </li>
                <li>
                    <a class="page-scroll" href="/RenginysCreate">Sukurti renginį</a>
                </li>
                <li>
                    <a class="page-scroll" href="/nustatymai">Nustatymai</a>
                </li>
                <li>
                    <a class="page-scroll" href="#about">Apie</a>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>

<section id="renginioRegistracjia" class="content-section text-center">
    <form action='/sukurimas' method="post">
        <div class="col-lg-8 col-lg-offset-2">
            <h2>Norėdami užregistruoti naują renginį užpildykite formą</h2>
            <div class="form-group row">
                <label for="pavadinimas" class="col-sm-2 col-form-label">Renginio pavadinimas</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" id="pavadinimas" name="pavadinimas" >
                </div>
            </div>
            <div class="form-group row">
                <label for="data" class="col-sm-2 col-form-label">Renginio data</label>
                <div class="col-sm-3">
                    <input type="date" class="form-control" id="data" name="data" >
                </div>
            </div>
            <div class="form-group row">
                <label for="laikas" class="col-sm-2 col-form-label">Renginio pradžios laikas</label>
                <div class="col-sm-3">
                    <input type="time" class="form-control" id="laikas" name="laikas">
                </div>
            </div>
            <div class="form-group row">
                <label for="trukme" class="col-sm-2 col-form-label">Renginio Trukmė</label>
                <div class="col-sm-3">
                    <input type="time" class="form-control" id="trukme" name="trukme">
                </div>
            </div>
            <div class="form-group">
                <label for="aprasymas">Trumpas aprašymmas</label>
                <textarea class="form-control" rows="5" id="aprasymas"></textarea>
            </div>

        </div>
            <button id="loginButton" class="btn btn-default btn-lg"  class="form-control">Registruoti</button>
            <br><br>
            <div class="label">
                <font color="red" size="3"><b>${existError}</b></font>
            </div>
        </div>
        <br>
        <br>
    </form>
</section>
</body>

</html>
