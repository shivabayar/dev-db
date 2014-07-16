package com.hashedin.collecter;

import java.util.List;

import  com.hashedin.Integration.integrationImpl;
import  com.hashedin.Alert.AlertFilter;
import 	com.hashedin.model.GitCommit ;
import 	com.hashedin.model.Alert;

public class collector{
	
   public List<Alert>  collectAlert(){
	
	   AlertFilter object =new AlertFilter();
	   
	   return object.alert();  
	  
   }

}
