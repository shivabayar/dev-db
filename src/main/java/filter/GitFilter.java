package filter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GitFilter {

	public void generateBargraphData() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// get current date 
		Date date = new Date();
		System.out.println(dateFormat.format(date));
	}
	
	public static void generateWeekBeforDate(){
		Calendar cal = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Map<String,Integer> weekMap = new HashMap<String, Integer>();
		
		Date date = new Date();
//		System.out.println(dateFormat.format(date));
		
		for(int i = 0 ; i < 6 ; ++i){
			cal.add(Calendar.DATE, -1);
			weekMap.put(dateFormat.format(cal.getTime()).toString(), 0);
//			System.out.println(dateFormat.format(cal.getTime()));
		}
		System.out.println(weekMap);
	}
}
