<%-- 
    Document   : fllwrcheck
    Created on : 9-Nov-2017, 12:25:07 AM
    Author     : Omair
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <title>Portfolio, 2 Column</title>

    <!-- Bootstrap Core CSS -->
    <link href="https://www.quackit.com/html/templates/download/bootstrap/portfolio-2-column/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS: You can use this stylesheet to override any Bootstrap styles and/or apply your own styles -->
    <link href="https://www.quackit.com/html/templates/download/bootstrap/portfolio-2-column/css/custom.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/newcss.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
        th, td {
            padding: 3px;
        }
        th {
            text-align: left;
        }
        table {
            border-spacing: 0px;
        }
        th {
            background-color: #167F92;
            color: white;
        }
        tr:nth-child(odd) {
            background-color:#fff;
            color: #167F92;
        }
        tr:nth-child(even) {
            background-color: #EAF3F3;
            color: #167F92;
        }
        th, td {
            border-bottom: 1px solid #ddd;
        }
        th, td {
            border-left: 1px solid #ddd;
        }
        input {
            display: flex;
            padding: 3px;
        }
        th {
            width: 200px;
        }
    </style>
    
</head>

<body>

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Logo and responsive toggle -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">
                	<span class="glyphicon glyphicon-fire"></span> 
                	Logo
                </a>
            </div>
            <!-- Navbar links -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="#">About</a>
                    </li>
                    <li>
                        <a href="#">Services</a>
                    </li>
                    <li class="active">
                        <a href="#">Portfolio</a>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="#">Contact</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Content -->
    <div class="container">

        <!-- Heading -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Portfolio
                    <small>Recent Work</small>
                </h1>
            </div>
        </div>
        <!-- /.row -->

        <!-- Projects Row -->
        <div class="row">
            <form class="a" action="fllwrcheckServ" method="post">
                Compare: <input type="text" id="city1" name="city1" placeholder="Location"/><br/>
                To:      <input type="text" id="city2" name="city2" placeholder="Toronto"/><br/>
                *If second field is left blank, Toronto will be used in place.</br>
                <input type="submit" value="Get Results"/>
            </form>
        </div>
        <br>
        <hr>
        <br>
        <div>
            <table align="left" style="width:65%">
                  <tr>
                    <th>Location:</th> <td>${a}</td> <td>${l}</td>
                  </tr>
                    <tr>
                    <th>Date And Time:</th> <td>${b}</td> <td>${m}</td>
                  </tr>
                    <tr>
                    <th>Conditions:</th> <td>${c}</td> <td>${n}</td>
                  </tr>
                    <tr>
                    <th>Temperature:</th> <td>${d}</td> <td>${o}</td>
                  </tr>
                    <tr>
                    <th>Chance Of Precipitation:</th> <td>${e}</td> <td>${p}</td>
                  </tr>
                    <tr>
                    <th>Humidity:</th> <td>${f}</td> <td>${q}</td>
                  </tr>
                    <tr>
                    <th>Wind Speed:</th> <td>${g}</td> <td>${r}</td>
                  </tr>
                    <tr>
                    <th>Today's High:</th> <td>${h}</td> <td>${s}</td>
                  </tr>
                    <tr>
                    <th>Today's Low:</th> <td>${i}</td> <td>${t}</td>
                  </tr>
                    <tr>
                    <th>Tomorrow's High:</th> <td>${j}</td> <td>${u}</td>
                  </tr>
                    <tr>
                    <th>Tomorrow's Low:</th> <td>${k}</td> <td>${v}</td>
                  </tr>
            </table>            
        </div>
        <!-- /.row -->

        <!-- Pagination -->
        <div class="row text-center">
            <div class="col-lg-12">
                <ul class="pagination">
                    <li>
                        <a href="#">&laquo;</a>
                    </li>
                    <li class="active">
                        <a href="#">1</a>
                    </li>
                    <li>
                        <a href="#">2</a>
                    </li>
                    <li>
                        <a href="#">3</a>
                    </li>
                    <li>
                        <a href="#">4</a>
                    </li>
                    <li>
                        <a href="#">5</a>
                    </li>
                    <li>
                        <a href="#">&raquo;</a>
                    </li>
                </ul>
            </div>
        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->
	
	<footer>
		<div class="footer-blurb">
			<div class="container">
				<div class="row">
					<div class="col-sm-4 footer-blurb-item">
						<img class="img-circle" src="http://lorempixel.com/100/100/people/3" alt="" width="100" height="100">
						<h3>My Stuff</h3>
						<p>Upon yielding, kind sea subdue very seed sixth them lesser one lesser there earth days were multiply so sixth gathering fifth that man fowl made.</p>
						<p><a class="btn btn-primary" href="#">More Stuff</a></p>
					</div>
					<div class="col-sm-4 footer-blurb-item">
						<img class="img-circle" src="http://lorempixel.com/100/100/people/1" alt="" width="100" height="100">
						<h3>Your Stuff</h3>
						<p>Upon yielding, kind sea subdue very seed sixth them lesser one lesser there earth days were multiply so sixth gathering fifth that man fowl made.</p>
						<p><a class="btn btn-primary" href="#">More Stuff</a></p>
					</div>
					<div class="col-sm-4 footer-blurb-item">
						<img class="img-circle" src="http://lorempixel.com/100/100/people/2" alt="" width="100" height="100">
						<h3>Our Stuff</h3>
						<p>Upon yielding, kind sea subdue very seed sixth them lesser one lesser there earth days were multiply so sixth gathering fifth that man fowl made.</p>
						<p><a class="btn btn-primary" href="#">More Stuff</a></p>
					</div>

				</div>
				<!-- /.row -->	
			</div>
        </div>
        
        <div class="copyright">
        	<div class="container">
        		<p>Copyright &copy; Example.com 2015</p>
        	</div>
        </div>
	</footer>

	
    <!-- jQuery -->
    <script src="https://www.quackit.com/html/templates/download/bootstrap/portfolio-2-column/js/jquery-1.11.3.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="https://www.quackit.com/html/templates/download/bootstrap/portfolio-2-column/js/bootstrap.min.js"></script>

</body>

</html>

