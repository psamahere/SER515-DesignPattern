package designpattern1;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Praveen Sama (psama)
 *
 */

//ListIterator Implementation for Product Iterator
public class ProductIterator implements ListIterator<Product> {
	private List<Product> list;
	private int index;
	ProductIterator(List<Product> list)
	{
		this.list= new LinkedList<>(list);
		index =0;
	}

	@Override
	public boolean hasNext() {
		if(index>list.size()-1)
			return false;
		return true;
	}

	@Override
	public Product next() {
		Product product=list.get(index);
		index++;
		return product;
	}

	@Override
	public void moveToStart() {
		index=0;
		return;
		
	}

}
