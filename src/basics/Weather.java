package basics;

public class Weather {
	public static void main(String[] args) {
		
		// This program suggests clothes based on weather conditions
		
		int temp = 55;
		String sunCondition = "Overcast";
		
		if (temp > 80) {
			System.out.println("It is pleasant. Wear shorts and a t-shirt.");
		}
		else if ((temp > 60) && (sunCondition != "Sunny")) {
			System.out.println("It's a little cooler. Long sleeve shit and jeans.");
			System.out.println("Wear a hat to keep the sun out of your eyes.");
		}
		else if ((temp > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day. Wear warmer clothes.");
		}
		else {
			System.out.println("Looks like a cold day. Bring a sweater");
		}
		System.out.println("The program is ending.");
	}
	
}
