package journaldev.withdi.injector;

import journaldev.withdi.consumer.Consumer;
import journaldev.withdi.consumer.MyDIApplication;
import journaldev.withdi.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		// TODO Auto-generated method stub
		return new MyDIApplication(new EmailServiceImpl());
	}

}
