import java.util.Scanner;

public class Driver extends AndroidPhone {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the phone name");
		String phoneName = scan.nextLine();
		System.out.println("Enter the phone brand");
		String phoneBrand = scan.nextLine();
		System.out.println("Enter the phone price");
		int phonePrice = scan.nextInt();
		System.out.println("Enter the phone screen size");
		int screenSize= scan.nextInt();
		System.out.println("Enter the phone thickness");
		double thickness = scan.nextDouble();
		System.out.println("Enter the phone audio jack status");
		boolean isAudioJackPresent = scan.nextBoolean();
		scan.close();
		
		AndroidPhone ap = new AndroidPhone();
		ap.buildPhone(phoneName, phoneBrand, phonePrice, screenSize, thickness, isAudioJackPresent);
		ap.myAwesomePhone();
		
		
		
	}

}
