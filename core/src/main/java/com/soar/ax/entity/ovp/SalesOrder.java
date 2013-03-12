/**
 * Copyright (c) 2011, Lenovo Group, Ltd. All rights reserved.
 */
package com.soar.ax.entity.ovp;

import java.util.Date;

import javax.persistence.Column;

/**
 * <p>
 * 
 * <dl>
 * <dt><b>Examples:</b></dt>
 * <p>
 * 
 * <pre>
 * </pre>
 * 
 * <p>
 * <dt><b>Thread Safety:</b></dt>
 * <dd> <b>NOT-THREAD-SAFE</b> and <b>NOT-APPLICABLE</b> (for it will never be
 * used on multi-thread occasion.) </dd>
 * 
 * <p>
 * <dt><b>Serialization:</b></dt>
 * <dd> <b>NOT-SERIALIIZABLE</b> and <b>NOT-APPLICABLE</b> (for it have no
 * need to be serializable.) </dd>
 * 
 * <p>
 * <dt><b>Design Patterns:</b></dt>
 * <dd>
 * 
 * </dd>
 * 
 * <p>
 * <dt><b>Change History:</b></dt>
 * <dd> Date Author Action </dd>
 * <dd> Mar 2, 2011 henry leu Create the class </dd>
 * 
 * </dl>
 * 
 * @author Soar
 * @see
 * @see
 */

public class SalesOrder {
	 
	@Column(name = "SLS_ORDR_NUM")
    private String salesOrderNumber;
	
    @Column(name = "ORDR_AMT_HDR")
    private String purchaseAmount;
    
    @Column(name = "ORDR_ENT_TM")
    private String orderEntryTime;

    @Column(name = "ORDR_CHG_DT")
    private Date orderChangeDate;

    @Column(name = "ORDR_RCPT_DT")
    private Date orderReceiptDate;
    
	@Column(name = "ORDR_TYPE")
	private String orderType;
	
	@Column(name = "ORDR_TYPE_DESC")
	private String orderTypeDescription;
	
	@Column(name = "ORDR_STS_HDR")
	private String orderStatusHeader;
	
	@Column(name = "HDR_CRNCY")
	private String headerCurrency;
	
	@Column(name = "TOT_PRC_ORDR_TAX")
	private String totalPurchaseOrderTax;

	@Column(name = "DOC_DT")
	private Date documentDate;

	@Column(name = "ORDR_ENT_DT")
	private Date orderEntryDate;
	
	@Column(name = "CUST_RQSTD_ARR_DT")
	private Date customerRequestedArrivalDate;
	
	@Column(name = "CUST_PO_NUM")
	private String customerPurchaseOrderNumber;


	@Column(name = "ORDRG_METH")
	private String orderingMethod;

	@Column(name = "ORDRG_METH_DESC")
	private String orderingMethodDescription;


	@Column(name = "TRAN_OR_RLTN")
	private String transactionorRelation;

	
	@Column(name = "LOCAL_CRNCY")
	private String localCurrency;

	@Column(name = "DOC_CRNCY")
	private String documentCurrency;
	/**
	 * Base LOCAL_CRNCY
	 */
	@Column(name = "TOT_AMT_IN_LOCAL_CRNCY")
	private String toltalAmountInLocCurrency;
	/**
	 * Base DOC_CRNCY
	 */
	@Column(name = "TOT_AMT_IN_DOC_CRNCY")
	private String toltalAmountInDocCurrency;

	@Column(name = "SHIP_ORDR_NUM")
	private String shipAmount;

	@Column(name = "TAX_ORDR_NUM")
	private String taxAmount;

	@Column(name = "REC_FEE")
	private String recyclingFees;

	@Column(name = "CUST_RQSTD_ARR_DT_ITEM")
	private Date itemCrad;
    
    @Column(name = "SOS_ORDR_NUM")
    private String sosOrderNumber;
    
    @Column(name = "SOLD_TO_CUST_NUM")
    private String soldToCustomerNumber;

    @Column(name = "SOLD_TO_CUST_NM")
    private String soldToCustomerName;

    @Column(name = "SOLD_TO_CUST_NM2")
    private String soldToCustomerName2;

    @Column(name = "SOLD_TO_CUST_NM3")
    private String soldToCustomerName3;

    @Column(name = "SOLD_TO_CUST_NM4")
    private String soldToCustomerName4;

    
    @Column(name = "CRDT_CARD_TYPE")
    private String creditCardType;

    @Column(name = "CRDT_CARD_LAST_4_DIG")
    private String creditCardLast4Digit;
    
    
	public String getSalesOrderNumber() {
		return salesOrderNumber;
	}

	public void setSalesOrderNumber(String salesOrderNumber) {
		this.salesOrderNumber = salesOrderNumber;
	}

