package designpattern1;

/**
* @author Praveen Sama(psama)
*
*/
//Factory Method for Course level
public class ProductLevelFactory {
	
	public ProductMenu getLevel(String product){
       ProductMenu productMenu = null;
       switch (product){
           case "meat":
               productMenu = new MeatMenu();
               break;
           case "produce":
               productMenu = new ProduceMenu();
               break;
       }
       return productMenu;
   }
}
