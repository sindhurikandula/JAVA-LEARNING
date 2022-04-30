class Kite {
	String kiteColor;
	String kiteOwner;
	int kiteLength;
	boolean flyingStatus;

	static int kitecount;

	public Kite(String kiteColor, String kiteOwner, int kiteLength, boolean flyingStatus) {
		super();
		System.out.println("kite constructor is invoked");
		this.kiteColor = kiteColor;
		this.kiteOwner = kiteOwner;
		this.kiteLength = kiteLength;
		this.flyingStatus = flyingStatus;
		kitecount++;
	}

	void fly() {
		System.out.println(kiteColor + " kite of length " + kiteLength + " is flying by " + kiteOwner
				+ " and flying status of kite is " + flyingStatus);
	}

	void kitefight(Kite kref) {
		
		
		for(int i=1;i<10;i++)
		{
			double value=Math.random()%100;
			
			System.out.println("Kite fight startred between "+kiteOwner+" and "+kref.kiteOwner+" and value is" +value);
			if(value>0.98)
			{
				kref.flyingStatus=false;
				kitecount--;
				break;
			}
			else if(value>0.40 && value<0.97)
			{
				kref.flyingStatus=false;
				flyingStatus=false;
				kitecount=kitecount-2;
				break;
			}
			else if(value<0.20)
			{
				flyingStatus=false;
				kitecount--;
				break;
			}
		}
}
}

public class StaticTest {

	public static void main(String[] args) {

		System.out.println("Kite count is " + Kite.kitecount);

		Kite k1 = new Kite("red", "sindhuri", 5, true);
		Kite k2 = new Kite("Black", "sahnvi", 8, true);
		Kite k3 = new Kite("Green", "Aashri", 6, true);

		k1.fly();
		k2.fly();
		k3.fly();

		System.out.println("Kite count is " + Kite.kitecount);
		
		k2.kitefight(k3);
		
		k1.fly();
		k2.fly();
		k3.fly();

		System.out.println("Kite count is " + Kite.kitecount);
		
	}
}
