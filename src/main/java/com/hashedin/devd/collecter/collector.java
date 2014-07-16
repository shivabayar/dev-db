package com.hashedin.devd.collecter;

import java.util.List;

import com.hashedin.devd.alert.AlertFilter;
import com.hashedin.devd.model.Alert;

public class collector{
	
   public List<Alert>  collectAlert(){
	
	   AlertFilter object =new AlertFilter();
	   
	   return object.alert();  
	  
   }

}
