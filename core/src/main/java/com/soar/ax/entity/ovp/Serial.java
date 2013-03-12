/**
 * 
 */
package com.soar.ax.entity.ovp;

import javax.persistence.Column;

/**
 * @author liuhb7
 *
 */
public class Serial {

	@Column(name = "SRL_NUM")
    private String serialNumber;
        
    @Column(name = "ASSET_TAGS_SD")
    private String assetTagsSd;
    
    @Column(name = "MAC_ADDRES")
    private String macAddresses;
    
    /**add this column,hubaozhong 2011-6-15 14:11 */
    @Column(name = "MAC_ADDR_2")
    private String macAddresses2;
    
    @Column(name = "UUID")
    private String uuid;
    
    @Column(name = "WTY_STRT_DT")
    private String warrantyStartDate;
    //Added by zhx at 2011/10/13
    @Column(name = "WTY_END_DT")
    private String warrantyEndDate;
    
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getAssetTagsSd() {
		return assetTagsSd;
	}
	public void setAssetTagsSd(String assetTagsSd) {
		this.assetTagsSd = assetTagsSd;
	}
	public String getMacAddresses() {
		return macAddresses;
	}
	public void setMacAddresses(String macAddresses) {
		this.macAddresses = macAddresses;
	}
	public String getMacAddresses2() {
		return macAddresses2;
	}
	public void setMacAddresses2(String macAddresses2) {
		this.macAddresses2 = macAddresses2;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getWarrantyStartDate() {
		return warrantyStartDate;
	}
	public void setWarrantyStartDate(String warrantyStartDate) {
		this.warrantyStartDate = warrantyStartDate;
	}
	public String getWarrantyEndDate() {
		return warrantyEndDate;
	}
	public void setWarrantyEndDate(String warrantyEndDate) {
		this.warrantyEndDate = warrantyEndDate;
	}
}
