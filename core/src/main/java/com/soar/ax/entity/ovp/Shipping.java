/**
 * 
 */
package com.soar.ax.entity.ovp;

import java.util.List;

/**
 * @author liuhb7
 *
 */
public class Shipping {
	
	private String itemNumber;
	private String number;
	private long quanity;
	
	private List<Serial> serials;
	
	public List<Serial> getSerials() {
		return serials;
	}
	public void setSerials(List<Serial> serials) {
		this.serials = serials;
	}
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
}
