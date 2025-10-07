package my.app;

import java.util.List;
import java.util.Set;

public class Employee {
    private String ename;
    private double esal;
    private Set <String> eaddress;
    private String edesigation;
    private List <String> ephone;
	
	public Employee() {
		super();
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public Set<String> getEaddress() {
		return eaddress;
	}
	public void setEaddress(Set<String> eaddress) {
		this.eaddress = eaddress;
	}
	public String getEdesigation() {
		return edesigation;
	}
	public void setEdesigation(String edesigation) {
		this.edesigation = edesigation;
	}
	public List<String> getEphone() {
		return ephone;
	}
	public void setEphone(List<String> ephone) {
		this.ephone = ephone;
	}
	@Override
	public String toString() {
	    return "Employee {" +
	            "ename='" + ename + '\'' +
	            ", esal=" + esal +
	            ", eaddress=" + eaddress +
	            ", edesigation='" + edesigation + '\'' +
	            ", ephone=" + ephone +
	            '}';
	}

}
