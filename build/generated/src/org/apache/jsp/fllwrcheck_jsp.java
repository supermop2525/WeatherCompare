package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fllwrcheck_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("\n");
      out.write("    <title>Portfolio, 2 Column</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"https://www.quackit.com/html/templates/download/bootstrap/portfolio-2-column/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS: You can use this stylesheet to override any Bootstrap styles and/or apply your own styles -->\n");
      out.write("    <link href=\"https://www.quackit.com/html/templates/download/bootstrap/portfolio-2-column/css/custom.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/newcss.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    <style>\n");
      out.write("        th, td {\n");
      out.write("            padding: 3px;\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            border-spacing: 0px;\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            background-color: #167F92;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        tr:nth-child(odd) {\n");
      out.write("            background-color:#fff;\n");
      out.write("            color: #167F92;\n");
      out.write("        }\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("            background-color: #EAF3F3;\n");
      out.write("            color: #167F92;\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            border-bottom: 1px solid #ddd;\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            border-left: 1px solid #ddd;\n");
      out.write("        }\n");
      out.write("        input {\n");
      out.write("            display: flex;\n");
      out.write("            padding: 3px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Navigation -->\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- Logo and responsive toggle -->\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                \t<span class=\"glyphicon glyphicon-fire\"></span> \n");
      out.write("                \tLogo\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Navbar links -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">About</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Services</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"active\">\n");
      out.write("                        <a href=\"#\">Portfolio</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Contact</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <!-- Content -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <!-- Heading -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <h1 class=\"page-header\">Portfolio\n");
      out.write("                    <small>Recent Work</small>\n");
      out.write("                </h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.row -->\n");
      out.write("\n");
      out.write("        <!-- Projects Row -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <form class=\"a\" action=\"fllwrcheckServ\" method=\"post\">\n");
      out.write("                Compare: <input type=\"text\" id=\"city1\" name=\"city1\" placeholder=\"Location\"/><br/>\n");
      out.write("                To:      <input type=\"text\" id=\"city2\" name=\"city2\" placeholder=\"Toronto\"/><br/>\n");
      out.write("                *If second field is left blank, Toronto will be used in place.</br>\n");
      out.write("                <input type=\"submit\" value=\"Get Results\"/>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <hr>\n");
      out.write("        <br>\n");
      out.write("        <div>\n");
      out.write("            <table align=\"left\" style=\"width:65%\">\n");
      out.write("                  <tr>\n");
      out.write("                    <th>Location:</th> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <th>Date And Time:</th> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <th>Conditions:</th> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <th>Temperature:</th> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <th>Chance Of Precipitation:</th> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <th>Humidity:</th> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${q}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <th>Wind Speed:</th> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${g}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${r}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <th>Today's High:</th> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${h}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <th>Today's Low:</th> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <th>Tomorrow's High:</th> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${j}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <th>Tomorrow's Low:</th> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td> <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("            </table>            \n");
      out.write("        </div>\n");
      out.write("        <!-- /.row -->\n");
      out.write("\n");
      out.write("        <!-- Pagination -->\n");
      out.write("        <div class=\"row text-center\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <ul class=\"pagination\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">&laquo;</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"active\">\n");
      out.write("                        <a href=\"#\">1</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">2</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">3</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">4</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">5</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">&raquo;</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.row -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("\t\n");
      out.write("\t<footer>\n");
      out.write("\t\t<div class=\"footer-blurb\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4 footer-blurb-item\">\n");
      out.write("\t\t\t\t\t\t<img class=\"img-circle\" src=\"http://lorempixel.com/100/100/people/3\" alt=\"\" width=\"100\" height=\"100\">\n");
      out.write("\t\t\t\t\t\t<h3>My Stuff</h3>\n");
      out.write("\t\t\t\t\t\t<p>Upon yielding, kind sea subdue very seed sixth them lesser one lesser there earth days were multiply so sixth gathering fifth that man fowl made.</p>\n");
      out.write("\t\t\t\t\t\t<p><a class=\"btn btn-primary\" href=\"#\">More Stuff</a></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4 footer-blurb-item\">\n");
      out.write("\t\t\t\t\t\t<img class=\"img-circle\" src=\"http://lorempixel.com/100/100/people/1\" alt=\"\" width=\"100\" height=\"100\">\n");
      out.write("\t\t\t\t\t\t<h3>Your Stuff</h3>\n");
      out.write("\t\t\t\t\t\t<p>Upon yielding, kind sea subdue very seed sixth them lesser one lesser there earth days were multiply so sixth gathering fifth that man fowl made.</p>\n");
      out.write("\t\t\t\t\t\t<p><a class=\"btn btn-primary\" href=\"#\">More Stuff</a></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4 footer-blurb-item\">\n");
      out.write("\t\t\t\t\t\t<img class=\"img-circle\" src=\"http://lorempixel.com/100/100/people/2\" alt=\"\" width=\"100\" height=\"100\">\n");
      out.write("\t\t\t\t\t\t<h3>Our Stuff</h3>\n");
      out.write("\t\t\t\t\t\t<p>Upon yielding, kind sea subdue very seed sixth them lesser one lesser there earth days were multiply so sixth gathering fifth that man fowl made.</p>\n");
      out.write("\t\t\t\t\t\t<p><a class=\"btn btn-primary\" href=\"#\">More Stuff</a></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /.row -->\t\n");
      out.write("\t\t\t</div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"copyright\">\n");
      out.write("        \t<div class=\"container\">\n");
      out.write("        \t\t<p>Copyright &copy; Example.com 2015</p>\n");
      out.write("        \t</div>\n");
      out.write("        </div>\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"https://www.quackit.com/html/templates/download/bootstrap/portfolio-2-column/js/jquery-1.11.3.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"https://www.quackit.com/html/templates/download/bootstrap/portfolio-2-column/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}