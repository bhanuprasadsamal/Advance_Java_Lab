
public class ExceptionsDemo {
	public static void main(String[] args)
	{
		int dividend,divisor,quotient;
		int scores[]= {95,96,82};
		dividend=532;
		divisor=0;
		try {
			quotient=dividend/divisor;
			
		}catch(ArithmeticException ae) {
			System.out.println("Division by zero occurred...!");
			System.out.println(ae.getMessage());
		}
		try {
			System.out.println(scores[3]);
			
		}catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("Array index is invalid");
		}
	}
}
