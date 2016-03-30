package journaldev.withoutdi;

public class MyApplicatonTest {
	public static void main(String[] args) {
		MyApplication app = new MyApplication();
		app.processMessage("Hello how are you", "laaptu@laaptu.com");
	}
}
