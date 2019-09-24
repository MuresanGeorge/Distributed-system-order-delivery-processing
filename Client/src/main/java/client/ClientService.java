package client;

import entities.Package;
import entities.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding
public interface ClientService {

    @WebMethod
    public List<Package> getAllPackagesForMe(int clientId);

    @WebMethod
    public List<Package> searchPackages(int clientId, int packageId);

    @WebMethod
    public void register(User user);

    @WebMethod
    public boolean getPackageStatus(int packageId);

    @WebMethod
    public User getUserByUsername(String username);
}
