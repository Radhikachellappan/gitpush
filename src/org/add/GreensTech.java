package org.add;

public class GreensTech {
	//method creation
	private void greensOmr(){
		System.out.println("Greens Omr = No.19 Rajiv Gandhi Salai,Thoraipakkam,Tamil Nadu 600097"); 
	}
	private void greensAdayar(){
		System.out.println("Greens Adayar = No.10/15 1st street,padmanabha Nagar,Adyar,chennai 600020");
	}
	private void greensTambaram(){
		System.out.println("Greens Tambaram = Tambaram Sanatorium,1,Apparao Colony,Tambaram,chennai 600047");
	}
	private void greensVelacherry(){
		System.out.println("Greens Velacherry = No.28 Nagendra Nagar,velachery,chennai 600042");
	}
	private void greensAnnaNagar(){
		System.out.println("Greens AnnaNagar = 4th floor,W122,3rd Ave, W Block,Annanagar East,chennai 600040");
	}
	
	//main method
	public static void main(String args[]) {
		//object creation
		//ClassName objectName = new ClassName();
		GreensTech greensAddress = new GreensTech();
		//method call
		//objectName.methodName();
		greensAddress.greensOmr();
		greensAddress.greensAdayar();
		greensAddress.greensTambaram();
		greensAddress.greensVelacherry();
		greensAddress.greensAnnaNagar();
		
	}
	

}
