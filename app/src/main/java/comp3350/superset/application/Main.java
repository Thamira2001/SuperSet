package comp3350.superset.application;


public class Main {

	private static String dbName="SC";

	public static void main(String[] args)
	{
		System.out.println("Running...");
	}

	public static void setDBPathName(final String name) {
		try {
			Class.forName("org.hsqldb.jdbcDriver").newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		dbName = name;
	}

	public static String getDBPathName() {
		return dbName;
	}

}