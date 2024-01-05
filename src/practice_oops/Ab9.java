/* Write a Java program to create an abstract class Instrument with abstract methods play() and tune().
 *  Create subclasses for Glockenspiel and Violin that extend the Instrument class
 *   and implement the respective methods to play and tune each instrument
 */

package practice_oops;

abstract class Instrument{
	abstract void play();
	abstract void tune();
	
}
class Glockenspiel extends Instrument{

	
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Glockenspiel plays = tane tane nanane");
	}


	void tune() { 
		// TODO Auto-generated method stub
		System.out.println("Glockenspiel tune = zzzz eeee tttaattaat");
	}
	
}
class Violin extends Instrument{

	
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Violin plays = jayaradhehey govindha ");
	}


	void tune() { 
		// TODO Auto-generated method stub
		System.out.println("Violin tune = zum zum zum");
	}
	
}
public class Ab9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Violin obj=new Violin();
		Glockenspiel ob=new Glockenspiel();
		obj.play();
		obj.tune();
		ob.play();
		ob.tune();

	}

}
