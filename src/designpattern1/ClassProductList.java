package designpattern1;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Praveen Sama (psama)
 *
 */

//ArrayList Implementation for Course List
public class ClassProductList implements ArrayList<Product> {
	private List<Product> list;
	private ProductIterator productIterator;
	
	ClassProductList(List<Product> list) {		
		this.list = new LinkedList<>(list);
		
	}

	@Override
	public ListIterator<Product> iterator() {
		this.productIterator = new ProductIterator(this.list);
		return this.productIterator;
	}

}
