public class RandomNumber {

	public static void main (String[] args) {
		double RandomVar = (Math.floor(Math.random() * 10) % 6) + 1;
		System.out.println("Dice rolled value: " + RandomVar);
	}
}
