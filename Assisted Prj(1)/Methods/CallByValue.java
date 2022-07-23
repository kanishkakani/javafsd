package javafsd;

public class CallByValue {
	  int input = 25;

	  void operation(int input) {

		this.input = input * 1/100;
//if parameter is not passed it will take default value, but once the parameter

// is passed it will take the value of parameter
 }

	public static void main(String[] args) {
		
		CallByValue obj= new CallByValue();

		System.out.println("Value of num before function call: "+obj.input);

		obj.operation(25);

		System.out.println("Value of num after function call: "+obj.input);

	}


}
