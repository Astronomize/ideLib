package idelib.java.ide;

import java.util.ArrayList;
@SuppressWarnings("static-access")
public class Handler {
	private static ArrayList<IDEClass> cList = new ArrayList<>();
	private static ArrayList<IDEPackage> pList = new ArrayList<>();
	public static void addClass(IDEClass c) {
		cList.add(c);
	}
	public static void addPackage(IDEPackage p) {
		pList.add(p);
	}
	
	/**
	 * Adds the classes to their assigned packages.
	 */
	public static void addPackageContents() {
		for (IDEClass c : cList) {
			if (pList.contains(c.getPackage())) {
				c.getPackage().addClass(c);
			} else {
				System.out.println("[ERROR] Package does not exist.");
			}

		}
	}
	
	/**
	 * returns the packages arraylist.
	 */
	public static ArrayList<IDEPackage> getPackages() {
		return pList;
	}
	
	/**
	 * returns the classes arraylist.
	 */
	public static ArrayList<IDEClass> getClasses() {
		return cList;
	}
}
