
package adminservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the adminservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddPackageResponse_QNAME = new QName("http://admin/", "addPackageResponse");
    private final static QName _GetUserByUsernameAdmin_QNAME = new QName("http://admin/", "getUserByUsernameAdmin");
    private final static QName _RemovePackage_QNAME = new QName("http://admin/", "removePackage");
    private final static QName _UpdatePackageStatusResponse_QNAME = new QName("http://admin/", "updatePackageStatusResponse");
    private final static QName _AddPackage_QNAME = new QName("http://admin/", "addPackage");
    private final static QName _GetAllPackagesResponse_QNAME = new QName("http://admin/", "getAllPackagesResponse");
    private final static QName _RemovePackageResponse_QNAME = new QName("http://admin/", "removePackageResponse");
    private final static QName _UpdatePackageStatus_QNAME = new QName("http://admin/", "updatePackageStatus");
    private final static QName _GetAllPackages_QNAME = new QName("http://admin/", "getAllPackages");
    private final static QName _RegisterPackageForTracking_QNAME = new QName("http://admin/", "registerPackageForTracking");
    private final static QName _RegisterPackageForTrackingResponse_QNAME = new QName("http://admin/", "registerPackageForTrackingResponse");
    private final static QName _GetUserByUsernameAdminResponse_QNAME = new QName("http://admin/", "getUserByUsernameAdminResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: adminservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserByUsernameAdmin }
     * 
     */
    public GetUserByUsernameAdmin createGetUserByUsernameAdmin() {
        return new GetUserByUsernameAdmin();
    }

    /**
     * Create an instance of {@link AddPackageResponse }
     * 
     */
    public AddPackageResponse createAddPackageResponse() {
        return new AddPackageResponse();
    }

    /**
     * Create an instance of {@link RemovePackage }
     * 
     */
    public RemovePackage createRemovePackage() {
        return new RemovePackage();
    }

    /**
     * Create an instance of {@link UpdatePackageStatusResponse }
     * 
     */
    public UpdatePackageStatusResponse createUpdatePackageStatusResponse() {
        return new UpdatePackageStatusResponse();
    }

    /**
     * Create an instance of {@link AddPackage }
     * 
     */
    public AddPackage createAddPackage() {
        return new AddPackage();
    }

    /**
     * Create an instance of {@link GetAllPackagesResponse }
     * 
     */
    public GetAllPackagesResponse createGetAllPackagesResponse() {
        return new GetAllPackagesResponse();
    }

    /**
     * Create an instance of {@link RemovePackageResponse }
     * 
     */
    public RemovePackageResponse createRemovePackageResponse() {
        return new RemovePackageResponse();
    }

    /**
     * Create an instance of {@link GetAllPackages }
     * 
     */
    public GetAllPackages createGetAllPackages() {
        return new GetAllPackages();
    }

    /**
     * Create an instance of {@link RegisterPackageForTracking }
     * 
     */
    public RegisterPackageForTracking createRegisterPackageForTracking() {
        return new RegisterPackageForTracking();
    }

    /**
     * Create an instance of {@link RegisterPackageForTrackingResponse }
     * 
     */
    public RegisterPackageForTrackingResponse createRegisterPackageForTrackingResponse() {
        return new RegisterPackageForTrackingResponse();
    }

    /**
     * Create an instance of {@link UpdatePackageStatus }
     * 
     */
    public UpdatePackageStatus createUpdatePackageStatus() {
        return new UpdatePackageStatus();
    }

    /**
     * Create an instance of {@link GetUserByUsernameAdminResponse }
     * 
     */
    public GetUserByUsernameAdminResponse createGetUserByUsernameAdminResponse() {
        return new GetUserByUsernameAdminResponse();
    }

    /**
     * Create an instance of {@link Package }
     * 
     */
    public Package createPackage() {
        return new Package();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPackageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admin/", name = "addPackageResponse")
    public JAXBElement<AddPackageResponse> createAddPackageResponse(AddPackageResponse value) {
        return new JAXBElement<AddPackageResponse>(_AddPackageResponse_QNAME, AddPackageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByUsernameAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admin/", name = "getUserByUsernameAdmin")
    public JAXBElement<GetUserByUsernameAdmin> createGetUserByUsernameAdmin(GetUserByUsernameAdmin value) {
        return new JAXBElement<GetUserByUsernameAdmin>(_GetUserByUsernameAdmin_QNAME, GetUserByUsernameAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admin/", name = "removePackage")
    public JAXBElement<RemovePackage> createRemovePackage(RemovePackage value) {
        return new JAXBElement<RemovePackage>(_RemovePackage_QNAME, RemovePackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePackageStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admin/", name = "updatePackageStatusResponse")
    public JAXBElement<UpdatePackageStatusResponse> createUpdatePackageStatusResponse(UpdatePackageStatusResponse value) {
        return new JAXBElement<UpdatePackageStatusResponse>(_UpdatePackageStatusResponse_QNAME, UpdatePackageStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admin/", name = "addPackage")
    public JAXBElement<AddPackage> createAddPackage(AddPackage value) {
        return new JAXBElement<AddPackage>(_AddPackage_QNAME, AddPackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPackagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admin/", name = "getAllPackagesResponse")
    public JAXBElement<GetAllPackagesResponse> createGetAllPackagesResponse(GetAllPackagesResponse value) {
        return new JAXBElement<GetAllPackagesResponse>(_GetAllPackagesResponse_QNAME, GetAllPackagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePackageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admin/", name = "removePackageResponse")
    public JAXBElement<RemovePackageResponse> createRemovePackageResponse(RemovePackageResponse value) {
        return new JAXBElement<RemovePackageResponse>(_RemovePackageResponse_QNAME, RemovePackageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePackageStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admin/", name = "updatePackageStatus")
    public JAXBElement<UpdatePackageStatus> createUpdatePackageStatus(UpdatePackageStatus value) {
        return new JAXBElement<UpdatePackageStatus>(_UpdatePackageStatus_QNAME, UpdatePackageStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPackages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admin/", name = "getAllPackages")
    public JAXBElement<GetAllPackages> createGetAllPackages(GetAllPackages value) {
        return new JAXBElement<GetAllPackages>(_GetAllPackages_QNAME, GetAllPackages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterPackageForTracking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admin/", name = "registerPackageForTracking")
    public JAXBElement<RegisterPackageForTracking> createRegisterPackageForTracking(RegisterPackageForTracking value) {
        return new JAXBElement<RegisterPackageForTracking>(_RegisterPackageForTracking_QNAME, RegisterPackageForTracking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterPackageForTrackingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admin/", name = "registerPackageForTrackingResponse")
    public JAXBElement<RegisterPackageForTrackingResponse> createRegisterPackageForTrackingResponse(RegisterPackageForTrackingResponse value) {
        return new JAXBElement<RegisterPackageForTrackingResponse>(_RegisterPackageForTrackingResponse_QNAME, RegisterPackageForTrackingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByUsernameAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admin/", name = "getUserByUsernameAdminResponse")
    public JAXBElement<GetUserByUsernameAdminResponse> createGetUserByUsernameAdminResponse(GetUserByUsernameAdminResponse value) {
        return new JAXBElement<GetUserByUsernameAdminResponse>(_GetUserByUsernameAdminResponse_QNAME, GetUserByUsernameAdminResponse.class, null, value);
    }

}
