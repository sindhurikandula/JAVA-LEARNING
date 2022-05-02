
public class AbsrtractTest {
	
	public static void main(String[] args) {
		
		//Instrument i=new Instrument();cannot create an object of an abstract class
		Guitar g= new Guitar();
		g.utilize();
		g.play();
		g.tuneStr();
		g.pluck();
		
		System.out.println("-------------------------------");
		
		Violin v=new Violin();
		v.play();
		v.tuneStr();
		v.utilize();
		System.out.println("-------------------------------");
		
		ElectronicGuitar eg=new ElectronicGuitar();//using object reference eg all the methods can be called
		eg.play();//inherited method
		eg.pluck();//inherited method
		eg.playElectronicGuitar();//Explicit method
		
		System.out.println("-------------------------------");
		
		Cello c= new Cello();//using object reference of Cello all the methods can be called
		c.play();//inherited method
		c.playViolin();//Explicit method
		
		Instrument i=new Guitar();// using object reference i we can call only methods of class Instrument
		i.utilize();
		
		MusicalInstrument mi=new Guitar();// using object reference mi we can call only methods of class Instrument and MusicalInstrument
		mi.utilize();
		mi.play();
		
		MusicalInstrument mi2=new Cello();// using object reference mi we can call only methods of class Instrument and MusicalInstrument
		mi2.play();
		
		
	}

}
 abstract class Instrument
{
	abstract void utilize();
	
}
abstract class MusicalInstrument extends Instrument
{
	abstract void play();
}
abstract class MedicalInstrument extends Instrument
{
	abstract void diagnose();
	
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStr();
	
}
abstract class AirBasedMusicalInstrument extends MusicalInstrument
{
   abstract void blow();
}
abstract class SurgicalBasedMediaclInstrument extends MedicalInstrument
{
   abstract void sterilize();
}
abstract class PathalogicalMediaclInstrument extends MedicalInstrument
{
   abstract void read();
   abstract void scan();
}
class Guitar extends StringBasedMusicalInstrument
{

	@Override
	void tuneStr() {
		
		System.out.println("Tuning the guitar strings...");
	}

	@Override
	void play() {
		System.out.println("Playing the guitar...");
		
	}

	@Override
	void utilize() {
		System.out.println("Utilizing the guitar...");
	}
		
		void pluck()
		{
			System.out.println("Plucking the guitar....");
		}	
		
	
}

class Violin extends StringBasedMusicalInstrument
{

	@Override
	void tuneStr() {
		System.out.println("Tuning the violin...");
		
	}

	@Override
	void play() {
		System.out.println("Playing the violin..");
		
	}

	@Override
	void utilize() {
		System.out.println("Utilizing the violin..");
		
	}
	
	
	
}
class ElectronicGuitar extends Guitar
{
   void playElectronicGuitar()
   {
	   System.out.println("Playing the Electronic Guitar..");
   }
}

class Cello extends Violin
{
   void playViolin()
   {
	   System.out.println("Playing the celloViolin..");
   }
   
}


