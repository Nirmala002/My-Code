
public class Calculator {
	public void add(int a,int b){
		System.out.println(a+b);	

	}
	public void sub(int a, float b) {
		System.out.println(a-b);

	}

	public void mul(double a,int b,double c) {
		System.out.println(a*b*c);
	}
	public void div(long a,double b,float c) {
		System.out.println(a/b/c);
	}
	public static void main(String[] args) {

		Calculator cal=new Calculator();
		cal.add(5, 7);
		cal.sub(4, 2);
		cal.mul(4.5, 5, 3.3);
		cal.div(3, 2.5, 1.4F);
	}

}
