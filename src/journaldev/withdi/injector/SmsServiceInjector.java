package journaldev.withdi.injector;

import journaldev.withdi.consumer.Consumer;
import journaldev.withdi.consumer.MyDIApplication;
import journaldev.withdi.service.SMSServiceImpl;

public class SmsServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		// TODO Auto-generated method stub
		return new MyDIApplication(new SMSServiceImpl());
	}

}
