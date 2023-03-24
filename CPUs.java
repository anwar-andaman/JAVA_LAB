class CPU
{
	int price = 25000;
	
	class Processor
	{
		int cores = 8;// No. of Processor Cores
		String manuf="Intel Corp.";
		void display_info()
		{
			System.out.println("No. of Cores: " + cores + " Cores");
			System.out.println("Manufacturer: " + manuf);
		}
	}
	
	static class RAM
	{
		int memory = 16;//in GB
		String manuf="Gigabit";
		
		void display_info()
		{
				
			System.out.println("\n******RAM Details*****");			
			System.out.println("Memory: " + memory + " GB");
			System.out.println("Manufacturer: " + manuf);
		}
	}

	void display_info()
	{
		System.out.println("\n********Processor Details********");
		Processor pr = new Processor();
		pr.display_info();
		System.out.println("Price: " + price);
	}
}
public class CPUs
{
	public static void main(String[] args)
	{
		CPU cp = new CPU();
		CPU.RAM rm = new CPU.RAM();
		cp.display_info();
		rm.display_info();
	}
}
		
