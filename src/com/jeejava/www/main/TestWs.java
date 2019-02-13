package com.jeejava.www.main;

import java.rmi.RemoteException;

import com.jeejava.www.UserService.GetUserDetailsRequest;
import com.jeejava.www.UserService.User;
import com.jeejava.www.UserService.UserPortProxy;

public class TestWs {

	public static void main(String[] args) {
		GetUserDetailsRequest parametros = new GetUserDetailsRequest();
		parametros.setName("frank");
		// consumeWebService();
		User[] listUser = new User[1];
		UserPortProxy proxy = new UserPortProxy();
		try {
			User[] u = proxy.getUserDetails(parametros);
			listUser = ((UserPortProxy) proxy).getUserDetails(parametros);
			for (User us : listUser) {

				System.out.println("Imprimiendo el valor " + us.getName());
				System.out.println("El correo:"+ us.getEmail());
				
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
