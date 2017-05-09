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
                    <a class="page-scroll" href="#Prisijungti">NEveik</a>
                </li>
                <li>
                    <a class="page-scroll" href="/registracija/">Registracija</a>
                </li>
                <li>
                    <a class="page-scroll" href="/login/">Prisijungti</a>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>

<!-- Intro Header -->
<header class="intro">
    <div class="intro-body">
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <h1 class="brand-heading">Renginių rezervavimo ir paieškos IS</h1>
                    <p class="intro-text">Susirask renginį ir užsirezervuok vietą dabar;)
                        <br>Sukurta Grupės Trepsiukai</p>
                    <a href="#about" class="btn btn-circle page-scroll">
                        <i class="fa fa-angle-double-down animated"></i>
                    </a>
                </div>
            </div>
        </div>
    </div>
</header>

<!-- About Section -->
<section id="about" class="container content-section text-center">
    <div class="row">
        <div class="col-lg-8 col-lg-offset-2">
            <h2>Apie Projektą</h2>
            <p>bla bla bla kazkas bus </p>
        </div>
    </div>
</section>

<!-- Download Section -->
<section id="download" class="content-section text-center">
    <div class="download-section">
        <div class="container">
            <div class="col-lg-8 col-lg-offset-2">
                <h2>Download `rayscale</h2>
                <p>You can download Grayscale for free on the preview page at Start Bootstrap.</p>
                <a href="http://startbootstrap.com/template-overviews/grayscale/" class="btn btn-default btn-lg">Visit Download Page</a>
            </div>
        </div>
    </div>
</section>



<!-- Prisijungti Section -->
<section id="Prisijungti" class="content-section text-center">

    <div class="Prisijungti-section">
        <div class="container">
            ${loginError}
            <form class="col-lg-8 col-lg-offset-2">
                <h2>Norėdami prisijungti prie paskyros suveskite duomenis</h2>
                <form action="/login" method="post">
                    <div class="form-group row">
                        <label for="epastas" class="col-sm-2 col-form-label">Elektroninis paštas</label>
                        <div class="col-sm-6">
                            <input type="text" id="epastas" name="epastas" placeholder="" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="slaptazodis" class="col-sm-2 col-form-label">Slaptažodis</label>
                        <div class="col-sm-6">
                            <input type="text" id="slaptazodis" name="slaptazodis" placeholder="" class="form-control"/>
                        </div>
                    </div>
                    <button id="loginButton" class="btn btn-default btn-lg" class="form-control"> Prisijungti</button>
                </form>>
            </form>
        </div>
    </div>
</section>


<!-- Contact Section -->
<section id="contact" class="container content-section text-center">
    <div class="row">
        <div class="col-lg-8 col-lg-offset-2">
            <h2>Contact Start Bootstrap</h2>
            <p>Feel free to email us to provide some feedback on our templates, give us suggestions for new templates and themes, or to just say hello!</p>
            <p><a href="mailto:feedback@startbootstrap.com">feedback@startbootstrap.com</a>
            </p>
            <ul class="list-inline banner-social-buttons">
                <li>
                    <a href="https://twitter.com/SBootstrap" class="btn btn-default btn-lg"><i class="fa fa-twitter fa-fw"></i> <span class="network-name">Twitter</span></a>
                </li>
                <li>
                    <a href="https://github.com/IronSummitMedia/startbootstrap" class="btn btn-default btn-lg"><i class="fa fa-github fa-fw"></i> <span class="network-name">Github</span></a>
                </li>
                <li>
                    <a href="https://plus.google.com/+Startbootstrap/posts" class="btn btn-default btn-lg"><i class="fa fa-google-plus fa-fw"></i> <span class="network-name">Google+</span></a>
                </li>
            </ul>
        </div>
    </div>
</section>

<!-- Footer -->
<footer>
    <div class="container text-center">
        <p>Copyright &copy; Your Website 2016</p>
    </div>
</footer>

<!-- jQuery -->
<script src="../../resources/bootstrap/startbootstrap-grayscale-gh-pages/vendor/jquery/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../../resources/bootstrap/startbootstrap-grayscale-gh-pages/vendor/bootstrap/js/bootstrap.min.js"></script>

<!-- Plugin JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

<!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCRngKslUGJTlibkQ3FkfTxj3Xss1UlZDA&sensor=false"></script>

<!-- Theme JavaScript -->
<script src="../../resources/bootstrap/startbootstrap-grayscale-gh-pages/js/grayscale.min.js"></script>


</body>

</html>


