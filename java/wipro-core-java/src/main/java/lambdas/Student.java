package lambdas;

public class Student {
	
	int htno;
	String name;
	int m1;
	int m2;
	int m3;
	int total;
	double avgr;
	String result;
	public Student() {
		
	}
	public Student(int htno, String name, int m1, int m2, int m3) {
		super();
		this.htno = htno;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		
	}
	public int getHtno() {
		return htno;
	}
	public void setHtno(int htno) {
		this.htno = htno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvgr() {
		return avgr;
	}
	public void setAvgr(double avgr) {
		this.avgr = avgr;
	}
	
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student [htno=" + htno + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", total="
				+ total + ", avgr=" + avgr + ", result=" + result + "]";
	}
	

}
