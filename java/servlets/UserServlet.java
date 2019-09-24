package servlets;


import clientservices.ClientService;
import clientservices.ClientServiceImplService;
import clientservices.Package;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

@WebServlet(name = "servlets.UserServlet")
public class UserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String myId = request.getParameter("myId");
        String packageId = request.getParameter("packageId");
        String clientId = request.getParameter("clientId");
        String packageStatusId = request.getParameter("packageStatusId");

        ClientServiceImplService clientServiceImplService = new ClientServiceImplService();
        ClientService serviceClient = clientServiceImplService.getClientServiceImplPort();

        if(myId == null && packageStatusId == null){
            PrintWriter out = response.getWriter();
            List<Package> pacheteleVietii = serviceClient.searchPackages(Integer.parseInt(packageId), Integer.parseInt(clientId));
            String title = "Pachetul pe care l-ai cautat ";
            String docType =
                    "<!doctype html public \"-//w3c//dtd html 5.0 " + "transitional//en\">\n";
            String tot = docType + "<html>\n" + "<head><title>" + title + "</title></head>\n" + "<body bgcolor = \"#f0f0f0\">\n" +
                    "<h1 align = \"center\">" + title + "</h1>\n" +
                    "<ul>\n";
            tot += "<table border =\"1\">"+
                    "<tr>"+
                    "<th>"+"Sender name"+"</th>"+
                    "<th>"+"Receiver name"+"</th>"+
                    "<th>"+"Package name"+"</th>"+
                    "<th>"+"Description "+"</th>"+
                    "<th>"+"Sender City"+"</th>"+
                    "<th>"+"Destination City"+"</th>";
//        "</table>";
            //List<clientservices.Package> packageList = serviceClient.getAllPackagesForMe(Integer.parseInt(myId));
            Iterator<clientservices.Package> it = pacheteleVietii.iterator();
            while(it.hasNext()){
                clientservices.Package flight = it.next();
                String id = flight.getSender().getUsername();
                String senderName = flight.getReceiver().getUsername();
                String receiverName = flight.getName();
                String arrC = flight.getDescription();
                String depH = flight.getSenderCity();
                String arH = flight.getReceiverCity();
                String tableRow =
                        "<tr>"+
                                "<td>"+id+"</td>"+
                                "<td>"+senderName+"</td>"+
                                "<td>"+receiverName+"</td>"+"<td>"+arrC+"</td>"+
                                "<td>"+depH+"</td>"+ "<td>"+arH+"</td>"+
                                "</tr>";
                tot += tableRow;}

            tot += "</table>";
            tot += "</body></html>";
            out.println(tot);
        }else{
            Boolean tracking = serviceClient.getPackageStatus(Integer.parseInt(packageStatusId));
            String message = "";
            // Actual logic goes here.
            PrintWriter out = response.getWriter();
            out.println("<h1>" + message + tracking + "</h1>");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        String myId = request.getParameter("myId");


        ClientServiceImplService clientServiceImplService = new ClientServiceImplService();
        ClientService serviceClient = clientServiceImplService.getClientServiceImplPort();

        String title = "Pachetul pe care l-ai cautat ";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 5.0 " + "transitional//en\">\n";
        String tot = docType + "<html>\n" + "<head><title>" + title + "</title></head>\n" + "<body bgcolor = \"#f0f0f0\">\n" +
                "<h1 align = \"center\">" + title + "</h1>\n" +
                "<ul>\n";
        tot += "<table border =\"1\">"+
                "<tr>"+
                "<th>"+"Sender name"+"</th>"+
                "<th>"+"Receiver name"+"</th>"+
                "<th>"+"Package name"+"</th>"+
                "<th>"+"Description "+"</th>"+
                "<th>"+"Sender City"+"</th>"+
                "<th>"+"Destination City"+"</th>";
//        "</table>";
        List<clientservices.Package> packageList = serviceClient.getAllPackagesForMe(Integer.parseInt(myId));
        Iterator<clientservices.Package> it = packageList.iterator();
        while(it.hasNext()){
            clientservices.Package flight = it.next();
            String id = flight.getSender().getUsername();
            String senderName = flight.getReceiver().getUsername();
            String receiverName = flight.getName();
            String arrC = flight.getDescription();
            String depH = flight.getSenderCity();
            String arH = flight.getReceiverCity();
            String tableRow =
                    "<tr>"+
                            "<td>"+id+"</td>"+
                            "<td>"+senderName+"</td>"+
                            "<td>"+receiverName+"</td>"+"<td>"+arrC+"</td>"+
                            "<td>"+depH+"</td>"+ "<td>"+arH+"</td>"+
                            "</tr>";
            tot += tableRow;}

        tot += "</table>";
        tot += "</body></html>";
        out.println(tot);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}
