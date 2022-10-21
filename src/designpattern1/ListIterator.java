package designpattern1;

/**
 * @author Praveen Sama (psama)_
 *
 */
//ListIterator Design
public interface ListIterator<Element> {
	
	public boolean hasNext();
	public Element next();
	public void moveToStart();

}
