import java.util.ArrayList;

public class StringlistDemo {
	public static void main(String[] args)
	{
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("Bhubaneswar");
		cityList.add("cuttack");
		cityList.add("jajpur");
		cityList.add("sambalpur");
		System.out.println("Number of objects: "+cityList.size());
		for(String city: cityList) {
			System.out.println(city);
			
		}
		System.out.println("city with index2"+cityList.get(2));
		cityList.remove(0);
		System.out.println("city list after deleting");
		for(String city: cityList) {
			System.out.println(city);
		}
		
	}
}
