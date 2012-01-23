package controllers;

import securesocial.provider.ProviderType;
import securesocial.provider.SocialUser;
import controllers.securesocial.SecureSocial;

public class Authenticate extends ControllerParent{

	//Permet de lancer une authentification
	 public static void connect(String provider) {
		 if("twitter".equals(provider)){
			 SecureSocial.authenticate(ProviderType.twitter);
		 }else if("facebook".equals(provider)){
			 SecureSocial.authenticate(ProviderType.facebook);
		 }else if("google".equals(provider)){
			 SecureSocial.authenticate(ProviderType.google);
		 }else if("yahoo".equals(provider)){
			 SecureSocial.authenticate(ProviderType.yahoo);
		 }else if("linkedin".equals(provider)){
			 SecureSocial.authenticate(ProviderType.linkedin);
		 }else if("myopenid".equals(provider)){
			 SecureSocial.authenticate(ProviderType.myopenid);
		 }
	 }
	
	 public static void getUser(String provider){
		 SocialUser user = SecureSocial.getCurrentUser();
		 renderJSON(user);
	 }
}
