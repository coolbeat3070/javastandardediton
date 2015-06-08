package oop01.encapsule;

public class AverageC {
	/*필드 선언*/
	String name;
	int kor;
	int eng;
	int tot; // 합계
	double avg;
	
	/*이름 저장하는 기능*/
	public void setName(String foo){
		this.name = foo;
	}
	/*국어점수를 저장하는 기능*/
	public void setKor(int kor){
		this.kor = kor;
	}
	/*영어점수를 구하는 기능*/
	public void setEng(int eng){
		this.eng = eng;
	}
	/*합계 점수를 구하는 기능*/
	public void setTot(int kor, int eng){
		this.tot = kor + eng;
	}
	/*평균 점수를 구하는 기능*/
	public void setAvg(int tot){
		this.avg = tot/2;
	}
	/*평균 점수를 구하는 기능 2...국어 영어점수 두개만으로 구하기*/
	/*Overloading : 오버로딩*/
	public void setAvg(int kor, int eng){
		this.avg = (kor+eng)/2;
	}
}
