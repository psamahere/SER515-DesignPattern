package designpattern1;

/*
* @author Praveen Sama (psama)
*
*/

//Bridge Pattern Implementation

public class MeatMenu implements ProductMenu{

	@Override
	public void ShowAddButtons() {
		System.out.println("MeatMenu View Buttons are shown here");
		
	}

	@Override
	public void ShowRadios() {
		System.out.println("MeatMenu Radio Buttons are shown here");

		
	}

	@Override
	public void ShowLabel() {
		System.out.println("MeatMenu Labels are shown here");

		
	}

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAddButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showViewButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showRadioButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showLabels() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showComboxes() {
		// TODO Auto-generated method stub
		
	}
	

}