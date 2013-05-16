/**
 * 
 */
package com.soar.ax.entity.ovp;

import java.util.Date;

import javax.persistence.Column;

/**
 * @author liuhb7
 *
 */
public class ColumnCollection {
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
    

}
