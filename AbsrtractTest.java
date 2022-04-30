
public class AbsrtractTest {
	
	public static void main(String[] args) {
		
		//Instrument i=new Instrument();cannot create an object of an abstract class
		Guitar g= new Guitar();
		g.utilize();
		g.play();
		g.tuneStr();
		g.pluck();
		
		
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
	
	
	
}



