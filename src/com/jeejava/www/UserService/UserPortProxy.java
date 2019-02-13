package com.jeejava.www.UserService;

public class UserPortProxy implements com.jeejava.www.UserService.UserPort {
  private String _endpoint = null;
  private com.jeejava.www.UserService.UserPort userPort = null;
  
  public UserPortProxy() {
    _initUserPortProxy();
  }
  
  public UserPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserPortProxy();
  }
  
  private void _initUserPortProxy() {
    try {
      userPort = (new com.jeejava.www.UserService.UserPortServiceLocator()).getUserPortSoap11();
      if (userPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userPort != null)
      ((javax.xml.rpc.Stub)userPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.jeejava.www.UserService.UserPort getUserPort() {
    if (userPort == null)
      _initUserPortProxy();
    return userPort;
  }
  
  public com.jeejava.www.UserService.User[] getUserDetails(com.jeejava.www.UserService.GetUserDetailsRequest getUserDetailsRequest) throws java.rmi.RemoteException{
    if (userPort == null)
      _initUserPortProxy();
    return userPort.getUserDetails(getUserDetailsRequest);
  }
  
  
}