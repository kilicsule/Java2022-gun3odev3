package kodlamaioDemo.core.loggin;

public class EmailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Email gönderildi: " + data);
		
	}

}
