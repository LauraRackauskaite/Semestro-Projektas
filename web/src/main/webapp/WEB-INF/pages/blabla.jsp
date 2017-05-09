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


    <!--------------------------------------------------->
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Flexible Calendar</title>
    <meta name="description" content="Flexible Calendar with jQuery and CSS3" />
    <meta name="keywords" content="responsive, calendar, jquery, plugin, full page, flexible, javascript, css3, media queries" />
    <meta name="author" content="Codrops" />
    <link rel="shortcut icon" href="../favicon.ico">
    <link rel="stylesheet" type="text/css" href="../../resources/Calendario/css/calendar.css" />
    <link rel="stylesheet" type="text/css" href="../../resources/Calendario/css/custom_1.css" />
    <script src="../../resources/Calendario/js/modernizr.custom.63321.js"></script>
    <!---------------------------------------------------->
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
    <section id="registracija" class="content-section text-center">
    <div id="calendar" class="fc-calendar-container">
        <div class="fc-calendar fc-five-rows">
            <div class="fc-head">
                <div>pirma</div>
                <div>Tuesday</div>
                <div>Wednesday</div>
                <div>Thursday</div>
                <div>Friday</div>
                <div>Saturday</div>
                <div>Sunday</div>
            </div>
            <div class="fc-body">
                <div class="fc-row">
                    <div></div>
                    <div></div>
                    <div></div>
                    <div><span class="fc-date">1</span><span class="fc-weekday">Thu</span></div>
                    <div><span class="fc-date">2</span><span class="fc-weekday">Fri</span></div>
                    <div><span class="fc-date">3</span><span class="fc-weekday">Sat</span></div>
                    <div><span class="fc-date">4</span><span class="fc-weekday">Sun</span></div>
                </div>
                <div class="fc-row">
                    <!-- ... -->
                </div>
                <div class="fc-row">
                    <!-- ... -->
                </div>
                <div class="fc-row">
                    <!-- ... -->
                </div>
                <!-- ... -->
            </div>
        </div>
        </div>
    </Section>
</nav>
</body>
</html>