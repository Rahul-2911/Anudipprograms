abstract class ElecBill
{
	double units;
	public abstract void getunits();
	public void CalculateBill(int rate)
	{
	System.out.println(rate*units);
}
}
class House extends ElecBill
{
	public void getunits()
	{
		units  = 200;
	}
}
class Bussiness extends ElecBill
{
	public void getunits()
	{
		units  = 150;
	}
}
public class AbstractExample {

	public static void main(String[] args) 
	{
		House h = new House();
		h.getunits();
		h.CalculateBill(4);
		
		Bussiness b = new Bussiness();
		b.getunits();
		b.CalculateBill(6);
	}

}
