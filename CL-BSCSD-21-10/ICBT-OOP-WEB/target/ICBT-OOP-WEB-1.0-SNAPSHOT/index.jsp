<%-- 
    Document   : indexx
    Created on : Dec 20, 2020, 10:59:39 PM
    Author     : nsats
--%>

<%@page import="com.mycompany.icbt.oop.web.student"%>
<%@page import="com.mycompany.icbt.oop.web.web_helper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script
            src="https://code.jquery.com/jquery-3.5.1.min.js"
            integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="
            crossorigin="anonymous">
        </script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.css">
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.js"></script>
        <link rel="stylesheet" type="text/css" href="index.css">
        <link rel="stylesheet" href="fontawesome.min.css">
        <title>Home Page</title>
    </head>
    <body background="back.png">
        <%            
           
         student[] students = web_helper.getStudents();
            
            out.print("<br>");
            out.print("<img src='cardiff.png'/>");
            out.print("<br>");
            out.print("<br>");
            out.print("<br>");
            out.print("<div class='table-users'>");
            out.print("<div class='header'");
            out.print("<a class='fas fa-home'>" + web_helper.getGreeting() + "</a>");
            out.print("</div>");
            out.print("<table id='student-tbl' class='display' cellspacing='0'>");
            out.print("<thead><tr><th>Student Number</th><th>Student Name</th><th>NIC Number</th></tr></thead>");
            out.print("<tbody>");
            for(student st : students) {
                
                    out.print("<tr>");
                    out.print("<td>" + st.getId() +"</td>");
                    out.print("<td>" + st.getName()+"</td>");
                    out.print("<td>" + st.getNic()+"</td>");
                    out.print("</tr>");
            }
            out.print("</tbody>");
            out.print("</table>");
            out.print("</div>");
        %>
        
        <script>
            $(document).ready( function () {
                $('#student-tbl').DataTable();
            } );
        </script>
    
    </body>
</html>
