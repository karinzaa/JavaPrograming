public class Cinema {

	private String seatName;
	private int discount;

	public void setSeatName(String name){
		seatName=name; 
		

	}
	
	public String getSeatName() {
		return seatName;
		
	}
	
	public void setDiscount(int dis) {
		discount = dis;
		
	}
	
	public boolean checkSeatName() {

			seatName.toUpperCase();
			
			if (seatName.charAt(0)=='A'||seatName.charAt(0)=='B'||seatName.charAt(0)=='C'||seatName.charAt(0)=='D'||seatName.charAt(0)=='E'||seatName.charAt(0)=='F'||seatName.charAt(0)=='G'||seatName.charAt(0)=='H'||seatName.charAt(0)=='I'||seatName.charAt(0)=='J'||seatName.charAt(0)=='a'||seatName.charAt(0)=='b'||seatName.charAt(0)=='c'||seatName.charAt(0)=='d'||seatName.charAt(0)=='e'||seatName.charAt(0)=='f'||seatName.charAt(0)=='g'||seatName.charAt(0)=='h'||seatName.charAt(0)=='i'||seatName.charAt(0)=='j') {if(seatName.charAt(1)=='1'||seatName.charAt(1)=='2'||seatName.charAt(1)=='3'||seatName.charAt(1)=='4'||seatName.charAt(1)=='5'||seatName.charAt(1)=='6'||seatName.charAt(1)=='7'||seatName.charAt(1)=='8'||seatName.charAt(1)=='9') {
				return true;
			}}
			return false;
		
		
	}
	
	public int findPrice() {
		if (seatName.charAt(0)=='A'||seatName.charAt(0)=='B'||seatName.charAt(0)=='C'||seatName.charAt(0)=='a'||seatName.charAt(0)=='b'||seatName.charAt(0)=='c') {
			return 100;
		}
		if (seatName.charAt(0)=='D'||seatName.charAt(0)=='E'||seatName.charAt(0)=='F'||seatName.charAt(0)=='d'||seatName.charAt(0)=='e'||seatName.charAt(0)=='f') {
			return 150;
		}
		if (seatName.charAt(0)=='G'||seatName.charAt(0)=='H'||seatName.charAt(0)=='I'||seatName.charAt(0)=='J'||seatName.charAt(0)=='g'||seatName.charAt(0)=='h'||seatName.charAt(0)=='i'||seatName.charAt(0)=='j') {
			return 200;
		}
		return 0;
	}
	
	public float CalNetPrice(float totalPrice) {
		return totalPrice - (totalPrice*discount/100);
	}
	
	

}