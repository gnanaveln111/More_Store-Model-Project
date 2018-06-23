package com.morebusinesslogic;

import com.more.model.MoreModel;

public class MoreBusinessLogicClass {

	public boolean businesslogic(MoreModel modobj) {
	if (modobj.getDepcode().equalsIgnoreCase("Admin")) {
		return true;
	}
	else
		return false;
		
	}
}