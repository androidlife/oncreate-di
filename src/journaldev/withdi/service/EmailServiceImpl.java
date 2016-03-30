package journaldev.withdi.service;

public class EmailServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String rec) {
		// TODO Auto-generated method stub
		System.out.println("Email sent to " + rec + " with Message = " + msg);
	}

}
