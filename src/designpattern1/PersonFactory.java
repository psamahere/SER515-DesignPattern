package designpattern1;

//Factory Implementation for Person Objects
public class PersonFactory {
	
	public Person getUser(String user){
     Person person = null;
     switch (user){
         case "buyer":
             person = new Buyer();
             break;
         case "seller":
             person = new Seller();
             break;
     }
     return person;
 }
}