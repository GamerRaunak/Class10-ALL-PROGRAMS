package Class10.Board_paper_2013;
import java.util.*;
public class FruitJuice
{
	int product_code,pack_size,product_price;
	String flavour,pack_type;
	FruitJuice()
	{
		product_code=0;
		pack_size=0;
		product_price=0;
		flavour="";
		pack_type="";
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product code: ");
		product_code=sc.nextInt();
		System.out.println("Enter the flavour: ");
		flavour=sc.next();
		System.out.println("Enter the pack type: ");
		pack_type=sc.next();
		System.out.println("Enter the pack size: ");
		pack_size=sc.nextInt();
		System.out.println("Enter the product price: ");
		product_price=sc.nextInt();
		sc.close();
	}//end of input()
	void discount()
	{
		product_price-=10;
	}//end of discount
	void display()
	{
		System.out.println("Product code: "+product_code);
		System.out.println("Flavour: "+flavour);
		System.out.println("Pack type: "+pack_type);
		System.out.println("Pack size: "+pack_size);
		System.out.println("Product price: "+product_price);
	}//end of display()
	public static void main(String args[])
	{
		FruitJuice obj=new FruitJuice();
		obj.input();
		obj.discount();
		obj.display();
	}//end of main()
}//end of class
