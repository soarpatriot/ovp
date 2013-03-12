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
	
    
   
    
	@Column(name = "FIRM_SHIP_DT")
    private Date firmShipDate;
	
    @Column(name = "FIRM_ARR_DT")
    private Date firmArrivalDate;
    
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

    @Column(name = "CARR_TCKG_NUM")
    private String carrierTrackingNumber;
    /** hubaozhong 2012-2-17 13:39 */
    @Column(name = "CARR_TCKG_QTY")
    private Integer carrierTrackingQuantity;

    @Column(name = "CARR_PICK_UP_DT")
    private Date carrierPickUpDate;

    @Column(name = "MODE_OF_TRSPN")
    private String modeOfTransportation;
    
    @Column(name = "RTE")
    private String route;

    @Column(name = "SHPNG_SRC")
    private String shippingSource;

    @Column(name = "CALC_ARR_DT")
    private Date calculateArrivalDate;
    
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
	
    
    //fff
    @Column(name = "CT_ORDR_ENT_TO_SHIP_DT_BSNS")
    private String ctOrderEntryToShipDateBusiness;

    @Column(name = "CT_ORDR_ENT_TO_SHIP_DT_CAL")
    private String ctOrderEntryToShipDateCalendar;

    @Column(name = "CT_ORDR_RCPT_TO_SHIP_DT_BSNS")
    private String ctShipDateBus;

    @Column(name = "CT_ORDR_RCPT_TO_SHIP_DT_CAL")
    private String ctShipDateCalendar;

    @Column(name = "CT_ORDR_ENT_TO_DLVRY_DT_BSNS")
    private String ctDeliveryDateBusiness;

    @Column(name = "CT_ORDR_ENT_TO_DLVRY_DT_CAL")
    private String ctDeliveryCalendar;

    @Column(name = "CT_ORDR_RCPT_TO_DLVRY_DT_CAL")
    private String ctReceiptDeliCalendar;

    @Column(name = "CT_ORDR_RCPT_TO_DLVRY_DT_BSNS")
    private String ctReceiptToDeliDateBusi;

    @Column(name = "ORDR_RCPT_TO_ORDR_RELSE")
    private String orderReceiptToOrderRelease;
    
    
	private List<Serial> serials;

	public Date getFirmShipDate() {
		return firmShipDate;
	}

	public void setFirmShipDate(Date firmShipDate) {
		this.firmShipDate = firmShipDate;
	}

	public Date getFirmArrivalDate() {
		return firmArrivalDate;
	}

	public void setFirmArrivalDate(Date firmArrivalDate) {
		this.firmArrivalDate = firmArrivalDate;
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

	public String getCarrierTrackingNumber() {
		return carrierTrackingNumber;
	}

	public void setCarrierTrackingNumber(String carrierTrackingNumber) {
		this.carrierTrackingNumber = carrierTrackingNumber;
	}

	public Integer getCarrierTrackingQuantity() {
		return carrierTrackingQuantity;
	}

	public void setCarrierTrackingQuantity(Integer carrierTrackingQuantity) {
		this.carrierTrackingQuantity = carrierTrackingQuantity;
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

	public String getShippingSource() {
		return shippingSource;
	}

	public void setShippingSource(String shippingSource) {
		this.shippingSource = shippingSource;
	}

	public Date getCalculateArrivalDate() {
		return calculateArrivalDate;
	}

	public void setCalculateArrivalDate(Date calculateArrivalDate) {
		this.calculateArrivalDate = calculateArrivalDate;
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
