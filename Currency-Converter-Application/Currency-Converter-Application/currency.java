package Classes;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;
public class currency {
	String name;
	double rate;
	public static double convert(double number,currency c1,currency c2) {
		double base = c1.rate;
		double dest = c2.rate;
		double result =(double)(dest/base*number);
		return result;

	}
	public static currency Identify(int index) {
		File file = new File("C:\\Users\\Sevakula Jyothi\\OneDrive\\Desktop\\out\\testout.txt");

		HashMap<String,Double> storeVal=new HashMap<>();
		try {
			Scanner sc = new Scanner(file);
			System.out.println("Scanner is working..");

			while (sc.hasNextLine())
			{
				String name="";
				String str=sc.nextLine();
				String input[]=str.split(" ");
				int n=input.length;
				input[n-2]=input[n-2].replace(",","");
				Double value=Double.parseDouble(input[n-2]);
				for(int k=0;k<=n-3;k++) {
					name+= input[k] + " ";
				}
				name=name.trim();
				//System.out.println(n+" "+name);
				storeVal.put(name, value);
			}
			//System.out.println(storeVal);
		}
		catch(Exception e)
		{
			System.out.println("In catch..");
		}

		String name="";
		double val=0;
		currency c;
		if(index==0)
		{

			for(String str:storeVal.keySet())
			{
				if(str.equals("Indian Rupee"))
				{
					val=storeVal.get(str);
					System.out.println("IND "+val);
					break;
				}
			}

			c=new currency("IND",val);
		}
		else if(index==1) {
			for(String str:storeVal.keySet())
			{
				if(str.equals("Canadian Dollar"))
				{
					val=storeVal.get(str);
					System.out.println("CD "+val);
					break;
				}
			}
			c= new currency("CD",val);
		}
		else if(index==2) {
			for(String str:storeVal.keySet())
			{
				if(str.equals("Australian Dollar"))
				{
					val=storeVal.get(str);
					System.out.println("Aus "+val);
					break;
				}
			}
			c= new currency("AUS",val);
		}
		else if(index==3) {
			for(String str:storeVal.keySet())
			{
				if(str.equals("European Euro"))
				{
					val=storeVal.get(str);
					System.out.println("Euro "+val);
					break;
				}
			}
			c= new currency("Euro",val);
		}
		else if(index==4){
			for(String str:storeVal.keySet())
			{
				if(str.equals("Singapore Dollar"))
				{
					val=storeVal.get(str);
					System.out.println("SGD "+val);
					break;
				}
			}
			c= new currency("SGD",val);
		}
		else if(index==5) {
			for(String str:storeVal.keySet())
			{
				if(str.equals("Pakistani Rupee"))
				{
					val=storeVal.get(str);
					System.out.println("PKR "+val);
					break;
				}
			}
			c= new currency("PKR",val);
		}

		else if(index==6) {
			for(String str:storeVal.keySet())
			{
				if(str.equals("Japanese Yen"))
				{
					val=storeVal.get(str);
					System.out.println("JPY "+val);
					break;
				}
			}
			c= new currency("JPY",val);
		}
		else if(index==7) {
			for(String str:storeVal.keySet())
			{
				if(str.equals("Mexican Peso"))
				{
					val=storeVal.get(str);
					System.out.println("MXN "+val);
					break;
				}
			}
			c= new currency("MXN",val);
		}
		else if(index==8) {
			for(String str:storeVal.keySet())
			{
				if(str.equals("Indonesian Rupiah"))
				{
					val=storeVal.get(str);
					System.out.println("IDR "+val);
					break;
				}
			}
			c= new currency("IDR",val);
		}
		else
		{
			for(String str:storeVal.keySet())
			{
				if(str.equals("United Arab Emirates Dirham"))
				{
					val=storeVal.get(str);
					System.out.println("UAED "+val);
					break;
				}
			}
			c= new currency("UAED",val);
		}
		return c;

	}


	public currency(String name,double rate) {
		this.name=name;
		this.rate = rate;
	}
}