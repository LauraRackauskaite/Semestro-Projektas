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

    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

</head>



<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">



<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                Menu <i class="fa fa-bars"></i>
            </button>
            <a class="navbar-brand page-scroll" href="/Vartotojas/">
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
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>

<div class="container">
    <div class="row">
        <div class="col-md-10 ">
            <form class="form-horizontal" action="/nustatymai" method="post">
                <fieldset>

                    <!-- Form Name -->
                    <legend>Vartotojo nustatymų redagavimas</legend>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="vardas">Vardas</label>
                        <div class="col-md-4">
                    <div class="input-group">
                     <div class="input-group-addon">
                    <i class="fa fa-user">
                     </i>
                    </div>
                     <input id="vardas" name="vardas" type="text" class="form-control </input-md" placeholder=${modelVardas} >
                  </div>
                </div>
            </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="pavarde">Pavardė</label>
                        <div class="col-md-4">
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <i class="fa fa-user">
                                    </i>
                                </div>
                                <input id="pavarde" name="pavarde" type="text" class="form-control input-md" placeholder=${modelPavarde} >
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="adresas">Adresas</label>
                        <div class="col-md-4">
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <i class="fa fa-street-view"></i>

                                </div>
                                <input id="adresas" name="adresas" type="text" class="form-control input-md" placeholder=${modelAdresas} >
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="telefonas">Telefonas</label>
                        <div class="col-md-4">
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <i class="fa fa-phone"></i>

                                </div>
                                <input id="telefonas" name="telefonas" type="text" placeholder="" class="form-control input-md">

                            </div>


                        </div>
                    </div>


<div class="form-group">
    <label class="col-md-4 control-label" ></label>
    <div class="col-md-4">
        <button type="submit" class="btn btn-success" value="Button 1"><span class="glyphicon glyphicon-thumbs-up"></span> Patvirtinti</button>
        <button type="submit" class="btn btn-danger" value="Button 2"><span class="glyphicon glyphicon-remove-sign"></span> Atšaukti</button>
    </div>
</div>
                </fieldset>
</form>
</div>

<div class="col-md-2 ">
    <img src="http://websamplenow.com/30/userprofile/images/avatar.jpg" class="img-responsive img-thumbnail ">
    <button class="btn btn-danger" class="btn btn-danger"  onclick="myFunction()">Ištrinti</button>

    <p id="demo"></p>

    <script>
        function myFunction() {
            if (confirm("Ar  tikrai norite ištrinti save") == true) {
                document.getElementById("istrinti").submit();
            } else {
            }
            document.getElementById("demo").innerHTML = txt;
        }
    </script>
</div>
        <form id="istrinti" name="istrinti" action="/istrinimas" method="post"></form>
    </div>
</div>
<!-- jQuery Version 1.11.1 -->
<script src="js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>
</body>

</html>