/**
 * 
 */
package com.soar.ax.wapper;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author liuhb7
 *
 */
public class MyGrantedAuthority implements GrantedAuthority {

	private String rightId;

	public String getAuthority() {
		
		return getRightId();
	}
	public String getRightId() {
		return rightId;
	}
	public void setRightId(String rightId) {
		this.rightId = rightId;
	}

}
