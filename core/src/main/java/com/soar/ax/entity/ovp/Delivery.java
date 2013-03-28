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

	@Column(name = "DLVRY_NUM")
	private String deliveryNumber;

	@Column(name = "DLVRY_ITEM_NUM")
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

	@Column(name = "DLVRD_QTY")
	private Integer deliveredQuantity;

	@Column(name = "CARR_CD")
	private String carrierCode;

	@Column(name = "CARR_NM")
	private String carrierName;

	@Column(name = "CARR_PHN_DESC_1")
	private String carrierPhoneDescription1;

	@Column(name = "CARR_PHN_DESC_2")
	private String carrierPhoneDescription2;

	@Column(name = "CARR_PHN_NUM_1")
	private String carrierPhoneNumber1;

	@Column(name = "CARR_PHN_NUM_2")
	private String carrierPhoneNumber2;

	@Column(name = "SHPNG_SRC")
	private String shippingSource;

	@Column(name = "CT_ORDR_ENT_TO_SHIP_DT_BSNS")
	private String ctOrderEntryToShipDateBusiness;

	@Column(name = "CT_ORDR_ENT_TO_SHIP_DT_CAL")
	private String ctOrderEntryToShipDateCalendar;

	@Column(name = "CT_ORDR_RCPT_TO_SHIP_DT_BSNS")
	private String ctShipDateBus;

	@Column(name = "CT_ORDR_RCPT_TO_SHIP_DT_CAL")
	private String ctShipDateCalendar;

	@Column(name = "SOS_ORDR_NUM")
	private String sosOrderNumber;

	@Column(name = "CARR_PICK_UP_DT")
	private Date carrierPickUpDate;

	@Column(name = "MODE_OF_TRSPN")
	private String modeOfTransportation;

	@Column(name = "RTE")
	private String route;
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
	/* wave2 new added */
	@Column(name = "NFENUM")
	private String notFisca;
	@Column(name = "PAYMNT_DESC")
	private String paymentDescription;
	
	
	/**
	 * Block ITEM
	 */
	@Column(name="INVC_ITEM_NUM")
	private String invoiceItemNumber;
	@Column(name="PLNT_DLVRY_NUM")
	private String planDeliveryNumber;
	@Column(name="PLNT_DLVRY_ITEM_NUM")
	private String planDeliveryItemNumber;

	
	
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

	public String getSosDeliveryNumber() {
		return sosDeliveryNumber;
	}

	public void setSosDeliveryNumber(String sosDeliveryNumber) {
		this.sosDeliveryNumber = sosDeliveryNumber;
	}

	public Integer getDeliveredQuantity() {
		return deliveredQuantity;
	}

	public void setDeliveredQuantity(Integer deliveredQuantity) {
		this.deliveredQuantity = deliveredQuantity;
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getCarrierPhoneDescription1() {
		return carrierPhoneDescription1;
	}

	public void setCarrierPhoneDescription1(String carrierPhoneDescription1) {
		this.carrierPhoneDescription1 = carrierPhoneDescription1;
	}

	public String getCarrierPhoneDescription2() {
		return carrierPhoneDescription2;
	}

	public void setCarrierPhoneDescription2(String carrierPhoneDescription2) {
		this.carrierPhoneDescription2 = carrierPhoneDescription2;
	}

	public String getCarrierPhoneNumber1() {
		return carrierPhoneNumber1;
	}

	public void setCarrierPhoneNumber1(String carrierPhoneNumber1) {
		this.carrierPhoneNumber1 = carrierPhoneNumber1;
	}

	public String getCarrierPhoneNumber2() {
		return carrierPhoneNumber2;
	}

	public void setCarrierPhoneNumber2(String carrierPhoneNumber2) {
		this.carrierPhoneNumber2 = carrierPhoneNumber2;
	}

	public String getShippingSource() {
		return shippingSource;
	}

	public void setShippingSource(String shippingSource) {
		this.shippingSource = shippingSource;
	}

	public String getCtOrderEntryToShipDateBusiness() {
		return ctOrderEntryToShipDateBusiness;
	}

	public void setCtOrderEntryToShipDateBusiness(
			String ctOrderEntryToShipDateBusiness) {
		this.ctOrderEntryToShipDateBusiness = ctOrderEntryToShipDateBusiness;
	}

	public String getCtOrderEntryToShipDateCalendar() {
		return ctOrderEntryToShipDateCalendar;
	}

	public void setCtOrderEntryToShipDateCalendar(
			String ctOrderEntryToShipDateCalendar) {
		this.ctOrderEntryToShipDateCalendar = ctOrderEntryToShipDateCalendar;
	}

	public String getCtShipDateBus() {
		return ctShipDateBus;
	}

	public void setCtShipDateBus(String ctShipDateBus) {
		this.ctShipDateBus = ctShipDateBus;
	}

	public String getCtShipDateCalendar() {
		return ctShipDateCalendar;
	}

	public void setCtShipDateCalendar(String ctShipDateCalendar) {
		this.ctShipDateCalendar = ctShipDateCalendar;
	}

	public String getSosOrderNumber() {
		return sosOrderNumber;
	}

	public void setSosOrderNumber(String sosOrderNumber) {
		this.sosOrderNumber = sosOrderNumber;
	}

	public Date getCarrierPickUpDate() {
		return carrierPickUpDate;
	}

	public void setCarrierPickUpDate(Date carrierPickUpDate) {
		this.carrierPickUpDate = carrierPickUpDate;
	}

	public String getModeOfTransportation() {
		return modeOfTransportation;
	}

	public void setModeOfTransportation(String modeOfTransportation) {
		this.modeOfTransportation = modeOfTransportation;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Date getArDueDate() {
		return arDueDate;
	}

	public void setArDueDate(Date arDueDate) {
		this.arDueDate = arDueDate;
	}

	public String getArPaymentTerm() {
		return arPaymentTerm;
	}

	public void setArPaymentTerm(String arPaymentTerm) {
		this.arPaymentTerm = arPaymentTerm;
	}

	public Date getCashClearanceDate() {
		return cashClearanceDate;
	}

	public void setCashClearanceDate(Date cashClearanceDate) {
		this.cashClearanceDate = cashClearanceDate;
	}

	public Date getArReceivingDate() {
		return arReceivingDate;
	}

	public void setArReceivingDate(Date arReceivingDate) {
		this.arReceivingDate = arReceivingDate;
	}

	public String getDisputeCategoryCode() {
		return disputeCategoryCode;
	}

	public void setDisputeCategoryCode(String disputeCategoryCode) {
		this.disputeCategoryCode = disputeCategoryCode;
	}

	public String getDisputeCategoryDesc() {
		return disputeCategoryDesc;
	}

	public void setDisputeCategoryDesc(String disputeCategoryDesc) {
		this.disputeCategoryDesc = disputeCategoryDesc;
	}

	public String getDisputeReasonCode() {
		return disputeReasonCode;
	}

	public void setDisputeReasonCode(String disputeReasonCode) {
		this.disputeReasonCode = disputeReasonCode;
	}

	public String getDisputeReasonDesc() {
		return disputeReasonDesc;
	}

	public void setDisputeReasonDesc(String disputeReasonDesc) {
		this.disputeReasonDesc = disputeReasonDesc;
	}

	public String getDisputeRootCauseCode() {
		return disputeRootCauseCode;
	}

	public void setDisputeRootCauseCode(String disputeRootCauseCode) {
		this.disputeRootCauseCode = disputeRootCauseCode;
	}

	public String getDisputeRootCauseDesc() {
		return disputeRootCauseDesc;
	}

	public void setDisputeRootCauseDesc(String disputeRootCauseDesc) {
		this.disputeRootCauseDesc = disputeRootCauseDesc;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getNotFisca() {
		return notFisca;
	}

	public void setNotFisca(String notFisca) {
		this.notFisca = notFisca;
	}

	public String getInvoiceItemNumber() {
		return invoiceItemNumber;
	}

	public void setInvoiceItemNumber(String invoiceItemNumber) {
		this.invoiceItemNumber = invoiceItemNumber;
	}

	public String getPlanDeliveryNumber() {
		return planDeliveryNumber;
	}

	public void setPlanDeliveryNumber(String planDeliveryNumber) {
		this.planDeliveryNumber = planDeliveryNumber;
	}

	public String getPlanDeliveryItemNumber() {
		return planDeliveryItemNumber;
	}

	public void setPlanDeliveryItemNumber(String planDeliveryItemNumber) {
		this.planDeliveryItemNumber = planDeliveryItemNumber;
	}

	public String getPaymentDescription() {
		return paymentDescription;
	}

	public void setPaymentDescription(String paymentDescription) {
		this.paymentDescription = paymentDescription;
	}

}
