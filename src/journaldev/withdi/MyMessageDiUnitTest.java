package journaldev.withdi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import journaldev.withdi.consumer.Consumer;
import journaldev.withdi.consumer.MyDIApplication;
import journaldev.withdi.injector.MessageServiceInjector;
import journaldev.withdi.service.MessageService;



public class MyMessageDiUnitTest {
	private MessageServiceInjector injector;

	@Before
	public void setUp() {
		// mocking the injector
		injector = new MessageServiceInjector() {

			@Override
			public Consumer getConsumer() {
				// TODO Auto-generated method stub
				return new MyDIApplication(new MessageService() {

					@Override
					public void sendMessage(String msg, String rec) {
						// TODO Auto-generated method stub
						System.out.println("Mock message service implementation");

					}
				});
			}
		};
	}

	@Test
	public void test() {
		Consumer consumer = injector.getConsumer();
		consumer.processMessage("Hi laaptu", "laaptu@laaptu.com");
	}

	@After
	public void tear() {
		injector = null;
	}

}