	public String getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(String purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public String getOrderEntryTime() {
		return orderEntryTime;
	}

	public void setOrderEntryTime(String orderEntryTime) {
		this.orderEntryTime = orderEntryTime;
	}

	public Date getOrderChangeDate() {
		return orderChangeDate;
	}

	public void setOrderChangeDate(Date orderChangeDate) {
		this.orderChangeDate = orderChangeDate;
	}

	public Date getOrderReceiptDate() {
		return orderReceiptDate;
	}

	public void setOrderReceiptDate(Date orderReceiptDate) {
		this.orderReceiptDate = orderReceiptDate;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderTypeDescription() {
		return orderTypeDescription;
	}

	public void setOrderTypeDescription(String orderTypeDescription) {
		this.orderTypeDescription = orderTypeDescription;
	}

	public String getOrderStatusHeader() {
		return orderStatusHeader;
	}

	public void setOrderStatusHeader(String orderStatusHeader) {
		this.orderStatusHeader = orderStatusHeader;
	}

	public String getHeaderCurrency() {
		return headerCurrency;
	}

	public void setHeaderCurrency(String headerCurrency) {
		this.headerCurrency = headerCurrency;
	}

	public String getTotalPurchaseOrderTax() {
		return totalPurchaseOrderTax;
	}

	public void setTotalPurchaseOrderTax(String totalPurchaseOrderTax) {
		this.totalPurchaseOrderTax = totalPurchaseOrderTax;
	}

	public Date getDocumentDate() {
		return documentDate;
	}

	public void setDocumentDate(Date documentDate) {
		this.documentDate = documentDate;
	}

	public Date getOrderEntryDate() {
		return orderEntryDate;
	}

	public void setOrderEntryDate(Date orderEntryDate) {
		this.orderEntryDate = orderEntryDate;
	}

	public Date getCustomerRequestedArrivalDate() {
		return customerRequestedArrivalDate;
	}

	public void setCustomerRequestedArrivalDate(Date customerRequestedArrivalDate) {
		this.customerRequestedArrivalDate = customerRequestedArrivalDate;
	}

	public String getCustomerPurchaseOrderNumber() {
		return customerPurchaseOrderNumber;
	}

	public void setCustomerPurchaseOrderNumber(String customerPurchaseOrderNumber) {
		this.customerPurchaseOrderNumber = customerPurchaseOrderNumber;
	}


	public String getOrderingMethod() {
		return orderingMethod;
	}

	public void setOrderingMethod(String orderingMethod) {
		this.orderingMethod = orderingMethod;
	}

	public String getOrderingMethodDescription() {
		return orderingMethodDescription;
	}

	public void setOrderingMethodDescription(String orderingMethodDescription) {
		this.orderingMethodDescription = orderingMethodDescription;
	}


	public String getTransactionorRelation() {
		return transactionorRelation;
	}

	public void setTransactionorRelation(String transactionorRelation) {
		this.transactionorRelation = transactionorRelation;
	}


	public String getLocalCurrency() {
		return localCurrency;
	}

	public void setLocalCurrency(String localCurrency) {
		this.localCurrency = localCurrency;
	}

	public String getDocumentCurrency() {
		return documentCurrency;
	}

	public void setDocumentCurrency(String documentCurrency) {
		this.documentCurrency = documentCurrency;
	}

	public String getToltalAmountInLocCurrency() {
		return toltalAmountInLocCurrency;
	}

	public void setToltalAmountInLocCurrency(String toltalAmountInLocCurrency) {
		this.toltalAmountInLocCurrency = toltalAmountInLocCurrency;
	}

	public String getToltalAmountInDocCurrency() {
		return toltalAmountInDocCurrency;
	}

	public void setToltalAmountInDocCurrency(String toltalAmountInDocCurrency) {
		this.toltalAmountInDocCurrency = toltalAmountInDocCurrency;
	}

	public String getShipAmount() {
		return shipAmount;
	}

	public void setShipAmount(String shipAmount) {
		this.shipAmount = shipAmount;
	}

	public String getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getRecyclingFees() {
		return recyclingFees;
	}

	public void setRecyclingFees(String recyclingFees) {
		this.recyclingFees = recyclingFees;
	}

	public Date getItemCrad() {
		return itemCrad;
	}

	public void setItemCrad(Date itemCrad) {
		this.itemCrad = itemCrad;
	}

	public String getSosOrderNumber() {
		return sosOrderNumber;
	}

	public void setSosOrderNumber(String sosOrderNumber) {
		this.sosOrderNumber = sosOrderNumber;
	}

	public String getSoldToCustomerNumber() {
		return soldToCustomerNumber;
	}

	public void setSoldToCustomerNumber(String soldToCustomerNumber) {
		this.soldToCustomerNumber = soldToCustomerNumber;
	}

	public String getSoldToCustomerName() {
		return soldToCustomerName;
	}

	public void setSoldToCustomerName(String soldToCustomerName) {
		this.soldToCustomerName = soldToCustomerName;
	}

	public String getSoldToCustomerName2() {
		return soldToCustomerName2;
	}

	public void setSoldToCustomerName2(String soldToCustomerName2) {
		this.soldToCustomerName2 = soldToCustomerName2;
	}

	public String getSoldToCustomerName3() {
		return soldToCustomerName3;
	}

	public void setSoldToCustomerName3(String soldToCustomerName3) {
		this.soldToCustomerName3 = soldToCustomerName3;
	}

	public String getSoldToCustomerName4() {
		return soldToCustomerName4;
	}

	public void setSoldToCustomerName4(String soldToCustomerName4) {
		this.soldToCustomerName4 = soldToCustomerName4;
	}

	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}

	public String getCreditCardLast4Digit() {
		return creditCardLast4Digit;
	}

	public void setCreditCardLast4Digit(String creditCardLast4Digit) {
		this.creditCardLast4Digit = creditCardLast4Digit;
	}

}