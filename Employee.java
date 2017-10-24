package my;

public class Employee 
{
	private int empid;
	private String empname;
	private double empsalary;
	private double empbonus;
	private double emppaytotal;
	
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}

	public double getEmpbonus() {
		return empbonus;
	}

	public void setEmpbonus(double empbonus) {
		this.empbonus = empbonus;
	}

	public double getEmppaytotal() {
		return emppaytotal;
	}

	public void setEmppaytotal(double emppaytotal) {
		this.emppaytotal = emppaytotal;
	}

	void calculatepaytotal()
	{
		emppaytotal=empsalary+empbonus;
	}
	

}
