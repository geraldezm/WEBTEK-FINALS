<%-- 
    Document   : index.jsp
    Created on : 05 8, 17, 4:13:44 PM
    Author     : s326lab
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Request</title>
        <link rel="stylesheet" href="styles/style.css">
        <link rel="stylesheet" href="styles/navigation.css" type="text/css"/>
        <Link rel="icon" href="styles/images/icon.png">
        <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="HandheldFriendly" content="true">
    </head>
    
    <body class="pawgroom-request">
        
          <div id= "nav">
        <nav>
            <ul class="nav nav-right nav fixed">
            
            <li> <form class="search" method="post" action="search.jsp">
                    <input type="text" name="search" placeholder="Search.."/>
            </form></li>
            
             
                
                <li class="dropdown">
                <a href="#" class="dropbtn">SERVICES</a>
                <div class="dropdown-content">
                    <a href="pawgroom.jsp">PawGroom</a>
                    <a href="pawmed.jsp">PawMed</a>
                </div>
                </li>
                <li><a href="index.jsp">HOME</a></li>
               
            </ul>
        </nav>
        </div>
        
        <div class="request">
        <form class="request-service" method="post" action="request.jsp">
        <h2>Services</h2>
        <input type="radio" name="service" value="Nail Trim"/>Nail Trim<br>
        <input type="radio" name="service" value="Teeth brushing"/>Brushing of teeth<br>
        <input type="radio" name="service" value="Haircut"/>Haircut<br>
        <input type="radio" name="service" value="Bath"/>Bath and Blowdry<br>
        <input type="radio" name="service" value="Pedicure"/>Pedicure<br>
        <input type="radio" name="service" value="Ear cleaning"/>Ear Cleaning<br>
        </form>   
    
        
        <form action="request.jsp">
        <h2>Date of Appointment</h2>
        Enter Month: (e.g. month: January = 01)
        <input type="text" name="appMonth" value="month" ><br/>
        
        Day of month:<input type="text" name="appDay" value="day" ><br/>
        
        Year:<input type="text"  name="appYear" value="year"><br/>
        </form><br>
        
        <form action="request.jsp">
        <h2>Time of Appointment</h2>
        
        <input type="time" name="appointmentTime" value="time">
        
        </form><br>
        
        <form class="request-service" method="post" action="request.jsp"/>
            <input type="submit" class="button" name="submit" placeholder="Type service/s here..."/>
        </form>
    
        </div>
      
    </body>
   
    
</html>
