 
<%-- 
    Document   : request
    Created on : 05 15, 17, 9:16:58 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.io.*, java.sql.*, java.util.Date, java.util.Calendar"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Request Sent</title>
        <link rel="stylesheet" href="styles/style.css">
        <link rel="stylesheet" href="styles/navigation.css" type="text/css"/>
        <Link rel="icon" href="styles/images/icon.png">
        <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="HandheldFriendly" content="true">
    </head>
    <body>
        
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
        
        <h1>Your request has been sent!</h1>

        
          <%
         
     
          //String yr = request.getParameter("appYear");
          //String mo = request.getParameter("appMonth");
          //String dy = request.getParameter("appDay");
          
        
          
         // String date = yr + "-" + mo + "-" + dy;

              Class.forName("com.mysql.jdbc.Driver");
              Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare","root","");
              
             
                  
              
              String sql="INSERT INTO servicerequest (servicereq_status,service_description, service_price , servicereqdate, servicereq_CustomerId)"
                            + "VALUES ('Pending', 'Nail Trimming', 100, '2017-07-10', 34)";

              Statement st=con.createStatement();
              
              int i=st.executeUpdate(sql);
      
              //out.print("Service: " + request.getParameter("service"));
              //out.print("Date: " + date);
              //out.print("Price: 100");
              
              
              
       %>
        
        
        
            
        
    </body>
</html>

