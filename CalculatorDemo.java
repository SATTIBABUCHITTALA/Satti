


class Calculator{
	

	int calculateSquare(int num) {
		 int result;
		result=num*num*num; ///square of that given numebr here
		return result;  // sending back this result to that calling method. 
	}

}




public class CalculatorDemo {

	public static void main(String args[]) {
		
		
		Calculator std=new Calculator();
		
	int n=std.calculateSquare(78);
		
		System.out.println("Square of the given number is  "+n);
		
		
		
		
	}
	
	
	
}
