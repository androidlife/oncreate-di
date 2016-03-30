package journaldev.withdi.injector;

import journaldev.withdi.consumer.Consumer;
import journaldev.withdi.consumer.MyDIApplication;
import journaldev.withdi.service.EmailServiceImpl;

public class EmailServiceInjectorSetter implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		// TODO Auto-generated method stub
		MyDIApplication application = new MyDIApplication();
		application.setService(new EmailServiceImpl());
		return application;
	}

}
