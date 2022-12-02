import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please Select a program!");
		System.out.println("1.Arrays");
		System.out.println("2.Nested");
		System.out.println("3.Operators");
		System.out.println("4.Repetition");
		System.out.println("5.Selection");
		System.out.println("6.Sub-Programs");
		System.out.println("7.Variables");
		System.out.println("Your choice:");
		int choice = in.nextInt();
		if (choice == 1) {
			System.out.println("You selected Arrays!");
			
			
			
			System.out.println("Pick an array size, and dont just say yes");
			int size = in.nextInt();
			
			double[] temp = new double [size];
			
			System.out.println("Pick the doubles,if not go fish");
			int n = temp.length;
			int b = 0;
			
			for (int i=0;i<n;i++) {
					double a = in.nextDouble();
					temp[b]=a;
					b++;	
			}
			
			double max = 0;
			
			for (int i=0;i<n-1;i++) {
				
				if (temp[i]>=temp[i+1]) {
					max = temp[i];
				}
				else {
					max = temp[i+1];
				}
			}
			
			double min = 0;
			
			for (int i=0;i<n-1;i++) {
				
				if (temp[i]<=temp[i+1]) {
					min = temp[i];
				}
				else {
					min = temp[i+1];
				}
			}
			
			double average = 0;
			
			for (int i=0;i<n-1;i++) {
				average = temp[i]+temp[i+1];
				
			}
			
			
			
			System.out.println("The maximum of your number is: "+max);
			System.out.println("The minimum of your nunmber is: "+min);
			System.out.println("The average of your nunber is: "+average);

			
			in.close();
		
		
		
		}
	

		else if (choice == 2) {
			System.out.println("You selected Nested");
			System.out.println("Enter the first value?");
			int N1 = in.nextInt();
			System.out.println("Enter the second value?");
			int N2 = in.nextInt();
			for (int i = 1; i <= N2; i++) {
				for (int j = 1; j <= N2; j++) {
					System.out.print(j * i + "\t");
				}
				System.out.println("\n");
			}
		} else if (choice == 3) {
			System.out.println("You selected Operators");

			System.out.println("Enter a number, At your own danger:");
			int x = in.nextInt();
			int temp = x;
			x = x - 1;
			System.out.println(temp + "-1=" + x);
			int O1 = x;
			x = x * 3;
			System.out.println(O1 + "x3=" + x);
			int O2 = x;
			x = x + 12;
			System.out.println(O2 + "+12=" + x);
			int O3 = x;
			x = x / 3;
			System.out.println(O3 + "/3=" + x);
			int O4 = x;
			x = x + 5;
			System.out.println(O4 + "+5=" + x);
			int O5 = x;
			x = x - temp;
			System.out.println(O5 + "-" + temp + "=" + x);
			System.out.println("It comes out to 4 + 4");
		}

		else if (choice == 4)

		{
			System.out.println("You selected Repetition");
		Random R = new Random();
		int R1 = R.nextInt(10);
		int R2 = R.nextInt(10);
		int R3 = R.nextInt(10);
		String RS1 = (R1 + "," + R2 + "," + R3);

		int count = 0;
		int R11, R22, R33;
		do {

			R11 = R.nextInt(10);

			R22 = R.nextInt(10);

			R33 = R.nextInt(10);
			count++;
		} while (R1 != R11 || R2 != R22 || R3 != R33);
		System.out.println("It took: " + count + " tries");
		}
		else if (choice == 5) {
			System.out.println("You selected Selection");
			
			System.out.println("Please enter a number, If you Dare >:)");
			int num = in.nextInt();
			double T = 0;
			double rem = 0;
			
			double T15=0;
			double T205=0;
			double T26=0;
			double T29=0;
			double T33=0;
			
			if (num <=49020) {
				T15 = num * 0.15;
				rem = num-T15;
				
				if (rem >49020 && rem <=98040) {
					
				
				}
				
				else {
					
				}
				
				
			}
			
			
			T = T15 + T205+T26+T29+T33;
			System.out.println(T);
			
			in.close();
		
		} 
		
		else if (choice == 6) {
			System.out.println("You selected Sub-Programs");
			
			
		}
		
		else if (choice == 7) {
			System.out.println("You selected Variables");
		}

	}
}
