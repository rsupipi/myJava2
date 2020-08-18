package Design_Pattern.a_Creational.a_Singleton.a_lazy_Instantiation;

public class LazyThreadSafe {

	/* volatile ensure that instance will remain a singleton through any of the changes inside of the JVM. */
	private static volatile LazyThreadSafe obj = null;

	private LazyThreadSafe() {
		/*ensure no body use reflection on our code.*/
		if (obj != null){
			throw new RuntimeException("Use getInstance() method to create");
		}
	}

	public static LazyThreadSafe getLazy() {

		/*Here we are using double check locking mechanism and a synchronized check.
		* Some people make hole method synchronized, but it will effect for the performance  */
		if (obj == null) {
			synchronized (LazyThreadSafe.class) {
				if (obj == null) {
					obj = new LazyThreadSafe();
				}
			}
		}
		return obj;
	}
}