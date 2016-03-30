package journaldev.withdi;

import journaldev.withdi.consumer.Consumer;
import journaldev.withdi.injector.EmailServiceInjector;
import journaldev.withdi.injector.MessageServiceInjector;
import journaldev.withdi.injector.SmsServiceInjector;
//http://www.journaldev.com/2394/dependency-injection-design-pattern-in-java-example-tutorial
public class MyMessageDITest {

	public static void main(String[] args) {
		String msg = "Hello laaptu";
		String email = "laaptu@laaptu.com";
		String phone = "9801079923";

		MessageServiceInjector injector = null;
		Consumer app = null;

		// Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessage(msg, email);
		
		//Send sms
		injector  =new SmsServiceInjector();
		app = injector.getConsumer();
		app.processMessage(msg, phone);
		
		

	}

}
