
public class VariablesExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write code to Convert Years into Days and print it on the console.
	int intyears = 5;
	int intdays = 365;
	int totalDays = intyears * intdays;
	
	System.out.println ("Total Days:" + totalDays);

//Write code to calculate cube of a number and print it on the 	console 
	int intnumber = 4;               // Hardcoded input
    int intcube = intnumber * intnumber * intnumber;  // Cube calculation

    System.out.println("Cube is: " + intcube);  // Output

//Write code to concatenate character ‘J’,’A’,’V’,’A’ to a string 
//and print it on the console. 
    char ch1 = 'J';
    char ch2 = 'A';
    char ch3 = 'V';
    char ch4 = 'A';

    String result = "" + ch1 + ch2 + ch3 + ch4;

    System.out.println(result);  // Output: JAVA 
   
	}

}
