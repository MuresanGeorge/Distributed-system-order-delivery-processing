package admin;

import javax.xml.ws.Endpoint;

public class ServiceAdminPublisher {

    public static void main (String args []){
        try {
            Endpoint.publish("http://localhost:8083/admin", new AdminServiceImpl());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
