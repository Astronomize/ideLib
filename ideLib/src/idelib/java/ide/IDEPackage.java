package idelib.java.ide;

import java.util.ArrayList;


public class IDEPackage {
	
	
	private static String name;
	private static ArrayList<IDEClass> contents = new ArrayList<>();
	
	
	public IDEPackage(String name) {
		IDEPackage.name = name;
	}
	
	
	/**
	 * Adds the package to the handler.
	 * Required to make the package accessible.
	 */
	public static void CreatePackage(String name) {
		Handler.addPackage(new IDEPackage(name));
	}
	
	
	/**
	 * returns the name of the package.
	 */
	public static String getName() {
		return name;
	}
	
	
	
	/**
	 * returns the contents of the package.
	 */
	public static IDEClass getContents() {
		for (IDEClass c : contents) {
			return c;
		}
		return null;
	}
	
	
	public static void addClass(IDEClass c) {
		contents.add(c);
	}
}
