package week1.assign1;

public class PrimeNumber {
	public static void main(String[] args) {
		int input=11;
		boolean flag=false;
		for(int i=2;i<input/2;i++){
			System.out.println("prime");
			flag=true;
			break;
		}
	
	if(!flag){
		System.out.println(" non prime");
	}
	}
	
}
