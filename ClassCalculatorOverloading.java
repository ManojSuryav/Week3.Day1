package Week3.Day1;

public class ClassCalculatorOverloading {

	
	public void addition(int a,int b) {
		System.out.println("The Addition Of Method 1 =" + (a+b));
	}
	public void addition(int a,int b,int c) {
		System.out.println("The Addition Of Method 1 =" + (a+b+c));
		}
	public void sub(int a,int b) {
		System.out.println("The Sub Of Method 1 " + (a-b));
	}
	public void sub(double a, double b) {
		System.out.println("The Sub Of Method "+ (a-b));
	}
	public void mul(int a,int b) {
		System.out.println("The Mul Of Method 1 " + (a+b));
	}
	public void mul(double a,double b) {
		System.out.println("The Mul Of Method "+ (a*b));
	}
	public void dvd(double a, double b) {
		System.out.println("The Dvd Of Method "+ (a/b));
	}
	public static void main(String[] arg) {
	ClassCalculatorOverloading obj = new ClassCalculatorOverloading();	
	obj.addition(1,1);
	obj.addition(1, 01, 10);
	obj.sub(4, 03);
	obj.sub(33.2, 32.2);
	obj.mul(2, 0);
	obj.mul(62.1, 11.21);
	obj.dvd(3231.213, 12.2);
	
	}

	}
