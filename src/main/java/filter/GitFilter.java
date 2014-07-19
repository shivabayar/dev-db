package filter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GitFilter {

	public void generateBargraphData() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// get current date 
		Date date = new Date();
		System.out.println(dateFormat.format(date));
	}
}
