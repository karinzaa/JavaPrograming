import javax.swing.JOptionPane;

public class BookTicket {

	public static void main(String[] args) {
		

		int more,di;
		float totalPrice = 0;
		
		String name = JOptionPane.showInputDialog("Input customer name : ");
		
		Cinema booking = new Cinema();
		
		do {
		
		String seatName = JOptionPane.showInputDialog("Input seat name : ");
		
		booking.setSeatName(seatName);

		while (booking.checkSeatName()==false) {
			seatName = JOptionPane.showInputDialog("Input seat name, again : ");
			
			booking.setSeatName(seatName);
		}
		
		totalPrice = totalPrice + booking.findPrice();
		
		more = JOptionPane.showConfirmDialog(null, "Do you want to booking more ?","Booking",JOptionPane.YES_NO_OPTION);
		
		}while (more == JOptionPane.YES_OPTION);
		
		di = JOptionPane.showConfirmDialog(null, "Total price is " + totalPrice + "baht." + "\nDo you have coupon discount ?","Coupon",JOptionPane.YES_NO_OPTION);
		
		if(di == JOptionPane.YES_OPTION) {
			int Discount = Integer.parseInt(JOptionPane.showInputDialog("Input discount(%): "));
			booking.setDiscount(Discount);
			
			JOptionPane.showMessageDialog(null, "Customer name : " + name + "\nThe amount to be paid is " + booking.CalNetPrice(totalPrice) + "baht." );
		}
		
		if(di == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Customer name : " + name + "\nThe amount to be paid is " + booking.CalNetPrice(totalPrice) + "baht." );
		}
		
	}

}