package designpattern1;

import java.util.ArrayList;

/**
 * @author Praveen Sama (psama)
 *
 */

public class Offering {
	private String name;
	private String lastDate;
	private ArrayList<Offering> offeringList;

	public ArrayList<Offering> getOfferingList() {
		return offeringList;
	}

	public void setOfferingList(ArrayList<Offering> offeringList) {
		this.offeringList = offeringList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastDate() {
		return lastDate;
	}

	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}

	public void accept(NodeVisitor nodeVisitor) {
		
		nodeVisitor.visit(this);

	}
}
