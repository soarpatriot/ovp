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
public class LineItem {
	
	@Column(name = "SLS_ORDR_LINE_NUM")
    private String salesOrderLineItemNumber;
	

	@Column(name = "ORDR_STS_ITEM")
    private String orderStatusItem;
	
	@Column(name = "PRTL_SHIP")
    private String partialShip;
	
	@Column(name = "ORDR_CTGRY")
    private String orderCategory;
	
	@Column(name = "PROD_ID")
    private String productId;
	
	@Column(name = "PROD_DESC")
    private String productDescription;
	
	@Column(name = "PROD_HIER")
    private String productHierarchy;

    @Column(name = "MACH_TYPE")
    private String machineType;

    @Column(name = "MACH_TYPE_DESC")
    private String machineTypeDescription;

    @Column(name = "MACH_MDL")
    private String machineModel;

    @Column(name = "MACH_MDL_DESC")
    private String machineModelDescription;

    @Column(name = "PROD_GRP")
    private String productGroup;

    @Column(name = "PROD_GRP_DESC")
    private String productGroupDescription;

    @Column(name = "PROD_BRD")
    private String productBrand;

    @Column(name = "PROD_BRD_DESC")
    private String productBrandDescription;
    
    @Column(name = "PROD_FMLY")
    private String productFamily;

    @Column(name = "EAN_UPC")
    private String eanUpc;

    @Column(name = "ORDR_QTY")
    private Integer orderQuantity;
    
    @Column(name = "SLS_UNIT")
    private String salesUnit;
    
    @Column(name = "ITEM_CRNCY")
    private String itemCurrency;
    
    @Column(name = "UNIT_PRC")
    private String unitPrice;
    
    @Column(name = "ORDR_AMT_ITEM")
    private String totalLineItemPrice;
  
    @Column(name = "ORDR_CNCLL_DT")
    private Date orderCancellDate;

    @Column(name = "PLAN_ARR_DT")
    private Date plannedArrivalDate;
    
    @Column(name = "PLAN_SPLR_SHIP_DT")
    private Date plannedSupplierShipDate;
    
    @Column(name = "ORDR_RELSE_DT")
    private Date orderReleaseDate;
    
    @Column(name = "SO_LINE_ITEM_LEAD_TM")
    private String soLineItemLeadTime;
    
    @Column(name = "CMT_GOODS_ISS_CSD")
    private Date committedGoodsIssueCSD;
    


    @Column(name = "REJ_RSN")
    private String rejectReason;

 
  

    @Column(name = "REJ_RSN_DESC")
    private String rejectReasonDescription;

    @Column(name = "GEO_ID")
    private String geographyIdentifier;
    
    @Column(name = "SHPNG_COND")
    private String shippingCondition;

    @Column(name = "SHPNG_COND_DESC")
    private String shippingConditionDescription;

    @Column(name = "SHPNG_PT")
    private String shippingPoint;

    @Column(name = "SLS_ORGN")
    private String salesOrganization;

    @Column(name = "SLS_OFF_CTRY")
    private String salesOfficeCountry;

    @Column(name = "DVSN")
    private String division;

    @Column(name = "DSTRBTN_CHNL")
    private String distributionChannel;
    
    @Column(name = "CRDT_RELSE_DT")
    private Date creditReleaseDate;

    


    
    @Column(name = "SOLD_TO_HOUSE_NUM")
    private String soldToHouseNumber;

    @Column(name = "SOLD_TO_STREET_1")
    private String soldToStreet1;

    @Column(name = "SOLD_TO_STREET_2")
    private String soldToStreet2;

    @Column(name = "SOLD_TO_DIST")
    private String soldToDistrict;

    @Column(name = "SOLD_TO_CITY_1")
    private String soldToCity1;

    @Column(name = "SOLD_TO_RGN_CD")
    private String soldToRegionCode;

    @Column(name = "SOLD_TO_RGN_NM")
    private String soldToRegionName;

    @Column(name = "SOLD_TO_CTRY_CD")
    private String soldToCountryCode;

    @Column(name = "SOLD_TO_CTRY_NM")
    private String soldToCountryName;

    @Column(name = "SOLD_TO_PSTL_CD")
    private String soldToPostalCode;

    @Column(name = "SHIP_TO_CUST_NUM")
    private String shipToCustomerNumber;

    @Column(name = "SHIP_TO_CUST_NM")
    private String shipToCustomerName;

