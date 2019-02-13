/**
 * UserPortServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jeejava.www.UserService;

public class UserPortServiceLocator extends org.apache.axis.client.Service implements com.jeejava.www.UserService.UserPortService {

    public UserPortServiceLocator() {
    }


    public UserPortServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserPortServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserPortSoap11
    private java.lang.String UserPortSoap11_address = "http://localhost:9090/ws";

    public java.lang.String getUserPortSoap11Address() {
        return UserPortSoap11_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserPortSoap11WSDDServiceName = "UserPortSoap11";

    public java.lang.String getUserPortSoap11WSDDServiceName() {
        return UserPortSoap11WSDDServiceName;
    }

    public void setUserPortSoap11WSDDServiceName(java.lang.String name) {
        UserPortSoap11WSDDServiceName = name;
    }

    public com.jeejava.www.UserService.UserPort getUserPortSoap11() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserPortSoap11_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserPortSoap11(endpoint);
    }

    public com.jeejava.www.UserService.UserPort getUserPortSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.jeejava.www.UserService.UserPortSoap11Stub _stub = new com.jeejava.www.UserService.UserPortSoap11Stub(portAddress, this);
            _stub.setPortName(getUserPortSoap11WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserPortSoap11EndpointAddress(java.lang.String address) {
        UserPortSoap11_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.jeejava.www.UserService.UserPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.jeejava.www.UserService.UserPortSoap11Stub _stub = new com.jeejava.www.UserService.UserPortSoap11Stub(new java.net.URL(UserPortSoap11_address), this);
                _stub.setPortName(getUserPortSoap11WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("UserPortSoap11".equals(inputPortName)) {
            return getUserPortSoap11();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www.jeejava.com/UserService", "UserPortService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www.jeejava.com/UserService", "UserPortSoap11"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserPortSoap11".equals(portName)) {
            setUserPortSoap11EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
