package designpattern1;

/*
* @author Praveen Sama (psama)
*
*/
//Bridge Pattern Implementation

public class ProduceMenu implements ProductMenu {

	@Override
	public void ShowAddButtons() {
		System.out.println("ProduceMenu Add Buttons are shown here");
	
	}

	@Override
	public void ShowRadios() {
		System.out.println("ProduceMenu Radio Buttons are shown here");
		
	}

	@Override
	public void ShowLabel() {
		System.out.println("ProduceMenu Labels are shown here");
		
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
