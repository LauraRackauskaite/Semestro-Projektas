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
    <script src="../../resources/bootstrap3_jquery_table_sortable-master/jquery.table-sort.js"></script>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <link href="../../resources\event_list\Event_list.css" rel="stylesheet" type="text/css">


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
                    <a class="page-scroll" href="/nustatymai">nustatymai</a>
                </li>
                <li>
                    <a class="page-scroll" href="#about">About</a>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>

<container>
    <section id="contact" class="container content-section text-center">
        <div class="container-fluid">

            <div class="row">
                <div class=" col-md-push-2 col-md-7">
                    <table class="table" >
                        <thead >
                        <tr>

                            <th> Renginio kodas</th>
                            <th> Renginio pavadinimas</th>
                        </tr>

                        <c:forEach items="${renginiai}" var="renginys" varStatus="status">
                            <tr>
                                <td>${renginys.renginioKodas}</td>
                                <td>${renginys.pavadinimas}</td>
                            </tr>
                        </c:forEach>
                        </thead>
                    </table>
                </div>
            </div>
        </div>
    </section>
</container>





</body>

</html>
