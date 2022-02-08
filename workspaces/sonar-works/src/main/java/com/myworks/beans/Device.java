package com.myworks.beans;

public class Device implements Comparable<Device> {
	private int dId; 
	private String dName;
	public Device() {}
	public Device(int dId, String dName) {
		this.dId = dId;
		this.dName = dName;
	}

	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "Device [dId=" + dId + ", dName=" + dName + "]";
	}
	@Override
	public int compareTo(Device o) {
//		 return o.dId -  this.dId;
		return this.dName.compareTo(o.dName);
	} 
}
