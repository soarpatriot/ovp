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
public class Delivery {
	

	private String deliveryNumber;
	 
	private String deliveryItemNumber;
    @Column(name = "SOS_DLVRY_NUM")
    private String sosDeliveryNumber;

	@Column(name = "DLVRY_NOTES")
    private String deliveryNotes;
	
	@Column(name = "DLVRY_BLK_ITEM")
    private String deliveryBlockItem;

    @Column(name = "DLVRY_BLK_HDR")
    private String deliveryBlockHeader;

    @Column(name = "DLVRY_BLK_DESC_HDR")
    private String deliveryBlockDescriptionHeader;

    /**
     * invoice information
     */
    @Column(name = "INVC_NUM")
    private String invoiceNumber;

    @Column(name = "INVC_DT")
    private Date invoiceDate;
    @Column(name = "AR_DUE_DT")
    private Date arDueDate;
    
    @Column(name = "AR_PYMT_TERM")
    private String arPaymentTerm;
    
    @Column(name = "CASH_CLRG_DT")
    private Date cashClearanceDate;
    
    @Column(name = "AR_RECV_DT")
    private Date arReceivingDate;
    
    @Column(name = "DSPUT_CTGRY_CD")
    private String disputeCategoryCode;
    
    @Column(name = "DSPUT_CTGRY_DESC")
    private String disputeCategoryDesc;
    
    @Column(name = "DSPUT_RSN_CD")
    private String disputeReasonCode;
    
    @Column(name = "DSPUT_RSN_DESC")
    private String disputeReasonDesc;
    
    @Column(name = "DSPUT_ROOT_CAUSE_CD")
    private String disputeRootCauseCode;
    
    @Column(name = "DSPUT_ROOT_CAUSE_DESC")
    private String disputeRootCauseDesc;
    
    @Column(name = "SERIES")
    private String series;
    /*wave2 new added*/
    @Column(name = "NFENUM")
    private String notFisca;
    
    
    private List<Shipping> shippings;

	public String getDeliveryNumber() {
		return deliveryNumber;
	}

	public void setDeliveryNumber(String deliveryNumber) {
		this.deliveryNumber = deliveryNumber;
	}

	public String getDeliveryItemNumber() {
		return deliveryItemNumber;
	}

	public void setDeliveryItemNumber(String deliveryItemNumber) {
		this.deliveryItemNumber = deliveryItemNumber;
	}

	public String getDeliveryNotes() {
		return deliveryNotes;
	}

	public void setDeliveryNotes(String deliveryNotes) {
		this.deliveryNotes = deliveryNotes;
	}

	public String getDeliveryBlockItem() {
		return deliveryBlockItem;
	}

	public void setDeliveryBlockItem(String deliveryBlockItem) {
		this.deliveryBlockItem = deliveryBlockItem;
	}

	public String getDeliveryBlockHeader() {
		return deliveryBlockHeader;
	}

	public void setDeliveryBlockHeader(String deliveryBlockHeader) {
		this.deliveryBlockHeader = deliveryBlockHeader;
	}

	public String getDeliveryBlockDescriptionHeader() {
		return deliveryBlockDescriptionHeader;
	}

	public void setDeliveryBlockDescriptionHeader(
			String deliveryBlockDescriptionHeader) {
		this.deliveryBlockDescriptionHeader = deliveryBlockDescriptionHeader;
	}

	public List<Shipping> getShippings() {
		return shippings;
	}

	public void setShippings(List<Shipping> shippings) {
		this.shippings = shippings;
	}
	
	
}
