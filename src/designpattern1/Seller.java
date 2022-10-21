package designpattern1;

/**
 * @author Praveen Sama (psama)
 *
 */

//Bridge Implementation
public class Seller extends Person{
	
	Seller()
	{
		super();
	}

	@Override
	public void showMenu() {
		showViewButton();
        showRadioButton();
        showLabels();
        showAddButtons();
	}

	public void showAddButtons()
	{
		Person.theProductMenu.ShowAddButtons();
		
	}
	
	@Override
	public void showViewButton() {
		Person.theProductMenu.ShowAddButtons();

	}

	@Override
	public void showRadioButton() {
		Person.theProductMenu.ShowRadios();
		
	}

	@Override
	public void showLabels() {
		Person.theProductMenu.ShowLabel();

		
	}
	
	//Factory Pattern used here
	@Override
	public void addMenu(String productLevel) {
		String level=productLevel.toLowerCase();
		Person.theProductMenu=Facade.productFactory.getLevel(level);		
	}

}
