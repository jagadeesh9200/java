package my;

public class CheckEmployee {

	public static void main(String[] args) 
	{
		Employee ben=new Employee();
		ben.setEmpid(1000);
		ben.setEmpname("ben");
		ben.setEmpsalary(966.62);
		ben.setEmpbonus(100);
		ben.calculatepaytotal();
		System.out.println("Total pay = " + ben.getEmppaytotal());
		
		Employee den=new Employee();
		den.setEmpid(1001);
		den.setEmpname("den");
		den.setEmpsalary(1023);
		den.setEmpbonus(150);
		den.calculatepaytotal();
		System.out.println("Total pay = " + den.getEmppaytotal());
		
		
	}

}
