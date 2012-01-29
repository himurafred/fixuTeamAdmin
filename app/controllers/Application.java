package controllers;

import models.Check;
import models.SecurityIdent;

import play.data.validation.Required;
import play.mvc.With;

public class Application extends ControllerParent{
	
	@Check()
	public static void get(){
		renderJSON(getUser());
	}
}
