package oop01.encapsule;

public class PayD {
	public static void main(String[] args) {
		String hulk = "헐크";
		int hulkSalary = 200;
		String iron = "아이언";
		int ironSalary = 300;
		String thor = "토르";
		int thorSalary = 500;
		
		PayA hulkPay = new PayA();
		hulkPay.setTaxVal(hulkSalary);
		hulkPay.setIncome(hulkSalary);
		
		
		System.out.println("=== "+hulk+"의 5월 급여내역 ===");
		System.out.println("급여 : "+hulkSalary);
		System.out.println("세금 : "+hulkPay.getTaxVal());
		System.out.println("실수령액 : "+hulkPay.getIncome());
		System.out.println();
		System.out.println("=== "+iron+"의 5월 급여내역 ===");
		System.out.println("급여 : "+ironSalary);
		System.out.println("세금 : ");
		System.out.println("실수령액 : ");
		System.out.println();
		System.out.println("=== "+thor+"의 5월 급여내역 ===");
		System.out.println("급여 : "+thorSalary);
		System.out.println("세금 : ");
		System.out.println("실수령액 : ");
		System.out.println();
	}
}
