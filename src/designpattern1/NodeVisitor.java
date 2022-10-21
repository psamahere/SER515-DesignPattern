package designpattern1;

/**
 * @author Praveen Sama (psama)
 *
 */

public interface NodeVisitor {
	String visit(Facade facade);
	String visit(Product product);
	String visit(Offering offering);

}