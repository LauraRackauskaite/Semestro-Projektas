<!DOCTYPE html>
<!--[if IE 9]><html class="no-js ie9"><![endif]-->
<!--[if gt IE 9]><!--><html class="no-js"><!--<![endif]-->
<head>
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
</head>
<body>
<div class="container">
    <div class="custom-calendar-wrap custom-calendar-full">
        <div class="custom-header clearfix">
            <h2>Renginių kalendorius <span><span>kkk</span> | <a href="../../resources/Calendario/index2.html">Demo 2</a></span></h2>
            <h3 class="custom-month-year">
                <span id="custom-month" class="custom-month"></span>
                <span id="custom-year" class="custom-year"></span>
                <nav>
                    <span id="custom-prev" class="custom-prev"></span>
                    <span id="custom-next" class="custom-next"></span>
                    <span id="custom-current" class="custom-current" title="Got to current date"></span>
                    <span id="custom-aveik" class="custom-aveik"></span>
                </nav>
            </h3>
        </div>
        <div id="calendar" class="fc-calendar-container"></div>
    </div>
</div><!-- /container -->
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script type="text/javascript" src="../../resources/Calendario/js/jquery.calendario.js"></script>
<script type="text/javascript" src="../../resources/Calendario/js/data.js"></script>
<script type="text/javascript">
    $(function() {

        var cal = $( '#calendar' ).calendario( {
                onDayClick : function( $el, $contentEl, dateProperties ) {

                    for( var key in dateProperties ) {
                        console.log( key + ' = ' + dateProperties[ key ] );
                    }

                },
                caldata : codropsEvents
            } ),
            $month = $( '#custom-month' ).html( cal.getMonthName() ),
            $year = $( '#custom-year' ).html( cal.getYear() );

        $( '#custom-next' ).on( 'click', function() {
            cal.gotoNextMonth( updateMonthYear );
        } );
        $( '#custom-prev' ).on( 'click', function() {
            cal.gotoPreviousMonth( updateMonthYear );
        } );
        $( '#custom-current' ).on( 'click', function() {
            cal.gotoNow( updateMonthYear );
        } );

        function updateMonthYear() {
            $month.html( cal.getMonthName() );
            $year.html( cal.getYear() );
        }

        // you can also add more data later on. As an example:
        $( '#custom-aveik' ).on( 'click', function() {

         cal.setData( {
         '05-09-2017' : '<a href="#">testingdasdasdasddasdddddddddddddddddddddddddddddddddddddddddddddddddddddd</a>',
         '05-10-2017' : '<a href="#">testing</a>',
         '05-12-2017' : '<a href="#">testing</a>'
         } );
         // goes to a specific month/year
         //cal.goto( 3, 2013, updateMonthYear );

         } );
       var stringDate = "05-15-2017";
       var eventInfo = "asdasdasdsad";
        var jsonData = "{\"" + stringDate + "\": \"<div class='event' '>" +eventInfo+ "</div>\"}";
        cal.setData(JSON.parse(jsonData));

    });
</script>
</body>
</html>
