
public class IceCream {
private int Flavor ;
private int Topping;

public void setFlavor(int flavor)
{
	Flavor = flavor ;
}
public String getFlavor()
{
	if(Flavor == 1)
	{
		return "Vanilla";
	}
	else if (Flavor == 2)
	{
		return"Chocolate";
	}
	return"Green Tea";
	
}
public boolean checkFlavor()
{
	if(Flavor == 1 || Flavor==2||Flavor==3)
	{
		return true;
	}
	return false;
}

public void setTopping (int topping)
{
	Topping = topping;
	
}
public String getTopping()
{
	if(Topping==1)
	{
		return"Whip-cream";
	}
	else if (Topping == 2)
	{
		return"Caramel";
	}
	return"Honey";
}
public boolean checkTopping()
{
	if(Topping == 1 || Topping==2||Topping==3||Topping==4)
	{
		return true;
	}
	return false;
	
}
public int findPrice()
{
	int total =0;
	
	if(Flavor == 3)
	{
		total=total+15;
	}
	else
	{
		total = total + 10;
	}
	
	if(Topping == 4)
	{
		return total;
	}
	else if (Topping==1)
	{
		total = total + 10;
	}
	else
	{
		total = total + 15;
	}
	
	return total;
	
 }

}
