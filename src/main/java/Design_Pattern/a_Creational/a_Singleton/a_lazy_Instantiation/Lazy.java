package Design_Pattern.a_Creational.a_Singleton.a_lazy_Instantiation;

public class Lazy {

	/* this save memory */

	private static Lazy obj = null;

	private Lazy() {
	}

	public static Lazy getLazy() {
		if (obj == null) {
			obj = new Lazy();
		}
		return obj;
	}
}