    @Column(name = "SHIP_TO_CUST_NM2")
    private String shipToCustomerName2;

    @Column(name = "SHIP_TO_CUST_NM3")
    private String shipToCustomerName3;

    @Column(name = "SHIP_TO_CUST_NM4")
    private String shipToCustomerName4;

    @Column(name = "SHIP_TO_HOUSE_NUM")
    private String shipToHouseNumber;

    @Column(name = "SHIP_TO_STREET_1")
    private String shipToStreet1;

    @Column(name = "SHIP_TO_STREET_2")
    private String shipToStreet2;

    @Column(name = "SHIP_TO_DIST")
    private String shipToDistrict;

    @Column(name = "SHIP_TO_CITY_1")
    private String shipToCity1;

    @Column(name = "SHIP_TO_RGN_CD")
    private String shipToRegionCode;

    @Column(name = "SHIP_TO_RGN_NM")
    private String shipToRegionName;

    @Column(name = "SHIP_TO_CTRY_CD")
    private String shipToCountryCode;

    @Column(name = "SHIP_TO_CTRY_NM")
    private String shipToCountryName;

    @Column(name = "SHIP_TO_PSTL_CD")
    private String shipToPostalCode;

    @Column(name = "SHIP_TO_EML")
    private String shipToEmail;

    @Column(name = "SHIP_TO_PHN_NUM")
    private String shipToTelephoneNumber;

    @Column(name = "BILL_TO_CUST_NUM")
    private String billToCustomerNumber;

    @Column(name = "BILL_TO_CUST_NM")
    private String billToCustomerName;

    @Column(name = "BILL_TO_CUST_NM2")
    private String billToCustomerName2;

    @Column(name = "BILL_TO_CUST_NM3")
    private String billToCustomerName3;

    @Column(name = "BILL_TO_CUST_NM4")
    private String billToCustomerName4;

    @Column(name = "BILL_TO_HOUSE_NUM")
    private String billToHouseNumber;

    @Column(name = "BILL_TO_STREET_1")
    private String billToStreet1;

    @Column(name = "BILL_TO_STREET_2")
    private String billToStreet2;

    @Column(name = "BILL_TO_DIST")
    private String billToDistrict;

    @Column(name = "BILL_TO_CITY_1")
    private String billToCity1;

    @Column(name = "BILL_TO_RGN_CD")
    private String billToRegionCode;

    @Column(name = "BILL_TO_RGN_NM")
    private String billToRegionName;

    @Column(name = "BILL_TO_CTRY_CD")
    private String billToCountryCode;

    @Column(name = "BILL_TO_PSTL_CD")
    private String billToPostalCode;

    @Column(name = "BILL_TO_EML")
    private String billToEmail;

    @Column(name = "BILL_TO_PHN_NUM")
    private String billToTelephoneNumber;

    @Column(name = "BILL_TO_CUST_CNTCT_NM_1")
    private String billToCustomerContactName1;

    @Column(name = "BILL_TO_CUST_CNTCT_NM_2")
    private String billToCustomerContactName2;

    @Column(name = "PAYER_CUST_NUM")
    private String payerCustomerNumber;

    @Column(name = "PAYER_CUST_NM")
    private String payerCustomerName;

    @Column(name = "PAYER_CUST_NM2")
    private String payerCustomerName2;

    @Column(name = "PAYER_CUST_NM3")
    private String payerCustomerName3;

    @Column(name = "PAYER_CUST_NM4")
    private String payerCustomerName4;

    @Column(name = "PAYER_HOUSE_NUM")
    private String payerHouseNumber;

    @Column(name = "PAYER_STREET_1")
    private String payerStreet1;

    @Column(name = "PAYER_STREET_2")
    private String payerStreet2;

    @Column(name = "PAYER_DIST")
    private String payerDistrict;

    @Column(name = "PAYER_CITY_1")
    private String payerCity1;

    @Column(name = "PAYER_RGN_CD")
    private String payerRegionCode;

    @Column(name = "PAYER_RGN_NM")
    private String payerRegionName;

    @Column(name = "PAYER_CTRY_CD")
    private String payerCountryCode;

    @Column(name = "PAYER_CTRY_NM")
    private String payerCountryName;

    @Column(name = "PAYER_PSTL_CD")
    private String payerPostalCode;

