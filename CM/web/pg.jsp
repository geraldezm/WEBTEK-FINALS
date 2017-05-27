<%-- 
    Document   : pg
    Created on : 05 25, 17, 4:11:22 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/style.css" type="text/css"/>
        <link rel="stylesheet" href="styles/style2.css" type="text/css"/>
        <link rel="stylesheet" href="styles/navigation.css" type="text/css"/>
        <title>JSP Page</title>
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
                    <a href="requestpawgroom.jsp">PawGroom</a>
                    <a href="requestpawmed.jsp">PawMed</a>
                </div>
                </li>
                <li><a href="index.jsp">HOME</a></li>
               
            </ul>
        </nav>
        </div>
        
        <div id="container4">
    				<div id="container3">
        				<div id="container2">
            				<div id="container1">
						        <div id="col1">
						            <!-- Column one start -->
						            <h2>Grooming</h2>
						            <img src ="images/Petcessories/soap1.jpg" alt = "groom" style="width:80%"/>
						            <li>For pets who needs haircut.</li>
						            <h3>Service Includes</h3>
						            <li> Ear Cleaning</li>
						            <li> Anal Gland Cleaning </li>
						            <li> Shampooing</li>
						            <!-- Column one end -->
						        </div>
						        <div id="col2">
						            <!-- Column two start -->
						            <h2>Bathing</h2>
						            <img src ="images/Petcessories/hygiene.jpg" alt = "Bathing" style="width:80%"/>
						            <li>Refresh your pets.</li>
						            <h3>Service Includes</h3>
						            <li>Shampooing</li>
						            <li> Hot Oil </li>
						            <!-- Column two end -->
						        </div>
						        <div id="col3">
						            <!-- Column three start -->
						            <h2>Clothing</h2>
						            <img src ="images/Petcessories/costumes.jpg" alt = "Clothing" style="width:80%"/>
						            <li>For you fashionista styling needs.</li>
						            <h3>Service Includes</h3>
						            <li> Costume</li>
						            <li> Shoes </li>
						            <li> Ribbons </li>
						            <!-- Column three end -->
						        </div>
						        <div id="col4">
						            <!-- Column four start -->
						            <h2>Brush</h2>
						            <img src ="images/Petcessories/pettoothbrush-toothpaste.jpg" alt = "Clothing" style="width:80%"/>
						            <li>Dont let tangled hairs on your pets</li>
						            <h3> Service Includes </h3>
						            <li> Hair Brushing </li> 
						            <!-- Column four end -->
						        </div>
						        <!-- End Of Container 1 -->
            				</div>
            				<!-- End Of Container 2 -->
        				</div>
        				<!-- End Of Container 3 -->
    				</div>
    				<!-- End Of Container 4 -->
				</div>

    </body>
</html>
