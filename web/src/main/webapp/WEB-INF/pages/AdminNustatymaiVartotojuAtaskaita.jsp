<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>

    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Renginių paieškos ir rezervavimo informacinė sistema</title>

    <link href="../../resources/bootstrap/startbootstrap-grayscale-gh-pages/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">


    <link href="../../resources/bootstrap/startbootstrap-grayscale-gh-pages/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <script src="../../resources/bootstrap3_jquery_table_sortable-master/jquery.table-sort.js"></script>


    <link href="../../resources/bootstrap/startbootstrap-grayscale-gh-pages/css/grayscale.min.css" rel="stylesheet">


    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>


    <!--  -->


</head>

<body>

<nav class="navbar navbar-custom navbar-fixed" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                Menu <i class="fa fa-bars"></i>
            </button>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
            <ul class="nav navbar-nav">
                <li>
                    <a class="page-scroll" href="/Administratorius/">Grįžti į pagrindinį puslapį</a>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>





<container>
    <section id="contact" >
<div class="container-fluid">
    <div class="row">
        <body>
            <tr>
                <th></th>
                <th></th>
                <th></th>
                <th></th>

                <th></th>

                <th>
                    <header>

                  <h2>  REGISTRUOTŲ NARIŲ ATASKAITA:</h2>
                    </header>
                </th>
            </tr>

        <div >
            <table class="table">
                <thead >
                <tr >
                    <th>ID numeris</th>
                    <th>Vartotojo tipas</th>
                    <th>Vardas</th>
                    <th>Pavardė</th>
                    <th>lytis</th>
                    <th>Epastas</th>
                    <th>adresas</th>
                    <th>sukurimoData</th>
                    <th>arAktyvus</th>
                    <th>slaptazodis</th>
                    <th>Rezervacijų skaičius</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="vartotojas" items="${varto}" varStatus="status" >
                    <tr>
                        <td>${vartotojas.vartotojoKodas}</td>
                        <td>${tipai[status.index]}</td>
                        <td>${vartotojas.vardas}</td>
                        <td>${vartotojas.pavarde}</td>
                        <td>${lytis[status.index]}</td>
                        <td>${vartotojas.ePastas}</td>
                        <td>${vartotojas.adresas}</td>
                        <fmt:formatDate value="${vartotojas.sukurimoData}" var="date" pattern="yyyy-MM-dd"/>
                        <td>${date}</td>
                        <td>aktyvus</td>
                        <td>${vartotojas.slaptazodis}</td>
                        <td>${rezervSk[status.index]}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        </body>
    </div>
</div>
    </section>
    <h5>Iš viso registruotų narių: ${AsmenysSk}</h5>

</container>
<container>
<tr>
    <h5>Iš viso Rezervacijų: ${visosRezervSk}</h5>

</tr>
    <hr/>
<tr>

    <h5>Iš viso vartotojų: ${vartoSk}</h5>
    <h5>Iš viso Organizatoriu: ${orgaSk}</h5>
    <h5>Iš viso Administratorių: ${adminSk}</h5>
</tr>
    </container>
</body>



</html>