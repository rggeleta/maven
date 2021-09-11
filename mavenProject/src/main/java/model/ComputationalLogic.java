package model;

/**
 * rggeleta@dmacc.edu roman
 * CIS175-Fall2021
 * Sep 8, 2021
 */
public class ComputationalLogic {
	private int num1;
	private int num2;
	private int num3;
	
//constructor
public ComputationalLogic() {
	super();
}


// getter and setter
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}
	

	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	public int findAverage(int num1, int num2, int num3) {
		return num1 + num2 + num3 / 3;
	}
	
	public int findSum(int num1, int num2) {
		return num1 + num2;
	}
	



	/**
	 * @param num12
	 * @param num22
	 * @return
	 */
	public int multiply(int num1, int num2) {
		
		return num1*num2;
	}

}
