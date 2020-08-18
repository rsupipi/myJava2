package Design_Pattern.a_Creational.a_Singleton.a_early_Instantiation;

public class Early {

	// Early, instance will be created at load time
	private static Early obj = new Early();

	private Early() {
	}

	public static Early getEarly() {
		return obj;
	}
}