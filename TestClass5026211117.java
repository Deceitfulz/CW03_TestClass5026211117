public class TestClass5026211117 {

	public static void main(String[] args){
		
		ComputeMethods5026211117 comet = new ComputeMethods5026211117();
		
		double celcius = comet.fToC(100.4);
		System.out.println("Temp in celcius is " +celcius); //Converting 250F to C
		
		double hypotenuse = comet.hypotenuse(6,9);
		System.out.println("Hypotenuse is = " +hypotenuse); //Counting the hypotenuse
		
		int roll = comet.roll();
		System.out.println("The sum of the dice value is " +roll); //Sum of two random dice
	}
}