package oop01.encapsule;

public class PayA {
	private String name;
	private int salary; // 급여
	public static final double TAX=0.1; // 세율 0.1
	private int taxVal;
	private int income; // 실급여 = 급여 - 급여*세율
	
	public void setTaxVal(int salary){
	//	System.out.println("PayA 에 넘어온 파라미터값 :" + salary);
		this.taxVal = (int) (salary*TAX);
	}
	public void setIncome(int salary){
		
		this.income = (int) (salary-taxVal);
	}
	public int getTaxVal(){
		return (int) taxVal;
	}
	public int getIncome(){
		return income;
	}
	
}
