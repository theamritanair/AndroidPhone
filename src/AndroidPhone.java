
public class AndroidPhone {
	
	private int phonePrice, screenSize;
	private double thickness;
	private boolean isAudioJackPresent;
	private String phoneName, phoneBrand;
	
	
	public void myAwesomePhone() {
		
		System.out.println("The phone name is "+ phoneName+" and the phone brand is "+phoneBrand);
		System.out.println("The thickness is "+thickness);
		System.out.println("The phone screen size is "+screenSize+" and the phone price is "+phonePrice);
		System.out.println("The audio jack status is "+ isAudioJackPresent);
	}
	
	public void buildPhone(String phoneName,
							String phoneBrand,
							int phonePrice,
							int screenSize,
							double thickness,
							boolean isAudioJackPresent) {
		this.phonePrice= phonePrice;   						//refers to the current object
		this.screenSize= screenSize;
		this.phoneBrand= phoneBrand;
		this.phoneName= phoneName;
		this.thickness= thickness;
		this.isAudioJackPresent= isAudioJackPresent;
		
	}
	
	
	
	

}
