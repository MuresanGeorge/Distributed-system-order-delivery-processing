package admin;

import entities.Package;
import entities.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding
public interface AdminService {

    @WebMethod
    public Package registerPackageForTracking(int packageId);

    @WebMethod
    public void updatePackageStatus(int packageId, String city, String time );

    @WebMethod
    public List<Package> getAllPackages();

    @WebMethod
    public Package addPackage(String senderId, String receiverId, String name, String description, String senderCity, String destinationCity);

    @WebMethod
    public void removePackage(int packageId);

    @WebMethod
    public User getUserByUsernameAdmin(String username);

}
