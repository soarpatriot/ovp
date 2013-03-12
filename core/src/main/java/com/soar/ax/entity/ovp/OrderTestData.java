/**
 * 
 */
package com.soar.ax.entity.ovp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuhb7
 *
 */
public class OrderTestData {
	
	public static List<Column> lineItemColumn(){
		//		//{field:'listprice',title:'List Price',width:80,align:'right',sortable:true},
		List<Column> lineItemColumns = new ArrayList<Column>();
		
		Column listPrice = new Column();
		listPrice.setField("listprice");
		listPrice.setTitle("List Price");
		listPrice.setWidth(80);
		listPrice.setAlign("right");
		listPrice.setSortable(true);
		lineItemColumns.add(listPrice);
		
		//{field:'productid',title:'Product ID',width:100,sortable:true},
		Column productId = new Column();
		productId.setField("productid");
		productId.setTitle("Product ID");
		productId.setWidth(100);
		productId.setAlign("right");
		productId.setSortable(true);
		lineItemColumns.add(productId);
		
		return lineItemColumns;
	}
	
	public static List<Column> reportColumns(){
		//		//{field:'listprice',title:'List Price',width:80,align:'right',sortable:true},
		List<Column> allColumns = new ArrayList<Column>();
		allColumns.addAll(lineItemColumn());
		allColumns.addAll(deliveryColumn());
		
		
		return allColumns;
	}
	
	public static List<Column> deliveryColumn(){
		List<Column> delivery = new ArrayList<Column>();
		
		Column itemNumber = new Column();
		itemNumber.setField("itemNumber");
		itemNumber.setTitle("Delivery Item Number");
		itemNumber.setWidth(100);
		itemNumber.setAlign("right");
		itemNumber.setSortable(true);
		delivery.add(itemNumber);
		
		//{field:'productid',title:'Product ID',width:100,sortable:true},
		Column quanity = new Column();
		quanity.setField("quanity");
		quanity.setTitle("Delivery Quantity");
		quanity.setWidth(100);
		quanity.setAlign("right");
		quanity.setSortable(true);
		delivery.add(quanity);
		
		return delivery;
	}
	
	public static List<Delivery> deliveryData(){
		List<Delivery> deliveries = new ArrayList<Delivery>();
		Delivery d1 = new Delivery();
		d1.setDeliveryNumber("0010");
		d1.setDeliveryNumber("5576431");
		d1.setDeliveryBlockHeader("sdf");
		
		Delivery d2 = new Delivery();
		d1.setDeliveryNumber("0020");
		d1.setDeliveryNumber("557643dd");
		d1.setDeliveryBlockHeader("sdf");
		
		
		deliveries.add(d1);
		deliveries.add(d2);
		
		return deliveries;
	}
	
	public static List<LineItem> itemData(){
		List<LineItem> lineItems = new ArrayList<LineItem>();
		LineItem item1 = new LineItem();
		item1.setProductDescription("idea pad");
		item1.setUnitPrice("123.12");
		item1.setDeliveries(deliveryData());
		
		LineItem item2= new LineItem();
		item2.setProductDescription("think");
		item2.setUnitPrice("43.12");
		item2.setDeliveries(deliveryData());
		
		lineItems.add(item1);
		lineItems.add(item2);
		
		return lineItems;
	}
	
	
	/*@RequestMapping(method = RequestMethod.GET)
	public String create() {
		
		Person p = new Person("132213",20);
		
		orderService.saveToMongo(p);
		System.out.println("sdf");
		return "redirect:/right";
	
	}*/
}
