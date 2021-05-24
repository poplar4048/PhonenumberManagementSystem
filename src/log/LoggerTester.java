package log;

public class LoggerTester {

	public static void main(String[] args) {
		EventLogger logger = new EventLogger("lpg.txt");
		logger.log("test");
	}

}
