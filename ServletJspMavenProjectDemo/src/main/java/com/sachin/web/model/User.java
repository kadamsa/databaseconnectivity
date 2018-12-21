/**
 * 
 */
package com.sachin.web.model;

/**
 * @author sachinkadam2712@gmail.com
 *
 * 
 */
public class User {

	private int uid;
	private String uname;
	private String address;

	public int getUid() {
		return uid;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", address=" + address + "]";
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
