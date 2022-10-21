package designpattern1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Praveen Sama (psama)
 *
 */

public class ReminderVisitor implements NodeVisitor {
	
	@Override
	public String visit(Offering offering) {
		
		String name = offering.getName();	
		String date = offering.getLastDate();
		System.out.println(name+" Last Date :"+date);	
		return name+" last Date :"+date;
	}
	
	@Override
	public String visit(Facade facade) {
		ListIterator<Product> iterator = facade.theProductList.iterator();	        
        while(iterator.hasNext()) {
            Product currentProduct = iterator.next();
            currentProduct.accept(this);
        }
        return "";
		
	}

	@Override
	public String visit(Product product) {
		System.out.println(product.getName());
		String line;
		try {
			File file = new File("src/Offering.txt");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
				while ((line = bufferedReader.readLine()) != null)
				{					
					String array[] = line.split(":");
					String assignName = array[0];
					String lastDate = array[1];					
					Offering offering= new Offering();
					offering.setName(assignName);
					offering.setLastDate(lastDate);	
					offering.accept(this);
				}
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		String name = product.getName();
		return name;
	}
}
