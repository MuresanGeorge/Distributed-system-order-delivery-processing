package admin;

import dao.PackageDao;
import dao.RouteDao;
import dao.UserDao;
import entities.Package;
import entities.Route;
import entities.User;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "admin.AdminService")
public class AdminServiceImpl implements AdminService {


    PackageDao packageDao = new PackageDao();
    RouteDao routeDao = new RouteDao();
    UserDao userDao = new UserDao();

    public Package registerPackageForTracking(int packageId) {
        Package packagee = packageDao.getPackageById(packageId);
        ((Package) packagee).setTracking(true);
        packageDao.updatePackage(packagee);
        Route route = new Route();
        route.setClientPackage(packagee);
        route.setTime("acum");
        route.setCity(packagee.getReceiverCity());
        routeDao.addRoute(route);
        return packagee;
    }

    public void updatePackageStatus(int packageId, String city, String time) {
        Package p = packageDao.getPackageById(packageId);
        Route r = new Route();
        r.setClientPackage(p);
        r.setCity(city);
        r.setTime(time);
        routeDao.addRoute(r);
    }

    public List<Package> getAllPackages() {
         return packageDao.getAllPackages();
    }

    public Package addPackage(String senderName, String receiverName, String name, String description, String senderCity, String destinationCity) {
        Package pa = new Package();
        User sender = userDao.findUser(senderName);
        User receiver = userDao.findUser(receiverName);
        pa.setReceiver(receiver);
        pa.setSender(sender);
        pa.setDescription(description);
        pa.setName(name);
        pa.setReceiverCity(destinationCity);
        pa.setSenderCity(senderCity);
        packageDao.addPackage(pa);
        return pa;
    }

    public void removePackage(int packageId) {
        packageDao.deletePackage(packageId);
    }

    public User getUserByUsernameAdmin(String username){
        User user = userDao.findUser(username);
        return user;
    }
}
