// Spring Life Cycle Method Using THe Pre-Define Interfaces(InitializingBean, DisposableBean):-

package com.app.lakshay;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExcelExportService implements InitializingBean, DisposableBean {

	private String filename;
	private String mode;
	
	@Override
	public void destroy() throws Exception {
		System.out.println("FROM DESTROY() METHOD");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("FEOM INIT() METHOD");
		
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
	@Override
	public String toString() {
		return "ExcelExportService [filename=" + filename + ", mode=" + mode + "]";
	}
	
	
}
