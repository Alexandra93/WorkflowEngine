package utils;

import java.text.SimpleDateFormat;
import com.ibm.icu.util.Calendar;

public class TemplateUtils {
	public static String timestamp() {
		  String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(Calendar.getInstance().getTime());
		  return timeStamp;
	}
}
