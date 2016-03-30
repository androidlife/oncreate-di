package journaldev.withdi.consumer;

import journaldev.withdi.service.MessageService;

public class MyDIApplication implements Consumer {

	private MessageService msgService;

	public MyDIApplication(MessageService msgService) {
		this.msgService = msgService;
	}
	
	// just to illustrate dependency injection via setters
	public MyDIApplication(){
		
	}

	public void setService(MessageService msgService) {
		this.msgService = msgService;
	}

	@Override
	public void processMessage(String msg, String rec) {
		// TODO Auto-generated method stub
		msgService.sendMessage(msg, rec);

	}

}
