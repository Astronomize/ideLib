package idelib.java.ide;

import idelib.java.utils.ClassType;
@SuppressWarnings("unused")
public class IDEClass {
	
	
    private static String name;
    private static IDEPackage pack;
    private static ClassType type;
    
    
    /**
     * For creating classes.
     * @param name
     * @param pack
     * @param type
     */
	public IDEClass(String name, IDEPackage pack, ClassType type) {
		IDEClass.name = name;
		IDEClass.pack = pack;
		IDEClass.type = type;
		

	}
	
	
	/**
	 * Creates a class and adds it to the handler.
	 * @param String name
	 * @param Package pack
	 * @param ClassType type
	 */
	public static void CreateClass(String name, IDEPackage pack, ClassType type) {
		if (Handler.getPackages().contains(pack)) {
			Handler.addClass(new IDEClass(name, pack, type));
		} else {
			System.out.println("[Error] The package used on the class"
					+ name 
					+ " Doesn't exist.");
		}
			

	}
	
	
	/**
	 * 
	 * Returns the name of the class.
	 * 
	 */
	public static String getName() {
		return name;
	}
	
	
	/**
	 * returns the package of the class.
	 */
	public static IDEPackage getPackage() {
		return pack;
	}
	
	
	/**
	 * returns the type of the class.
	 */
	public static ClassType getClassType() {
		return type;
	}
}
