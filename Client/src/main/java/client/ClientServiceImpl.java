package client;

import dao.PackageDao;
import dao.RouteDao;
import dao.UserDao;
import entities.Package;
import entities.User;


import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "client.ClientService")
public class ClientServiceImpl implements ClientService {

    PackageDao packageDao = new PackageDao();
    RouteDao routeDao = new RouteDao();
    UserDao userDao = new UserDao();

    public List<Package> getAllPackagesForMe(int clientId) {

        List<Package> packages = packageDao.getAllPackages();
        List<Package> myPacakges = new ArrayList<Package>();
        for(Package packagee : packages){
            if(packagee.getSender().getId() == clientId || packagee.getReceiver().getId() == clientId){
                myPacakges.add(packagee);
            }
        }
        return myPacakges;
    }


    public List<Package> searchPackages(int clientId, int packageId) {
        List<Package> packages = new ArrayList<Package>();
        List<Package> pac1 = getAllPackagesForMe(clientId);
        for(Package m: pac1)
        {
            if(m.getId() == packageId){
                packages.add(m);
                System.out.println(packages);
            }
        }
        return packages;
    }

    public void register(User user) {
        User user1 = userDao.findUser(user.getUsername());
        if(user1 == null) {
            userDao.addUser(user);
        }
    }

    public User getUserByUsername(String username){
        User user1 = new User();
        user1 = userDao.findUser(username);
        return user1;
    }


    public boolean getPackageStatus(int packageId) {
        Package pac = packageDao.getPackageById(packageId);
        return pac.isTracking();
    }
}
