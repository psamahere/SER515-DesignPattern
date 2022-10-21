package designpattern1;

/**
 * @author Praveen Sama (psama)
 *
 */

public abstract class Person {
	public static ProductMenu theProductMenu;
	
	public abstract void showMenu();
		
	public abstract void showViewButton();
	
	public abstract void showRadioButton();

	public abstract void showLabels();
	 
	public abstract void addMenu(String productLevel);
	   
}
