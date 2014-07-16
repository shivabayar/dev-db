package main.java.com.hashedin.Alert;
import main.java.com.hashedin.Integration.integrationImpl;

import java.util.ArrayList;
import java.util.List;

import 	main.java.com.hashedin.model.Alert;
import main.java.com.hashedin.model.GitCommit;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class AlertFilter{
	
	 
public  List<Alert> alert(){  
    
	   integrationImpl object = new integrationImpl();
	
	   GitCommit dataList = object.IDataFetch();
	  
	   List<GitCommit> list = new ArrayList<GitCommit>() ;
	   
	   List<Alert> list1 = new ArrayList<Alert>();
       
	   Alert a  = new Alert();
	   
	   for (GitCommit i :list){
		   /*
		

    	Calendar cal = Calendar.getInstance();
    	cal.getTime();
    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    

		    
		    */
		   
		   
		   
		   
		   
	//	 write code to check for alert  condition   
		   
		   if(i.getTimeStamp()=="greater then time specified " ){
			   
			   a.setLastCommitedAt(i.getTimeStamp());
			   
			 list1.add(a);  
		   }
	   
	   }
	   
	   
	   
	   
	   
	 return list1 ;
	}
}
