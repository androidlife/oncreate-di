package journaldev.withoutdi;

public class EmailService {
	public void sendEmail(String msg, String receiver) {
		System.out.println("Email sent to " + receiver + " with message = " + msg);
	}
}
