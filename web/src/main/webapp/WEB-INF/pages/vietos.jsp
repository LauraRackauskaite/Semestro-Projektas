<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="customtags" tagdir="/WEB-INF/tags" %>
<customtags:pageTemplate>
    <html>
    <head>
        <style>
            table, th, td {
                border: 2px solid black;
            }
        </style>
    </head>
    <body>
    <font color="black">
        <table>
            <tr>
                <th>id</th>
                <th>Vardas</th>
                <th>Pavardė</th>
                <th>Darbo stažas</th>
                <th>Egzaminuoja kategorijas</th>
            </tr>
            <c:forEach var="vietos" items="${vietos}">
                <tr>
                    <td>${vietos.vietosNumeris}</td>
                    <td>${vietos.gatvesPavadinimas}</td>
                    <td>${vietos.namoNumeris}</td>
                    <td>${vietos.miestas}</td>
                </tr>
            </c:forEach>
        </table>
    </font>
    </body>
    </html>
    <font color="white">
        <p>Regetros instruktoriai</p>
    </font>
    <div align="right">
        <font color="white">
            <footer>
            </footer>
        </font>
    </div>
</customtags:pageTemplate>