package designpattern1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Praveen Sama (psama)
 *
 */

//Design Pattern for Facade
public class Facade {

	private int userType;

	private Product theSelectedProduct;

	private int nProductCategory;
	
	private static PersonFactory personFactory = new PersonFactory();
	
	public  static ProductLevelFactory productFactory = new ProductLevelFactory();
	
	public static ArrayList<Product> theProductList1;

	ClassProductList theProductList;

	private Person person;

	private File currentProduct;
	
	// Login function checks the authentication functionality
	public void login() {
		String user="";
		boolean checkLogin = false;
		
		try {
			while(true)
			{	
				System.out.println("Please enter  the username : ");
				String userName = DesignPatternMain.scanner.nextLine();
				System.out.println("Please enter password : ");
				String password = DesignPatternMain.scanner.nextLine();
				String eachLine="";
				File file = new File("src/BuyerInfo.txt");
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);		  
				while ((eachLine = bufferedReader.readLine()) != null)
				{
						String array[] = eachLine.split(":");
						if(array[0].equals(userName) && array[1].equals(password))
						{
								System.out.println("Logged as Buyer ");
								System.out.println("******************");
								user = "buyer";
								checkLogin = true;
								break;
						}
				} 
				file = new File("src/SellerInfo.txt");
				bufferedReader.close();
				bufferedReader = new BufferedReader(new FileReader(file));
				while ((eachLine = bufferedReader.readLine()) != null)
					{
						String array[] = eachLine.split(":");
						if(array[0].equals(userName))
						{
							if(array[1].equals(password))
							{
								System.out.println("Logged as Seller ");
								user = "seller";
								checkLogin = true; 
								break;
							}
						}
					}
				fileReader.close();
				bufferedReader.close();	
				if(!checkLogin)
                {
					System.out.println("Username or Password is incorrect");
					System.out.println("**********************************");

				}
				else {
					  break;				
				}
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		createUser(user);

		}
	

	//Factory pattern for creating types of items 	
	public void menuItems(){
			int option;		
			while(true)
			{
				System.out.println("Please select an option");
				System.out.println("1) Create Product List");
				System.out.println("2) View Product List");
				System.out.println("3) View Reminders");
				try {
					option = DesignPatternMain.scanner.nextInt();			
					switch(option)
					{
						case 1:		
							System.out.println("Factory Pattern for Creating Product Menu");
						   	System.out.println("------------------------------------------");

								boolean flag =false;
								int subOption;
								while(!flag)
								{
									System.out.println("Please select type (choose 1 or 2 )");
									System.out.println("1) Meat ");
									System.out.println("2) Produce");
			                        subOption = DesignPatternMain.scanner.nextInt();
									switch(subOption) {
									case 1:
											person.addMenu("MeatMenu"); 
											flag=true;
											break;
									case 2:
											person.addMenu("ProduceMenu");
											flag=true;
											break;
									default:
										System.out.println("Please Select valid Choice");
											break;
									}
									
								}
								break;
						case 2:
							   	System.out.println("Bridge pattern between type of user and corresponding level :");
							   	System.out.println("---------------------------------------------------------------");

								person.showMenu();
								System.out.println("\n");
								break;
						case 3:
								System.out.println("Vistior Pattern :");
							   	System.out.println("------------------");

								remind();
								System.out.println("\n");
								break;
						default:
								System.out.println("Please Select Valid Choice");
								break;
					}
				}
				catch(Exception e)
				{
					System.out.println("You cannot view Product Menu before creating it ");
				}
				}
			
	}
	
	
	//Displaying and selecting the items among the list using Iterator Pattern
	public void addTrading(ArrayList<Product> products) {
		System.out.println("Iterator Pattern :");
	   	System.out.println("--------------------");
        System.out.println("Please select a item from below Listed");
        System.out.println("choose the number (1 or 2 )");
		ListIterator<Product> iterator = (ListIterator<Product>) products.iterator();	   
		int i=1;
        while(iterator.hasNext()) {
            Product currentProduct = iterator.next();
            System.out.println(i + ". "+currentProduct.getName());
            i++;
        }
    	boolean flag=false;
        Product selectedProduct=null;
        while(!flag) {
	        int choice = DesignPatternMain.scanner.nextInt();
	        i=1;
	        iterator.moveToStart();
	        while(iterator.hasNext()) {
	        	 selectedProduct=iterator.next();
	            if(i==choice)
	            {
	            	flag=true;
	            	break;
	            }
	            i++;
	        }
	        if(!flag)
	        	System.out.println("Please select a valid item");
        }
        System.out.println("you have selected " +selectedProduct.getName());
        System.out.println("*************************");
	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	//remind method notifies all the reminders for the corresponding items using vistor pattern
	public void remind() {
		Reminder reminder = new Reminder();
		reminder.getProductReminders(this);		

	}
	
	//User is created based on user info with the help of Factory Pattern
	public void createUser(String user) {
		System.out.println("Factory Pattern for creating the User");
	   	System.out.println("--------------------------------------");
		person=personFactory.getUser(user);
		System.out.println("User has been successfully created\n");
		createProductList();
		selectProduct(theProductList);
		menuItems();

	}

	private void selectProduct(ClassProductList theProductList2) {
		// TODO Auto-generated method stub
		
	}


	public void createProductList() {
		List<Product> list = new LinkedList<>();
		String products;
		try {		
				File file = new File("src/ProductInfo.txt");
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferReader = new BufferedReader(fileReader);				  
					while ((products = bufferReader.readLine()) != null)
					{
						Product pdt=new Product();
						pdt.setName(products);				
						 list.add(pdt);
					}
					bufferReader.close();
		}
		 catch (IOException e) {
			e.printStackTrace();
		} 			
		
		

	}

	public void AttachProductToUser() {

	}

	public void SelectProduct(ArrayList<Product> products) {
		System.out.println("Iterator Pattern :");
	   	System.out.println("--------------------");
        System.out.println("Please select a product from below Listed");
        System.out.println("choose the number (1 or 2)");
		ListIterator<Product> iterator = products.iterator();	   
		int i=1;
        while(iterator.hasNext()) {
            Product currentCourse = iterator.next();
            System.out.println(i + ". "+currentProduct.getName());
            i++;
        }
    	boolean flag=false;
        Product selectedProduct=null;
        while(!flag) {
	        int choice = DesignPatternMain.scanner.nextInt();
	        i=1;
	        iterator.moveToStart();
	        while(iterator.hasNext()) {
	        	 selectedProduct=iterator.next();
	            if(i==choice)
	            {
	            	flag=true;
	            	break;
	            }
	            i++;
	        }
	        if(!flag)
	        	System.out.println("Please select a valid product");
        }
        System.out.println("you have selected " +selectedProduct.getName()+ " Product");
        System.out.println("*************************");

	}

}

