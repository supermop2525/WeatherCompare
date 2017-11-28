/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gargoylesoftware.htmlunit.WebClient;  
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebResponse;
import com.gargoylesoftware.htmlunit.html.*;



/**
 *
 * @author Omair
 */
public class fllwrcheckServ extends HttpServlet {
    
    private static WebClient webClient = new WebClient(BrowserVersion.CHROME);
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String city1=request.getParameter("city1");
        String city2=request.getParameter("city2");
                
        if(city2.equals(""))
            city2="toronto";
                 
        City[] city = new City[2];
        city[0] = new City(city1);
        city[1] = new City(city2);

        webClient.getOptions().setThrowExceptionOnScriptError(false);
        //City a=city[0];
        HtmlPage currentPage=null;
        try {
        for(City a : city){
        currentPage = webClient.getPage("https://www.google.ca/"); 
        
        //<editor-fold defaultstate="collapsed" desc="comment">
        /*JavaScriptJobManager manager = currentPage.getEnclosingWindow().getJobManager();
        int count=0;
        while ((manager.getJobCount() > 0) && (count<6)) {
        try {Thread.sleep(500); count++;} catch(InterruptedException e){Thread.currentThread().interrupt();}
        } */
        //</editor-fold>
        
        webClient.waitForBackgroundJavaScript(2000);
        
        HtmlInput input = currentPage.getFirstByXPath("//input[@title='Search' and @type='text']"); //Find element called loginuser for username     
        input.setValueAttribute("weather in " + a.name); 
        
        HtmlSubmitInput submitBtn = currentPage.getFirstByXPath("//input[@value='Google Search' and @type='submit']"); //*[@id="login-submit"] 
        currentPage = submitBtn.click();
           
        webClient.waitForBackgroundJavaScript(4200);  
        
        a.name=((HtmlDivision) (currentPage.getFirstByXPath("//div[@id='wob_loc']"))).asText();
        a.DateAndTime=((HtmlDivision) (currentPage.getFirstByXPath("//div[@id='wob_dts']"))).asText();
        a.conditions=((HtmlSpan) (currentPage.getFirstByXPath("//span[@id='wob_dc']"))).asText();
        a.precipitation=((HtmlSpan) (currentPage.getFirstByXPath("//span[@id='wob_pp']"))).asText();
        a.humidity=((HtmlSpan) (currentPage.getFirstByXPath("//span[@id='wob_hm']"))).asText();
        a.wind=((HtmlSpan) (currentPage.getFirstByXPath("//span[@id='wob_ws']"))).asText();
        a.temp=((HtmlSpan) (currentPage.getFirstByXPath("//span[@id='wob_tm']"))).asText();
        a.tempType=((HtmlSpan) (currentPage.getFirstByXPath("//span[@class='wob_t' and @style='display:inline' and @aria-label]"))).asText();
        a.High=((HtmlSpan) currentPage.getFirstByXPath("//div[@class='vk_gy'][1]/span[1]")).asText();
        a.Low=((HtmlSpan) currentPage.getFirstByXPath("//div[@class='vk_lgy'][1]/span[1]")).asText();
        a.nextHigh=((HtmlSpan) currentPage.getFirstByXPath("(//div[@class='vk_gy'])[2]/span[1]")).asText();
        a.nextLow=((HtmlSpan) currentPage.getFirstByXPath("(//div[@class='vk_lgy'])[4]/span[1]")).asText();
        
        }
        
        //WebResponse response1 = currentPage.getWebResponse();
        //String message = response1.getContentAsString();
        
            
        request.setAttribute("a", "" + city[0].name);
        request.setAttribute("b", "" + city[0].DateAndTime);
        request.setAttribute("c", "" + city[0].conditions);
        request.setAttribute("d", "" + city[0].temp+" "+city[0].tempType);
        request.setAttribute("e", "" + city[0].precipitation);
        request.setAttribute("f", "" + city[0].humidity);
        request.setAttribute("g", "" + city[0].wind);
        request.setAttribute("h", "" + city[0].High+" "+city[0].tempType);
        request.setAttribute("i", "" + city[0].Low+" "+city[0].tempType);
        request.setAttribute("j", "" + city[0].nextHigh+" "+city[0].tempType);
        request.setAttribute("k", "" + city[0].nextLow+" "+city[0].tempType);         
            
        request.setAttribute("l", "" + city[1].name);
        request.setAttribute("m", "" + city[1].DateAndTime);
        request.setAttribute("n", "" + city[1].conditions);
        request.setAttribute("o", "" + city[1].temp+" "+city[1].tempType);
        request.setAttribute("p", "" + city[1].precipitation);
        request.setAttribute("q", "" + city[1].humidity);
        request.setAttribute("r", "" + city[1].wind);
        request.setAttribute("s", "" + city[1].High+" "+city[1].tempType);
        request.setAttribute("t", "" + city[1].Low+" "+city[1].tempType);
        request.setAttribute("u", "" + city[1].nextHigh+" "+city[1].tempType);
        request.setAttribute("v", "" + city[1].nextLow+" "+city[1].tempType);
        
        request.getRequestDispatcher("/fllwrcheck.jsp").forward(request, response);
        
        
        
        } catch (IOException e){System.out.print("didnt work my friend");} 
        
    }
    
    protected class City{
        protected String name;
        protected String DateAndTime;
        protected String conditions;
        protected String precipitation;
        protected String humidity;
        protected String wind;
        protected String temp;
        protected String tempType;
        protected String High,nextHigh;
        protected String Low,nextLow;

        public City(String nameIn){
            name=nameIn;
        }
        @Override
        public String toString(){
            return "Location:                " + name +"\n" +"Date And Time:           " + DateAndTime +"\n"+"Conditions:              " + conditions +"\n"
                    +"Temperature:             " + temp+" "+tempType +"\n"+"Chance Of Precipitation: " + precipitation +"\n"+"Humidity:                " + humidity +"\n"
                    +"Wind Speed:              " + wind +"\n"+"Today's High:            " + High +"\n"+"Today's Low:             " + Low +"\n"
                    +"Tomorrow's High:         " + nextHigh +"\n"+"Tomorrow's Low:          " + nextLow +"\n";
        }
    }
     


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /**@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }*/

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /**@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }*/

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>*/

}