    @Column(name = "LAST_UPDT_DTTM")
    private Date lastUpdateDatetime;
    
    @Column(name = "SHIP_TO_ADDR")
    private String shipToAddress;
    
    @Column(name = "BILL_TO_ADDR")
    private String billToAddress;
    
    @Column(name = "SOLD_TO_ADDR")
    private String soldToAddress;
    
    @Column(name = "BILL_TO_CTRY_NM")
    private String billToCountryName;
    

    @Column(name = "CUST_ACCT_GRP")
    private String customerAccountGroup;
    
    @Column(name = "SRC_SYS")
    private String sourceSystem;
    
 
    @Column(name = "SMATL_HIGH_LEVEL")
    //SO table  Higher-level item mapping
    private String smatlHighLevel;
    /**
     * if this value is not null,this item is physical item.
     */
    @Column(name = "SMATL_ITEM_GATG_SERV")
    private String smatlItemCategory;
    
    
    //ADD BY WEISY 20120314
    @Column(name="CTO_FLG")
	private String cto;
    
    
    /**
     * MMPP field in line item
     * OVPDB_W2.dbo.IDL_PO_ITEM
     * **/
    @Column(name = "VNDR_NUM")
    private String vendorNumber;

    @Column(name = "VNDR_NM")
    private String vendorName;

	@Column(name = "PO_DOC_DT")
	private Date purchaseOrderDocumentDate;

	@Column(name = "PO_CNFRM_DT")
	private Date purchaseOrderConfirmationDate;

	//renamed as PO_NUM, original is SOH_PO_NUM
	@Column(name = "PO_NUM")
	private String sohPurchaseOrderNumber;

	//mo information
	@Column(name = "MO_NUM")
	private String moNumber;
	@Column(name = "MO_ITEM_NUM")
	private String moItemNumber;
	@Column(name = "VNDR_NUM")
	private String moVendorNumber;
	@Column(name = "VNDR_NM")
	private String moVendorName;
	@Column(name = "MATL_NUM")
	private String moMaterialNumber;
	@Column(name = "MO_RELSE_DT")
    private Date moReleaseDate;
	@Column(name = "MO_RELSE_FL")
	private String moReleaseFlag;
	

	/**
	 * CRM information
	 */
	@Column(name = "CNSMR_ID")
	private String consumerId;

	@Column(name = "CNTRC_NUM")
	private String contractNumber;

	@Column(name = "END_CUST_CHM_NUM")
	private String endCustomerChmNumber;

	@Column(name = "END_CUST_CHM_NM")
	private String endcustomerChmName;
	
    @Column(name = "GLOBL_LOC_NUM")
    private String globalLocNum;

    @Column(name = "GLOBL_LOC_NM")
    private String globalLocName;

    @Column(name = "GIN")
    private String gin;
    
    @Column(name="SOLD_TO_PRTY_NUM")
    private String soldToPrtyNum;
    
    
    
    /**
     * nested delivery information
     */
	private List<Delivery> deliveries;
	
	
	public List<Delivery> getDeliveries() {
		return deliveries;
	}
	public void setDeliveries(List<Delivery> deliveries) {
		this.deliveries = deliveries;
	}
	public String getSalesOrderLineItemNumber() {
		return salesOrderLineItemNumber;
	}
	public void setSalesOrderLineItemNumber(String salesOrderLineItemNumber) {
		this.salesOrderLineItemNumber = salesOrderLineItemNumber;
	}

