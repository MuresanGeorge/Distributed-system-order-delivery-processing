package servlets;

import adminservices.AdminService;
import adminservices.AdminServiceImplService;
import adminservices.Package;
import clientservices.ClientService;
import clientservices.ClientServiceImplService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

@WebServlet(name = "servlets.AdminServlet")
public class AdminServlet extends HttpServlet {

    private String message;

    public void init() {
        message = "George";
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");
        String senderName = request.getParameter("senderName");
        String receiverName = request.getParameter("receiverName");
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String senderCity = request.getParameter("senderCity");
        String destinationCity = request.getParameter("destinationCity");
        String packaegIdRemove = request.getParameter("packageIdRemove");
        String packaegIdRegister = request.getParameter("packageIdRegister");
        String packageIdStatus = request.getParameter("packageIdStatus");
        String city = request.getParameter("city");
        String time = request.getParameter("time");

        //serviciile
        AdminServiceImplService adminServiceImplService = new AdminServiceImplService();
        AdminService serviceAdmin = adminServiceImplService.getAdminServiceImplPort();
        ClientServiceImplService clientServiceImplService = new ClientServiceImplService();
        ClientService serviceClient = clientServiceImplService.getClientServiceImplPort();

        if(packaegIdRemove == null && packaegIdRegister == null && packageIdStatus == null && city == null && time == null){
            serviceAdmin.addPackage(senderName, receiverName, name, description, senderCity, destinationCity);
        }else if( packaegIdRegister == null && packageIdStatus == null && city == null && time == null){
            serviceAdmin.removePackage(Integer.parseInt(packaegIdRemove));
        }else if(packaegIdRemove == null && packageIdStatus == null && city == null && time == null){
            serviceAdmin.registerPackageForTracking(Integer.parseInt(packaegIdRegister));
        }else{
            serviceAdmin.updatePackageStatus(Integer.parseInt(packageIdStatus), city, time);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();

        AdminServiceImplService adminServiceImplService = new AdminServiceImplService();
        AdminService serviceAdmin = adminServiceImplService.getAdminServiceImplPort();

        String title = "All packages for me";
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
        List<Package> packageList = serviceAdmin.getAllPackages();
        Iterator<Package> it = packageList.iterator();
        while(it.hasNext()){
            Package flight = it.next();
            String id = flight.getSender().getUsername();
            String senderName = flight.getReceiver().getUsername();
            String receiverName = flight.getName();
            String arrC = flight.getDescription();
            String depH = flight.getSenderCity();
            String arH = flight.getReceiverCity();;
            String tableRow =
//                    "<table>"+
//                            "<tr>"+
//                            "<th>"+"Flight Number"+"</th>"+
//                            "<th>"+"Airplane Type"+"</th>"+
//                            "<th>"+"Departure City"+"</th>"+
//                            "<th>"+"Arrival City"+"</th>"+
//                            "<th>"+"Departure Hour"+"</th>"+
//                            "<th>"+"Arrival Hour"+"</th>"+
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
    /*
        String flightIdU = req.getParameter("flightIdU");
        String airplaneType = req.getParameter("airplaneType");
        String departureCity = req.getParameter("departureCity");
        String arrivalCity = req.getParameter("arrivalCity");
        String departureDateHour = req.getParameter("departureDateHour");
        String arrivalDateHour = req.getParameter("arrivalDateHour");

        FlightsService flightsService = new FlightsServiceImpl();
        CityService cityService = new CityServiceImpl();


        Flight newUpdateFlight = flightsService.getFlightById(Integer.parseInt(flightIdU));
        SetFlightUtil.setParameters(cityService, airplaneType, departureCity, arrivalCity, departureDateHour, arrivalDateHour, newUpdateFlight);
        System.out.println(newUpdateFlight);
        flightsService.updateFlight(newUpdateFlight);
    */
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    /*
        String flightIdD = req.getParameter("flightIdD");
        FlightsService flightsService = new FlightsServiceImpl();

        flightsService.deleteFlight(Integer.parseInt(flightIdD));
    }
    */
    }

}
