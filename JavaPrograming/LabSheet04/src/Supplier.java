import javax.swing.JOptionPane;

public class Supplier {

	public static void main(String[] args) {
		
	   IceCream order = new IceCream();
		
		order.setFlavor(Integer.parseInt(JOptionPane.showInputDialog("[1] Vanilla Flavor\n[2] Chocolate Flavor\n[3] Green Tea Flavor")));
	  
		int bottle =0;
		
		while(order.checkFlavor()==false)
		{
			order.setFlavor(Integer.parseInt(JOptionPane.showInputDialog("Sorry,please input only 1, 2, or 3")));
		}
         int bucket =(Integer.parseInt(JOptionPane.showInputDialog("How many bucket of "+order.getFlavor()+":")));
         
         while(bucket<=0) {
        	 bucket =(Integer.parseInt(JOptionPane.showInputDialog("How many bucket of "+order.getFlavor()+":")));
         }
         
         int top=(Integer.parseInt(JOptionPane.showInputDialog("[1] Whip-cream\n[2] Caramel\n[3] Honey\n[4] Not get order")));
         order.setTopping(top);
         while(order.checkTopping()==false)
 		{
 			top=(Integer.parseInt(JOptionPane.showInputDialog("Sorry,please input only 1, 2, 3 or 4")));
 			 order.setTopping(top);
 		}
         
         //order.setTopping(top);
         
         if(top!=4)
         {
        	  bottle =(Integer.parseInt(JOptionPane.showInputDialog("How many bottle of "+order.getTopping()+":")));
        	 
        	 while(bottle<=0) {
        		 bottle =(Integer.parseInt(JOptionPane.showInputDialog("How many bottle of "+order.getTopping()+":")));
        	 }
         }
         
         String bot =Integer.toString(bottle);
         
         JOptionPane.showMessageDialog(null,"Your order:\n"+bucket+" of "+order.getFlavor()+"\n"+(top==4?"":bot+" Bottles of "+order.getTopping()));
	}

}
