package designpattern1;

/**
 * @author Praveen Sama (psama)
 *
 */


public class Reminder {

	NodeVisitor nodeVisitor;
	public void getProductReminders(Facade facade)
	{
		nodeVisitor = new ReminderVisitor();
		nodeVisitor.visit(facade);
	}
}