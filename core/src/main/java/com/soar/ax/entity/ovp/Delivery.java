/**
 * 
 */
package com.soar.ax.entity.ovp;

import java.util.List;

/**
 * @author liuhb7
 *
 */
public class Delivery {
	
	private String itemNumber;
	private String number;
	private long quanity;
	
    private List<Shipping> shippings;
	
	public String getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public long getQuanity() {
		return quanity;
	}
	public void setQuanity(long quanity) {
		this.quanity = quanity;
	}
	public List<Shipping> getShippings() {
		return shippings;
	}
	public void setShippings(List<Shipping> shippings) {
		this.shippings = shippings;
	}
}
