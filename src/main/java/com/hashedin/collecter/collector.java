package main.java.com.hashedin.collecter;
import java.util.List;

import  main.java.com.hashedin.Integration.integrationImpl;
import main.java.com.hashedin.Alert.AlertFilter;
import 	main.java.com.hashedin.model.GitCommit ;
import 	main.java.com.hashedin.model.Alert;

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