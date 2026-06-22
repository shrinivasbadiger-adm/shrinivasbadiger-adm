package com.course.mgt.Response;

public class AddressResponse {

	private int id;
	private String lane1;
	private String lan2;
	private String state;
	private int zip;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLane1() {
		return lane1;
	}
	public void setLane1(String lane1) {
		this.lane1 = lane1;
	}
	public String getLan2() {
		return lan2;
	}
	public void setLan2(String lan2) {
		this.lan2 = lan2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
}
