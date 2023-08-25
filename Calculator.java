package week1.day2;

public class Calculator {
	

	private int addTwoNumbers(int num1,int num2) {
		return num1+num2;
	}
    public float mul (float num1,float num2) {
	 return  num1+num2;
	 }
    public int sub() {
         return(11-10);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		System.out.println(c.addTwoNumbers(2,2));
		System.out.println(c.sub());
		System.out.println(c.mul(10,9));
		
	}

	}

