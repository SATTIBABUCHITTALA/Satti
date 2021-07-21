

class NumberOperations{
	
	
	String findEvenOrOdd(int num) {
		
		String result="";
		
		
		if(num%2 ==0) {
			result="Given number is Even";
		
		}
		else if(num%2 !=0) {
			
			
			result="Given number is Odd";
		}
		
		return result;
	}
	
	
}
public class EvenOrOdd {
	
	public static void main(String args[]) {
		
		NumberOperations oper=new NumberOperations();
		
		String str=oper.findEvenOrOdd(6);
		
		System.out.println(str);
		
		
		
		
	}
	
	
	
	

}
