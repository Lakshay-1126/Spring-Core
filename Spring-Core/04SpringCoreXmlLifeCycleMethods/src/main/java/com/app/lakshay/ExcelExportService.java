package com.app.lakshay;

public class ExcelExportService {

	private String filename;
	private String mode;
	
	public void setup() {
		System.out.println("FROM INIT() METHOD");
	}
	
	public void clean() {
		System.out.println("FROM DESTROY() METHOD");
	}

	@Override
	public String toString() {
		return "ExcelExportService [filename=" + filename + ", mode=" + mode + "]";
	}

	public ExcelExportService() {
		super();
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
	
}
