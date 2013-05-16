/**
 * 
 */
package com.soar.ax.entity.ovp;

import java.lang.reflect.Field;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author liuhb7
 *
 */
public class ColumnAs {
	
	@Ignore
	@Test	
	public void obtainLineItemSelectColumns(){
		LineItem item = new LineItem();
		Field[] fields = item.getClass().getDeclaredFields();
		
		//String seleted = "";
		StringBuilder sBuilder = new StringBuilder();
		for(Field f: fields){
			javax.persistence.Column col = f.getAnnotation(javax.persistence.Column.class);
			if(null != col){
				String dbColumnName = col.name();
				sBuilder.append("item.");
				sBuilder.append(dbColumnName);
				sBuilder.append(" as ");
				sBuilder.append(f.getName());
				sBuilder.append(", \n");
			}
			
		}
		System.out.print(sBuilder.toString());
	}
	@Ignore
	@Test	
	public void obtainDeliveryColumns(){
		Delivery item = new Delivery();
		Field[] fields = item.getClass().getDeclaredFields();
		
		//String seleted = "";
		StringBuilder sBuilder = new StringBuilder();
		for(Field f: fields){
			javax.persistence.Column col = f.getAnnotation(javax.persistence.Column.class);
			if(null != col){
				String dbColumnName = col.name();
				sBuilder.append("delivery.");
				sBuilder.append(dbColumnName);
				sBuilder.append(" as ");
				sBuilder.append(f.getName());
				sBuilder.append(", \n");
			}
			
		}
		System.out.print(sBuilder.toString());
	}
	
	@Test	
	public void obtainColumns(){
		ColumnCollection item = new ColumnCollection();
		Field[] fields = item.getClass().getDeclaredFields();
		
		//String seleted = "";
		StringBuilder sBuilder = new StringBuilder();
		for(Field f: fields){
			javax.persistence.Column col = f.getAnnotation(javax.persistence.Column.class);
			if(null != col){
				String dbColumnName = col.name();
				sBuilder.append("tckg_sn.");
				sBuilder.append(dbColumnName);
				sBuilder.append(" as ");
				sBuilder.append(f.getName());
				sBuilder.append(", \n");
			}
			
		}
		System.out.print(sBuilder.toString());
	}
}
