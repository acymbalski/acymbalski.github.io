
// import all available files/classes from java/util
// we want this because it contains "Scanner," which we use for user input
import java.util.*;

// name of class (and therefore file)
// must start with capital letter
public class FahrenheitToCelsius
{

	double celsius_temp;

	// a constructor. when you make an instance of this class,
	// the constructor will be called automatically.
	// these are used to initialize variables.
	FahrenheitToCelsius()
	{

	}

	// another constructor. when you make an instance of this class
	// AND pass it a double, it will call this instead of the one above.
	FahrenheitToCelsius(double f)
	{
		celsius_temp = calculateFtoC(f);
	}

	


	public double calculateFtoC(double f)
	{
		// even though we declared "temperature" elsewhere, it's "encapsulated"
		// inside the method it was created in. outside of that method,
		// it doesn't exist. we DID make the variable 'celsius_temp' in the
		// class though, so that is a "global" we can use anywhere.
		// but it doesn't exist outside of this class.
		double temperature = f;
		temperature = ((temperature - 32) * 5) / 9;
		celsius_temp = temperature;

		// return the value. remember that the type we're returning must
		// match the type we said we would return in the line with the method's name
		// "public DOUBLE calculateFtoC(double f)"
		return temperature;
	}

	// a "getter," it exists only to return a value.
	// these do get more complicated than just a one-line return but standard
	// practice is to always start them with "get" so there are no surprises.
	public double getCalculatedValue()
	{
		return celsius_temp;
	}

	// private functions can only be called by the class they're in.
	// for example, in the "main" function we could NOT call f2c.otherStuff()
	// because it's private.
	// the word "void" means it won't return a value. if you see a "return" in
	// a "void" method, it just means "exit the method RIGHT NOW" and cannot have
	// a value with it.
	private void otherStuff()
	{

		// create an array of 5 integers.
		// arrays can be thought of as lists, but technically in most languages
		// "lists" and "arrays" are different. but don't think about that too hard.
		// we are making the array (named 'a') with 5 slots to put integers.
		int a[] = new int[5];

		// if you call upon any of those slots right now, you'll probably receive an error. that's because they don't have a value yet. remember that there's 0 and there's 'null," which are different. null means literally nothing, no value.
		// let's set all the slots to 0 so we can use it.
		// remember computers count starting at 0, so an array of '5' goes from 0-4
		a[0] = 0;
		a[1] = 0;
		a[2] = 0;
		a[3] = 0;
		a[4] = 0;

		// let's set them all a bit more concisely
		// for loops have three sections in them, separated by semicolons.
		// the first one sets up your index/count variable, if you need one.
		// don't forget to set it!
		// the second section is how long the function will go on for.
		// ours will go for the length of our array 'a.'
		// lastly, how to increment. You could say "i += 2" to skip every other one,
		// for example.
		for(int i = 0; i < a.length; i++)
		{
			a[i] = 0;
		}

		// or if you really want to be concise, you can skip the curly braces.
		// You can do this for if statements too, it will ONLY take the next line.
		// I really hate this because it can get a little confusing in big programs
		// so I avoid it.
		for(int i = 0; i < a.length; i++)
			a[i] = 0;

		// we can use all that logic to count backwards.
		// just check the index variable though. the LENGTH of 'a' is 5, but our last
		// slot is number 4. so we have to make sure we start at 4, not 5.
		for(int i = a.length - 1; i >= 0; i--)
		{
			a[i] = 0;
		}

		// checking specific array values. this should not evaluate as "true"
		if(a[3] == 1)
		{
			System.out.println("a[3] is 1");
		}
		else
		{
			System.out.println("a[3] is not 1");
		}
	}
	
	
	  // the main function. This is where your programs will probably all begin.
		public static void main(String[] args)
		{
			System.out.println("This is the starting point of the program.");

			System.out.println("Nothing else will run outside of this method unless I tell it to.");

			// create integer 'x'
			int x;

			// store value in 'x'
			x = 5;

			// calculate x * 3 and store it in 'x'
			x *= 3;

			// calculate x + 2 and store it in 'x'
			x += 2;

			// create integer 'y' and set it equal to the remainder of x / 2
			// in practical terms, this gets us '0' if x is even, '1' if x is odd
			int y = x % 2;
			System.out.println("The value of \"y = x % 2\" is " + y);

			// create double 'z'
			// double = number with decimals. a 'float' can do this as well
			// doubles and floats are the same but doubles can hold more decicmal places
			double z;

			// demonstrate that integer division doesn't get you decimals
			z = x / 2;
			System.out.println("The value of \"z = x / 2\" is " + z);

			// "casting" - treating 'x' like it has decimal places, then dividing WILL
			// get you decimals
			z = (double) x / 2;
			System.out.println("The value of \"z = (double) x / 2\" is " + z);

			double temperature;

			// here we're making a new instance of the class "Scanner."
			// it's just like making an int or a double except by using this "new"
			// keyword, we're calling its constructor to get the class all set up.
			// "System.in" is the counterpart to System.out, of System.out.print fame.
			// Only it takes input, not output. We use it here to tell Scanner
			// where it will be listening for input from.
			Scanner sc = new Scanner(System.in);

			// Give the user a prompt to enter input
			System.out.println("Enter temperature in Fahrenheit");
			// listen for input and store the next integer they input (waiting until
			// they hit the "enter" key) in "temperature"
			temperature = sc.nextInt();

			double celsius_temp;

			// f->c calculation
			celsius_temp = ((temperature - 32)*5)/9;

			System.out.println("Temperature in Celsius = " + temperature);

			// I know we're technically inside the FahrenheitToCelsius class
			// but we're inside this special "public static void" class so it doesn't count,
			// so we have to make an instance of it to use any of its methods
			FahrenheitToCelsius f2c = new FahrenheitToCelsius();

			// we can use methods with return values just like values for variables.
			// also remember that this method "calculateFtoC" is inside "FahrenheitToCelsius,"
			// so we have to call it from our variable of type "FahrenheitToCelsius"
			celsius_temp = f2c.calculateFtoC(temperature);
			System.out.println("Temperature in Celsius = " + celsius_temp);

			// here we're using our OTHER constructor to just do what we want automatically
			FahrenheitToCelsius f2c_2 = new FahrenheitToCelsius(temperature);

			System.out.println("Temperature in Celsius = " + f2c.getCalculatedValue());

		}


}
