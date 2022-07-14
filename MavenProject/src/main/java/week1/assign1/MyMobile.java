package week1.assign1;

public class MyMobile {
	int sim=1;
	int memory=2;
	public void makeCall( ) {
		System.out.println("makeCall");
	}
	public void sendMessage() {
       System.out.println("sendMessage");
    }
    private void payBill() {
	   System.out.println("payBill");
    }
    public static void main(String[] args) {
     MyMobile mle=new MyMobile();
    mle.makeCall();
    mle.sendMessage();
    mle.payBill();
    System.out.println(mle.sim);
    System.out.println( mle.memory);
    }
    }