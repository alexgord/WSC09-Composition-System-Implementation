
package de.vs.unikassel.query.client.callback_interface.stub;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.2-b05-RC1
 * Generated source version: 2.1
 * 
 */
@SuppressWarnings("static-access")
@WebServiceClient(name = "ClientCallbackInterfaceService", targetNamespace = "http://callback_interface.client.query.unikassel.vs.de/", wsdlLocation = "de/vs/unikassel/query/client/callback_interface/ClientCallbackInterfaceService.wsdl")
public class ClientCallbackInterfaceService
    extends Service
{

    private final static URL CLIENTCALLBACKINTERFACESERVICE_WSDL_LOCATION;

    static {        
        CLIENTCALLBACKINTERFACESERVICE_WSDL_LOCATION = ClientCallbackInterfaceService.class.getClassLoader().getSystemResource("de/vs/unikassel/query/client/callback_interface/ClientCallbackInterfaceService.wsdl");
    }

    public ClientCallbackInterfaceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClientCallbackInterfaceService() {
        super(CLIENTCALLBACKINTERFACESERVICE_WSDL_LOCATION, new QName("http://callback_interface.client.query.unikassel.vs.de/", "ClientCallbackInterfaceService"));
    }

    /**
     * 
     * @return
     *     returns CallbackService
     */
    @WebEndpoint(name = "CallbackServicePort")
    public CallbackService getCallbackServicePort() {
        return super.getPort(new QName("http://callback_interface.client.query.unikassel.vs.de/", "CallbackServicePort"), CallbackService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CallbackService
     */
    @WebEndpoint(name = "CallbackServicePort")
    public CallbackService getCallbackServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://callback_interface.client.query.unikassel.vs.de/", "CallbackServicePort"), CallbackService.class, features);
    }

}
