/**
 * 
 */
package com.soar.ax.entity.ovp;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;

/**
 * @author liuhb7
 *
 */
public class Shipping {
	
    
   
	@Column(name = "CARR_TCKG_NUM")
    private String carrierTrackingNumber;
	
	@Column(name = "DLVRY_ITEM_NUM")
    private String deliveryItemNumber;
	
	@Column(name = "CARR_TCKG_QTY")
    private Integer carrierTrackingQuantity;
	
    @Column(name = "SHIP_STS_DESC")
    private String milestone;
    
    @Column(name = "X1_STS_DTTM")
    //Milestone code X1 create time 
    private Date x1SttaSDttm;
    
    @Column(name = "AF_STS_DTTM")
    //Milestone code AF create time 
    private Date afStatsDttm;
    
    @Column(name = "X4_STS_DTTM")
    //Milestone code X4 create time 
    private Date x4StatsDttm;   
    
    @Column(name = "AE_STS_DTTM")
    //Milestone code AE create time
    private Date aeStatsDttm;
    
    @Column(name = "F_STS_DTTM")
    //Milestone code F create time
    private Date f1StatsDttm;
    
    @Column(name = "E_STS_DTTM")
    //Milestone code E create time 
    private Date e1StatsDttm;
    
    @Column(name = "A_STS_DTTM")
    //Milestone code A create time
    private Date a1StatsDttm;
    
    @Column(name = "CT_STS_DTTM")
    //Milestone code CT create time 
    private Date ctStatsDttm;
    
    @Column(name = "UV_STS_DTTM")
    //Milestone code UV create time 
    private Date uvStatsDttm;
    
    @Column(name = "D_STS_DTTM")
    //Milestone code D create time
    private Date d1StatsDttm;
    
    @Column(name = "OA_STS_DTTM")
    //Milestone code OA create time 
    private Date oaStatsDttm;

    private List<Serial> serials;

	public String getCarrierTrackingNumber() {
		return carrierTrackingNumber;
	}

	public void setCarrierTrackingNumber(String carrierTrackingNumber) {
		this.carrierTrackingNumber = carrierTrackingNumber;
	}

	public String getDeliveryItemNumber() {
		return deliveryItemNumber;
	}

	public void setDeliveryItemNumber(String deliveryItemNumber) {
		this.deliveryItemNumber = deliveryItemNumber;
	}

	public Integer getCarrierTrackingQuantity() {
		return carrierTrackingQuantity;
	}

	public void setCarrierTrackingQuantity(Integer carrierTrackingQuantity) {
		this.carrierTrackingQuantity = carrierTrackingQuantity;
	}

	public String getMilestone() {
		return milestone;
	}

	public void setMilestone(String milestone) {
		this.milestone = milestone;
	}

	public Date getX1SttaSDttm() {
		return x1SttaSDttm;
	}

	public void setX1SttaSDttm(Date sttaSDttm) {
		x1SttaSDttm = sttaSDttm;
	}

	public Date getAfStatsDttm() {
		return afStatsDttm;
	}

	public void setAfStatsDttm(Date afStatsDttm) {
		this.afStatsDttm = afStatsDttm;
	}

	public Date getX4StatsDttm() {
		return x4StatsDttm;
	}

	public void setX4StatsDttm(Date statsDttm) {
		x4StatsDttm = statsDttm;
	}

	public Date getAeStatsDttm() {
		return aeStatsDttm;
	}

	public void setAeStatsDttm(Date aeStatsDttm) {
		this.aeStatsDttm = aeStatsDttm;
	}

	public Date getF1StatsDttm() {
		return f1StatsDttm;
	}

	public void setF1StatsDttm(Date statsDttm) {
		f1StatsDttm = statsDttm;
	}

	public Date getE1StatsDttm() {
		return e1StatsDttm;
	}

	public void setE1StatsDttm(Date statsDttm) {
		e1StatsDttm = statsDttm;
	}

	public Date getA1StatsDttm() {
		return a1StatsDttm;
	}

	public void setA1StatsDttm(Date statsDttm) {
		a1StatsDttm = statsDttm;
	}

	public Date getCtStatsDttm() {
		return ctStatsDttm;
	}

	public void setCtStatsDttm(Date ctStatsDttm) {
		this.ctStatsDttm = ctStatsDttm;
	}

	public Date getUvStatsDttm() {
		return uvStatsDttm;
	}

	public void setUvStatsDttm(Date uvStatsDttm) {
		this.uvStatsDttm = uvStatsDttm;
	}

	public Date getD1StatsDttm() {
		return d1StatsDttm;
	}

	public void setD1StatsDttm(Date statsDttm) {
		d1StatsDttm = statsDttm;
	}

	public Date getOaStatsDttm() {
		return oaStatsDttm;
	}

	public void setOaStatsDttm(Date oaStatsDttm) {
		this.oaStatsDttm = oaStatsDttm;
	}

	public List<Serial> getSerials() {
		return serials;
	}

	public void setSerials(List<Serial> serials) {
		this.serials = serials;
	}

	
}
