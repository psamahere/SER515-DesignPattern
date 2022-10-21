package designpattern1;

/**
 * @author Praveen Sama (psama)
 *
 */

public class Product  {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void accept(NodeVisitor nodeVistor) {
		nodeVistor.visit(this);
	}
	

}