	public String getOrderStatusItem() {
		return orderStatusItem;
	}
	public void setOrderStatusItem(String orderStatusItem) {
		this.orderStatusItem = orderStatusItem;
	}
	public String getPartialShip() {
		return partialShip;
	}
	public void setPartialShip(String partialShip) {
		this.partialShip = partialShip;
	}
	public String getOrderCategory() {
		return orderCategory;
	}
	public void setOrderCategory(String orderCategory) {
		this.orderCategory = orderCategory;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductHierarchy() {
		return productHierarchy;
	}
	public void setProductHierarchy(String productHierarchy) {
		this.productHierarchy = productHierarchy;
	}
	public String getMachineType() {
		return machineType;
	}
	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}
	public String getMachineTypeDescription() {
		return machineTypeDescription;
	}
	public void setMachineTypeDescription(String machineTypeDescription) {
		this.machineTypeDescription = machineTypeDescription;
	}
	public String getMachineModel() {
		return machineModel;
	}
	public void setMachineModel(String machineModel) {
		this.machineModel = machineModel;
	}
	public String getMachineModelDescription() {
		return machineModelDescription;
	}
	public void setMachineModelDescription(String machineModelDescription) {
		this.machineModelDescription = machineModelDescription;
	}
	public String getProductGroup() {
		return productGroup;
	}
	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}
	public String getProductGroupDescription() {
		return productGroupDescription;
	}
	public void setProductGroupDescription(String productGroupDescription) {
		this.productGroupDescription = productGroupDescription;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public String getProductBrandDescription() {
		return productBrandDescription;
	}
	public void setProductBrandDescription(String productBrandDescription) {
		this.productBrandDescription = productBrandDescription;
	}
	public String getProductFamily() {
		return productFamily;
	}
	public void setProductFamily(String productFamily) {
		this.productFamily = productFamily;
	}
	public String getEanUpc() {
		return eanUpc;
	}
	public void setEanUpc(String eanUpc) {
		this.eanUpc = eanUpc;
	}
	public Integer getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(Integer orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public String getSalesUnit() {
		return salesUnit;
	}
	public void setSalesUnit(String salesUnit) {
		this.salesUnit = salesUnit;
	}
	public String getItemCurrency() {
		return itemCurrency;
	}
	public void setItemCurrency(String itemCurrency) {
		this.itemCurrency = itemCurrency;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getTotalLineItemPrice() {
		return totalLineItemPrice;
	}
	public void setTotalLineItemPrice(String totalLineItemPrice) {
		this.totalLineItemPrice = totalLineItemPrice;
	}
	public Date getOrderCancellDate() {
		return orderCancellDate;
	}
	public void setOrderCancellDate(Date orderCancellDate) {
		this.orderCancellDate = orderCancellDate;
	}
	public Date getPlannedArrivalDate() {
		return plannedArrivalDate;
	}
	public void setPlannedArrivalDate(Date plannedArrivalDate) {
		this.plannedArrivalDate = plannedArrivalDate;
	}
	public Date getPlannedSupplierShipDate() {
		return plannedSupplierShipDate;
	}
	public void setPlannedSupplierShipDate(Date plannedSupplierShipDate) {
		this.plannedSupplierShipDate = plannedSupplierShipDate;
	}
	public Date getOrderReleaseDate() {
		return orderReleaseDate;
	}
	public void setOrderReleaseDate(Date orderReleaseDate) {
		this.orderReleaseDate = orderReleaseDate;
	}
	public String getSoLineItemLeadTime() {
		return soLineItemLeadTime;
	}
	public void setSoLineItemLeadTime(String soLineItemLeadTime) {
		this.soLineItemLeadTime = soLineItemLeadTime;
	}
	public Date getCommittedGoodsIssueCSD() {
		return committedGoodsIssueCSD;
	}
	public void setCommittedGoodsIssueCSD(Date committedGoodsIssueCSD) {
		this.committedGoodsIssueCSD = committedGoodsIssueCSD;
	}

	public String getRejectReason() {
		return rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getVendorNumber() {
		return vendorNumber;
	}
	public void setVendorNumber(String vendorNumber) {
		this.vendorNumber = vendorNumber;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public Date getMoReleaseDate() {
		return moReleaseDate;
	}
	public void setMoReleaseDate(Date moReleaseDate) {
		this.moReleaseDate = moReleaseDate;
	}
	public String getRejectReasonDescription() {
		return rejectReasonDescription;
	}
	public void setRejectReasonDescription(String rejectReasonDescription) {
		this.rejectReasonDescription = rejectReasonDescription;
	}
	public String getGeographyIdentifier() {
		return geographyIdentifier;
	}
	public void setGeographyIdentifier(String geographyIdentifier) {
		this.geographyIdentifier = geographyIdentifier;
	}
	public String getShippingCondition() {
		return shippingCondition;
	}
	public void setShippingCondition(String shippingCondition) {
		this.shippingCondition = shippingCondition;
	}
	public String getShippingConditionDescription() {
		return shippingConditionDescription;
	}
	public void setShippingConditionDescription(String shippingConditionDescription) {
		this.shippingConditionDescription = shippingConditionDescription;
	}
	public String getShippingPoint() {
		return shippingPoint;
	}
	public void setShippingPoint(String shippingPoint) {
		this.shippingPoint = shippingPoint;
	}
	public String getSalesOrganization() {
		return salesOrganization;
	}
	public void setSalesOrganization(String salesOrganization) {
		this.salesOrganization = salesOrganization;
	}
	public String getSalesOfficeCountry() {
		return salesOfficeCountry;
	}
	public void setSalesOfficeCountry(String salesOfficeCountry) {
		this.salesOfficeCountry = salesOfficeCountry;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getDistributionChannel() {
		return distributionChannel;
	}
	public void setDistributionChannel(String distributionChannel) {
		this.distributionChannel = distributionChannel;
	}
	public Date getCreditReleaseDate() {
		return creditReleaseDate;
	}
	public void setCreditReleaseDate(Date creditReleaseDate) {
		this.creditReleaseDate = creditReleaseDate;
	}
	
	
	public String getSoldToHouseNumber() {
		return soldToHouseNumber;
	}
	public void setSoldToHouseNumber(String soldToHouseNumber) {
		this.soldToHouseNumber = soldToHouseNumber;
	}
	public String getSoldToStreet1() {
		return soldToStreet1;
	}
	public void setSoldToStreet1(String soldToStreet1) {
		this.soldToStreet1 = soldToStreet1;
	}
	public String getSoldToStreet2() {
		return soldToStreet2;
	}
	public void setSoldToStreet2(String soldToStreet2) {
		this.soldToStreet2 = soldToStreet2;
	}
	public String getSoldToDistrict() {
		return soldToDistrict;
	}
	public void setSoldToDistrict(String soldToDistrict) {
		this.soldToDistrict = soldToDistrict;
	}
	public String getSoldToCity1() {
		return soldToCity1;
	}
	public void setSoldToCity1(String soldToCity1) {
		this.soldToCity1 = soldToCity1;
	}
	public String getSoldToRegionCode() {
		return soldToRegionCode;
	}
	public void setSoldToRegionCode(String soldToRegionCode) {
		this.soldToRegionCode = soldToRegionCode;
	}
	public String getSoldToRegionName() {
		return soldToRegionName;
	}
	public void setSoldToRegionName(String soldToRegionName) {
		this.soldToRegionName = soldToRegionName;
	}
	public String getSoldToCountryCode() {
		return soldToCountryCode;
	}
	public void setSoldToCountryCode(String soldToCountryCode) {
		this.soldToCountryCode = soldToCountryCode;
	}
	public String getSoldToCountryName() {
		return soldToCountryName;
	}
	public void setSoldToCountryName(String soldToCountryName) {
		this.soldToCountryName = soldToCountryName;
	}
	public String getSoldToPostalCode() {
		return soldToPostalCode;
	}
	public void setSoldToPostalCode(String soldToPostalCode) {
		this.soldToPostalCode = soldToPostalCode;
	}
	public String getShipToCustomerNumber() {
		return shipToCustomerNumber;
	}
	public void setShipToCustomerNumber(String shipToCustomerNumber) {
		this.shipToCustomerNumber = shipToCustomerNumber;
	}
	public String getShipToCustomerName() {
		return shipToCustomerName;
	}
	public void setShipToCustomerName(String shipToCustomerName) {
		this.shipToCustomerName = shipToCustomerName;
	}
	public String getShipToCustomerName2() {
		return shipToCustomerName2;
	}
	public void setShipToCustomerName2(String shipToCustomerName2) {
		this.shipToCustomerName2 = shipToCustomerName2;
	}
	public String getShipToCustomerName3() {
		return shipToCustomerName3;
	}
	public void setShipToCustomerName3(String shipToCustomerName3) {
		this.shipToCustomerName3 = shipToCustomerName3;
	}
	public String getShipToCustomerName4() {
		return shipToCustomerName4;
	}
	public void setShipToCustomerName4(String shipToCustomerName4) {
		this.shipToCustomerName4 = shipToCustomerName4;
	}
	public String getShipToHouseNumber() {
		return shipToHouseNumber;
	}
	public void setShipToHouseNumber(String shipToHouseNumber) {
		this.shipToHouseNumber = shipToHouseNumber;
	}
	public String getShipToStreet1() {
		return shipToStreet1;
	}
	public void setShipToStreet1(String shipToStreet1) {
		this.shipToStreet1 = shipToStreet1;
	}
	public String getShipToStreet2() {
		return shipToStreet2;
	}
	public void setShipToStreet2(String shipToStreet2) {
		this.shipToStreet2 = shipToStreet2;
	}
	public String getShipToDistrict() {
		return shipToDistrict;
	}
	public void setShipToDistrict(String shipToDistrict) {
		this.shipToDistrict = shipToDistrict;
	}
	public String getShipToCity1() {
		return shipToCity1;
	}
	public void setShipToCity1(String shipToCity1) {
		this.shipToCity1 = shipToCity1;
	}
	public String getShipToRegionCode() {
		return shipToRegionCode;
	}
	public void setShipToRegionCode(String shipToRegionCode) {
		this.shipToRegionCode = shipToRegionCode;
	}
	public String getShipToRegionName() {
		return shipToRegionName;
	}
	public void setShipToRegionName(String shipToRegionName) {
		this.shipToRegionName = shipToRegionName;
	}
	public String getShipToCountryCode() {
		return shipToCountryCode;
	}
	public void setShipToCountryCode(String shipToCountryCode) {
		this.shipToCountryCode = shipToCountryCode;
	}
	public String getShipToCountryName() {
		return shipToCountryName;
	}
	public void setShipToCountryName(String shipToCountryName) {
		this.shipToCountryName = shipToCountryName;
	}
	public String getShipToPostalCode() {
		return shipToPostalCode;
	}
	public void setShipToPostalCode(String shipToPostalCode) {
		this.shipToPostalCode = shipToPostalCode;
	}
	public String getShipToEmail() {
		return shipToEmail;
	}
	public void setShipToEmail(String shipToEmail) {
		this.shipToEmail = shipToEmail;
	}
	public String getShipToTelephoneNumber() {
		return shipToTelephoneNumber;
	}
	public void setShipToTelephoneNumber(String shipToTelephoneNumber) {
		this.shipToTelephoneNumber = shipToTelephoneNumber;
	}
	public String getBillToCustomerNumber() {
		return billToCustomerNumber;
	}
	public void setBillToCustomerNumber(String billToCustomerNumber) {
		this.billToCustomerNumber = billToCustomerNumber;
	}
	public String getBillToCustomerName() {
		return billToCustomerName;
	}
	public void setBillToCustomerName(String billToCustomerName) {
		this.billToCustomerName = billToCustomerName;
	}
	public String getBillToCustomerName2() {
		return billToCustomerName2;
	}
	public void setBillToCustomerName2(String billToCustomerName2) {
		this.billToCustomerName2 = billToCustomerName2;
	}
	public String getBillToCustomerName3() {
		return billToCustomerName3;
	}
	public void setBillToCustomerName3(String billToCustomerName3) {
		this.billToCustomerName3 = billToCustomerName3;
	}
	public String getBillToCustomerName4() {
		return billToCustomerName4;
	}
	public void setBillToCustomerName4(String billToCustomerName4) {
		this.billToCustomerName4 = billToCustomerName4;
	}
	public String getBillToHouseNumber() {
		return billToHouseNumber;
	}
	public void setBillToHouseNumber(String billToHouseNumber) {
		this.billToHouseNumber = billToHouseNumber;
	}
	public String getBillToStreet1() {
		return billToStreet1;
	}
	public void setBillToStreet1(String billToStreet1) {
		this.billToStreet1 = billToStreet1;
	}
	public String getBillToStreet2() {
		return billToStreet2;
	}
	public void setBillToStreet2(String billToStreet2) {
		this.billToStreet2 = billToStreet2;
	}
	public String getBillToDistrict() {
		return billToDistrict;
	}
	public void setBillToDistrict(String billToDistrict) {
		this.billToDistrict = billToDistrict;
	}
	public String getBillToCity1() {
		return billToCity1;
	}
	public void setBillToCity1(String billToCity1) {
		this.billToCity1 = billToCity1;
	}
	public String getBillToRegionCode() {
		return billToRegionCode;
	}
	public void setBillToRegionCode(String billToRegionCode) {
		this.billToRegionCode = billToRegionCode;
	}
	public String getBillToRegionName() {
		return billToRegionName;
	}
	public void setBillToRegionName(String billToRegionName) {
		this.billToRegionName = billToRegionName;
	}
	public String getBillToCountryCode() {
		return billToCountryCode;
	}
	public void setBillToCountryCode(String billToCountryCode) {
		this.billToCountryCode = billToCountryCode;
	}
	public String getBillToPostalCode() {
		return billToPostalCode;
	}
	public void setBillToPostalCode(String billToPostalCode) {
		this.billToPostalCode = billToPostalCode;
	}
	public String getBillToEmail() {
		return billToEmail;
	}
	public void setBillToEmail(String billToEmail) {
		this.billToEmail = billToEmail;
	}
	public String getBillToTelephoneNumber() {
		return billToTelephoneNumber;
	}
	public void setBillToTelephoneNumber(String billToTelephoneNumber) {
		this.billToTelephoneNumber = billToTelephoneNumber;
	}
	public String getBillToCustomerContactName1() {
		return billToCustomerContactName1;
	}
	public void setBillToCustomerContactName1(String billToCustomerContactName1) {
		this.billToCustomerContactName1 = billToCustomerContactName1;
	}
	public String getBillToCustomerContactName2() {
		return billToCustomerContactName2;
	}
	public void setBillToCustomerContactName2(String billToCustomerContactName2) {
		this.billToCustomerContactName2 = billToCustomerContactName2;
	}
	public String getPayerCustomerNumber() {
		return payerCustomerNumber;
	}
	public void setPayerCustomerNumber(String payerCustomerNumber) {
		this.payerCustomerNumber = payerCustomerNumber;
	}
	public String getPayerCustomerName() {
		return payerCustomerName;
	}
	public void setPayerCustomerName(String payerCustomerName) {
		this.payerCustomerName = payerCustomerName;
	}
	public String getPayerCustomerName2() {
		return payerCustomerName2;
	}
	public void setPayerCustomerName2(String payerCustomerName2) {
		this.payerCustomerName2 = payerCustomerName2;
	}
	public String getPayerCustomerName3() {
		return payerCustomerName3;
	}
	public void setPayerCustomerName3(String payerCustomerName3) {
		this.payerCustomerName3 = payerCustomerName3;
	}
	public String getPayerCustomerName4() {
		return payerCustomerName4;
	}
	public void setPayerCustomerName4(String payerCustomerName4) {
		this.payerCustomerName4 = payerCustomerName4;
	}
	public String getPayerHouseNumber() {
		return payerHouseNumber;
	}
	public void setPayerHouseNumber(String payerHouseNumber) {
		this.payerHouseNumber = payerHouseNumber;
	}
	public String getPayerStreet1() {
		return payerStreet1;
	}
	public void setPayerStreet1(String payerStreet1) {
		this.payerStreet1 = payerStreet1;
	}
	public String getPayerStreet2() {
		return payerStreet2;
	}
	public void setPayerStreet2(String payerStreet2) {
		this.payerStreet2 = payerStreet2;
	}
	public String getPayerDistrict() {
		return payerDistrict;
	}
	public void setPayerDistrict(String payerDistrict) {
		this.payerDistrict = payerDistrict;
	}
	public String getPayerCity1() {
		return payerCity1;
	}
	public void setPayerCity1(String payerCity1) {
		this.payerCity1 = payerCity1;
	}
	public String getPayerRegionCode() {
		return payerRegionCode;
	}
	public void setPayerRegionCode(String payerRegionCode) {
		this.payerRegionCode = payerRegionCode;
	}
	public String getPayerRegionName() {
		return payerRegionName;
	}
	public void setPayerRegionName(String payerRegionName) {
		this.payerRegionName = payerRegionName;
	}
	public String getPayerCountryCode() {
		return payerCountryCode;
	}
	public void setPayerCountryCode(String payerCountryCode) {
		this.payerCountryCode = payerCountryCode;
	}
	public String getPayerCountryName() {
		return payerCountryName;
	}
	public void setPayerCountryName(String payerCountryName) {
		this.payerCountryName = payerCountryName;
	}
	public String getPayerPostalCode() {
		return payerPostalCode;
	}
	public void setPayerPostalCode(String payerPostalCode) {
		this.payerPostalCode = payerPostalCode;
	}
	public String getGlobalLocNum() {
		return globalLocNum;
	}
	public void setGlobalLocNum(String globalLocNum) {
		this.globalLocNum = globalLocNum;
	}
	public String getGlobalLocName() {
		return globalLocName;
	}
	public void setGlobalLocName(String globalLocName) {
		this.globalLocName = globalLocName;
	}
	public String getGin() {
		return gin;
	}
	public void setGin(String gin) {
		this.gin = gin;
	}
	public Date getLastUpdateDatetime() {
		return lastUpdateDatetime;
	}
	public void setLastUpdateDatetime(Date lastUpdateDatetime) {
		this.lastUpdateDatetime = lastUpdateDatetime;
	}
	
	public String getShipToAddress() {
		return shipToAddress;
	}
	public void setShipToAddress(String shipToAddress) {
		this.shipToAddress = shipToAddress;
	}
	public String getBillToAddress() {
		return billToAddress;
	}
	public void setBillToAddress(String billToAddress) {
		this.billToAddress = billToAddress;
	}
	public String getSoldToAddress() {
		return soldToAddress;
	}
	public void setSoldToAddress(String soldToAddress) {
		this.soldToAddress = soldToAddress;
	}
	public String getBillToCountryName() {
		return billToCountryName;
	}
	public void setBillToCountryName(String billToCountryName) {
		this.billToCountryName = billToCountryName;
	}

	public String getCustomerAccountGroup() {
		return customerAccountGroup;
	}
	public void setCustomerAccountGroup(String customerAccountGroup) {
		this.customerAccountGroup = customerAccountGroup;
	}
	public String getSourceSystem() {
		return sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getSmatlHighLevel() {
		return smatlHighLevel;
	}
	public void setSmatlHighLevel(String smatlHighLevel) {
		this.smatlHighLevel = smatlHighLevel;
	}
	public String getSmatlItemCategory() {
		return smatlItemCategory;
	}
	public void setSmatlItemCategory(String smatlItemCategory) {
		this.smatlItemCategory = smatlItemCategory;
	}
	
	public String getCto() {
		return cto;
	}
	public void setCto(String cto) {
		this.cto = cto;
	}
	public Date getPurchaseOrderDocumentDate() {
		return purchaseOrderDocumentDate;
	}
	public void setPurchaseOrderDocumentDate(Date purchaseOrderDocumentDate) {
		this.purchaseOrderDocumentDate = purchaseOrderDocumentDate;
	}
	public Date getPurchaseOrderConfirmationDate() {
		return purchaseOrderConfirmationDate;
	}
	public void setPurchaseOrderConfirmationDate(Date purchaseOrderConfirmationDate) {
		this.purchaseOrderConfirmationDate = purchaseOrderConfirmationDate;
	}
	public String getSohPurchaseOrderNumber() {
		return sohPurchaseOrderNumber;
	}
	public void setSohPurchaseOrderNumber(String sohPurchaseOrderNumber) {
		this.sohPurchaseOrderNumber = sohPurchaseOrderNumber;
	}
	public String getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}
	public String getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public String getEndCustomerChmNumber() {
		return endCustomerChmNumber;
	}
	public void setEndCustomerChmNumber(String endCustomerChmNumber) {
		this.endCustomerChmNumber = endCustomerChmNumber;
	}
	public String getEndcustomerChmName() {
		return endcustomerChmName;
	}
	public void setEndcustomerChmName(String endcustomerChmName) {
		this.endcustomerChmName = endcustomerChmName;
	}
	public String getSoldToPrtyNum() {
		return soldToPrtyNum;
	}
	public void setSoldToPrtyNum(String soldToPrtyNum) {
		this.soldToPrtyNum = soldToPrtyNum;
	}
	public String getMoNumber() {
		return moNumber;
	}
	public void setMoNumber(String moNumber) {
		this.moNumber = moNumber;
	}
	public String getMoItemNumber() {
		return moItemNumber;
	}
	public void setMoItemNumber(String moItemNumber) {
		this.moItemNumber = moItemNumber;
	}
	public String getMoVendorNumber() {
		return moVendorNumber;
	}
	public void setMoVendorNumber(String moVendorNumber) {
		this.moVendorNumber = moVendorNumber;
	}
	public String getMoVendorName() {
		return moVendorName;
	}
	public void setMoVendorName(String moVendorName) {
		this.moVendorName = moVendorName;
	}
	public String getMoMaterialNumber() {
		return moMaterialNumber;
	}
	public void setMoMaterialNumber(String moMaterialNumber) {
		this.moMaterialNumber = moMaterialNumber;
	}
	public String getMoReleaseFlag() {
		return moReleaseFlag;
	}
	public void setMoReleaseFlag(String moReleaseFlag) {
		this.moReleaseFlag = moReleaseFlag;
	}
}
