package week1.day2;

public class Firefox {
	float version=100.2f;
	String name="firefox";
	boolean visible=true;
	int year=1998;
	char logo='m';
	private void edge() {
		System.out.println( version);
		System.out.println(name);

	}
	private void chrome() {
		int speed=25;
		System.out.println(speed);      
	}

	public static void main(String[] args) {
		Firefox fire=new Firefox();
		fire.chrome();
		fire.edge();


	}

}
