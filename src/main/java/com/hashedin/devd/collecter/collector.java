package com.hashedin.devd.collecter;
import java.util.List;

import com.hashedin.devd.alert.AlertFilter;
import com.hashedin.devd.integration.integrationImpl;
import com.hashedin.devd.model.Alert;
import com.hashedin.devd.model.GitCommit;

public class collector{
	
/*	public GitCommit collect(){
		
		integrationImpl object = new integrationImpl();
		return  object.IDataFetch();
	}
*/
   public  List<Alert>  collectAlert(){
	
	   AlertFilter object =new AlertFilter();
	   
	   return object.alert();  
	  
   }

}