package com.app.lakshay;

public class Controller {

	private String CID;
	private Integer path;
	public Controller() {
		super();
	}
	public String getCID() {
		return CID;
	}
	public void setCID(String cID) {
		CID = cID;
	}
	public Integer getPath() {
		return path;
	}
	public void setPath(Integer path) {
		this.path = path;
	}
	@Override
	public String toString() {
		return "Controller [CID=" + CID + ", path=" + path + "]";
	}
	
	
	
}
