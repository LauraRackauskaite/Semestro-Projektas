<!DOCTYPE html>
<html lang="en">
<html>
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
</head>
<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">

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
                    <a class="page-scroll" href="#about">About</a>
                </li>
                <li>
                    <a class="page-scroll" href="#download">Download</a>
                </li>
                <li>
                    <a class="page-scroll" href="#contact">Contact</a>
                </li>
                <li>
                    <a class="page-scroll" href="#Prisijungti">Prisijungti</a>
                </li>
                <li>
                    <a class="page-scroll" href="/registracija/">Registracija</a>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>
<section id="registracija" class="content-section text-center">
    <div class="Prisijungti-section">
        <div class="container">
            <div class="col-lg-8 col-lg-offset-2">
                <h2>Norėdami užsiregistruoti užpildikyte pateiktą formą</h2>
                <div class="form-group row">
                    <%--@declare id="tipas"--%><label for="tipas" class="col-sm-2 col-form-label">Vartotojo tipas </label>
                    <div class="col-lg-6">
                        <div class="form-check">
                            <div class="text-left">
                                <label class="form-check-label">
                                    <input class="form-check-input" type="radio" name="gridRadios" id="tipas1" value="1" checked>
                                    Paprastas vartotojas
                                </label>
                                <label class="form-check-label">
                                    <input class="form-check-input" type="radio" name="gridRadios" id="tipas2" value="2" checked>
                                    Renginių administratorius
                                </label>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="vardas" class="col-sm-2 col-form-label">Vartotojo vardas</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="vardas">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="pavarde" class="col-sm-2 col-form-label">Vartotojo pavardė</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="pavarde">
                    </div>
                </div>
                <div class="form-group row">
                    <%--@declare id="lytis"--%><label for="lytis" class="col-sm-2 col-form-label">Lytis </label>
                        <div class="col-lg-2">
                        <div class="form-check">
                            <div class="text-left">
                            <label class="form-check-label">
                                <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="1" checked>
                                Vyras
                            </label>
                            <label class="form-check-label">
                                <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="2" checked>
                                Moteris
                            </label>
                            </div>
                        </div>
                        </div>
                </div>
                <div class="form-group row">
                    <label for="adresas" class="col-sm-2 col-form-label">Adresas</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="adresas">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="epastas" class="col-sm-2 col-form-label">Elektroninis paštas</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="epastas">
                    </div>
                </div>
                <a href="/registracija/" class="btn btn-default btn-lg">Registruotis</a>
            </div>
        </div>
    </div>
</section>
</body>
</html>
