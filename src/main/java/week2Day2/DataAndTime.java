package week2Day2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataAndTime {

	public static void main(String[] args) {
		
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
		System.out.println(dateFormat);
		Date date = new Date();
		System.out.println(dateFormat.format(date));

	}

}
