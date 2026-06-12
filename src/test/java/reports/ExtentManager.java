package reports;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.*;
public class ExtentManager {
	static ExtentReports extent;
	public static ExtentReports getReport() {
		if(extent==null) {
			ExtentSparkReporter spark= new ExtentSparkReporter("ExtentReport.html");
			extent = new ExtentReports();
			extent.attachReporter(spark);
		}
		return extent;
	}

}
