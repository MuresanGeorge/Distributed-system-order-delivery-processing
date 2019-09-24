
package clientservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientservices package. 
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

    private final static QName _GetPackageStatusResponse_QNAME = new QName("http://client/", "getPackageStatusResponse");
    private final static QName _Register_QNAME = new QName("http://client/", "register");
    private final static QName _SearchPackages_QNAME = new QName("http://client/", "searchPackages");
    private final static QName _GetAllPackagesForMeResponse_QNAME = new QName("http://client/", "getAllPackagesForMeResponse");
    private final static QName _GetPackageStatus_QNAME = new QName("http://client/", "getPackageStatus");
    private final static QName _RegisterResponse_QNAME = new QName("http://client/", "registerResponse");
    private final static QName _GetUserByUsername_QNAME = new QName("http://client/", "getUserByUsername");
    private final static QName _GetAllPackagesForMe_QNAME = new QName("http://client/", "getAllPackagesForMe");
    private final static QName _GetUserByUsernameResponse_QNAME = new QName("http://client/", "getUserByUsernameResponse");
    private final static QName _SearchPackagesResponse_QNAME = new QName("http://client/", "searchPackagesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserByUsernameResponse }
     * 
     */
    public GetUserByUsernameResponse createGetUserByUsernameResponse() {
        return new GetUserByUsernameResponse();
    }

    /**
     * Create an instance of {@link SearchPackagesResponse }
     * 
     */
    public SearchPackagesResponse createSearchPackagesResponse() {
        return new SearchPackagesResponse();
    }

    /**
     * Create an instance of {@link GetUserByUsername }
     * 
     */
    public GetUserByUsername createGetUserByUsername() {
        return new GetUserByUsername();
    }

    /**
     * Create an instance of {@link GetAllPackagesForMe }
     * 
     */
    public GetAllPackagesForMe createGetAllPackagesForMe() {
        return new GetAllPackagesForMe();
    }

    /**
     * Create an instance of {@link GetPackageStatus }
     * 
     */
    public GetPackageStatus createGetPackageStatus() {
        return new GetPackageStatus();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link GetAllPackagesForMeResponse }
     * 
     */
    public GetAllPackagesForMeResponse createGetAllPackagesForMeResponse() {
        return new GetAllPackagesForMeResponse();
    }

    /**
     * Create an instance of {@link SearchPackages }
     * 
     */
    public SearchPackages createSearchPackages() {
        return new SearchPackages();
    }

    /**
     * Create an instance of {@link GetPackageStatusResponse }
     * 
     */
    public GetPackageStatusResponse createGetPackageStatusResponse() {
        return new GetPackageStatusResponse();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPackageStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client/", name = "getPackageStatusResponse")
    public JAXBElement<GetPackageStatusResponse> createGetPackageStatusResponse(GetPackageStatusResponse value) {
        return new JAXBElement<GetPackageStatusResponse>(_GetPackageStatusResponse_QNAME, GetPackageStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPackages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client/", name = "searchPackages")
    public JAXBElement<SearchPackages> createSearchPackages(SearchPackages value) {
        return new JAXBElement<SearchPackages>(_SearchPackages_QNAME, SearchPackages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPackagesForMeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client/", name = "getAllPackagesForMeResponse")
    public JAXBElement<GetAllPackagesForMeResponse> createGetAllPackagesForMeResponse(GetAllPackagesForMeResponse value) {
        return new JAXBElement<GetAllPackagesForMeResponse>(_GetAllPackagesForMeResponse_QNAME, GetAllPackagesForMeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPackageStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client/", name = "getPackageStatus")
    public JAXBElement<GetPackageStatus> createGetPackageStatus(GetPackageStatus value) {
        return new JAXBElement<GetPackageStatus>(_GetPackageStatus_QNAME, GetPackageStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByUsername }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client/", name = "getUserByUsername")
    public JAXBElement<GetUserByUsername> createGetUserByUsername(GetUserByUsername value) {
        return new JAXBElement<GetUserByUsername>(_GetUserByUsername_QNAME, GetUserByUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPackagesForMe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client/", name = "getAllPackagesForMe")
    public JAXBElement<GetAllPackagesForMe> createGetAllPackagesForMe(GetAllPackagesForMe value) {
        return new JAXBElement<GetAllPackagesForMe>(_GetAllPackagesForMe_QNAME, GetAllPackagesForMe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByUsernameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client/", name = "getUserByUsernameResponse")
    public JAXBElement<GetUserByUsernameResponse> createGetUserByUsernameResponse(GetUserByUsernameResponse value) {
        return new JAXBElement<GetUserByUsernameResponse>(_GetUserByUsernameResponse_QNAME, GetUserByUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPackagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client/", name = "searchPackagesResponse")
    public JAXBElement<SearchPackagesResponse> createSearchPackagesResponse(SearchPackagesResponse value) {
        return new JAXBElement<SearchPackagesResponse>(_SearchPackagesResponse_QNAME, SearchPackagesResponse.class, null, value);
    }

}
