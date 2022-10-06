package kodlamaioHW33.core;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Databaseye loglandı --> " + data);
	}

}
