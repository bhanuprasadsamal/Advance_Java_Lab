package Two;
import One.Calculate;
public class MianCalculate extends Calculate{
		public static void main(String[] args) {
			int a =64;
			int b= 13;
			//The add() method is not accessible directly be instantiating the class
			Calculate cal = new Calculate();
			//int sum = cal.additionOfNums(A,B);
			//
			MianCalculate mc =new MianCalculate();
			int sum = mc.additionOfNums(a,b);
			
			System.out.println("We get: "+sum);
			System.out.println("Hash code of cal: "+ cal.hashCode());
			System.out.println("Hash code of mc: "+ mc.hashCode());
		}
	}

