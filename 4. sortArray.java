import java.util.Scanner;
import java.util.Arrays;

class sortArray{
	public static void main(String[] args)
	{
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of strings to sort: ");
		size = sc.nextInt();
		String[] string = new String[size];
		System.out.println("\nEnter the strings:");
		for (int i=0; i<size; i++)//Reading strings
			string[i]=sc.next();
		System.out.print("\nChoose 1: Sort using in-built method   2: Sort using user defined function: ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
				Arrays.sort(string);
				break;
			case 2:
				String temp;			
				for (int i=0;i<size;i++)
					for (int j=i+1;j<size;j++)
						if (string[i].compareTo(string[j])>0)
						{
							temp = string[i];
							string[i]=string[j];
							string[j] = temp;
						}	
				break;
		}
		System.out.println("\nThe sorted Arrary is:");		
		for (int i=0;i<size;i++)
			System.out.println(string[i]);//Printing the sorted array
	}
}

