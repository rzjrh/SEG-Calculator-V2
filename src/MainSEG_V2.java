/*
 * SEG Calculator 
 * Client: The Trade Group Inc
 * wirted by: Reza Akhlaqi
 * last update: 3-3-2020
 */

import java.util.Scanner;

public class MainSEG_V2 {

public static void calcW (double a, int fab) {
		
		switch (fab) {
		
		
		case 1:
			if (a< 8.0) {
				System.out.println("Fabric width is Too SHORT!!!!");
				a=a+0.25;
			}
				
			if (a>=8 && a<= 50.0) {
				a=a+0.25;
			}
			if (a>=50.01 && a<=64.0) {
				a= a+0.15;
			}
			if (a>=64.01 && a<=75.0) {
				a= a-0.1;
			}
			if (a>=75.01 && a<=88.0) {
				a= a-0.15;
			}
			if (a>=88.01 && a<=125.0) {
				a= a-0.22;
			}
			if (a>=125.01 && a<=170.0) {
				a= a-0.32;
			}
			if (a>=170.01 && a<=220.0) {
				a= a-0.45;
			}
			if (a>=220.01 && a<=290.0) {
				a= a-0.55;
			}
			if (a>=290.01 && a<=350.0) {
				a= a-0.7;
			}
			if (a>=350.01 && a<=390.0) {
				a= a-0.9;
			}
			if (a>=390.01 && a<=430.0) {
				a= a-1.15;
			}
			if (a>=430.01 && a<=470.0) {
				a= a-1.45;
			}
			if (a>=470.01 && a<=500.0) {
				a= a-1.8;
			}
			if (a>=500.01) {
				System.out.println("WARNING!\nThe Number is too high, call Reza or your supervisor!!");
				a=0.000;
			}
			System.out.println("\nThe width cut is: \t" +a);
			break;
			
		case 2:
			if (a< 8.0) {
				System.out.println("Fabric width is Too SHORT!!!!");
				a=a+0.25;
			}
				
			if (a>=8 && a<= 50.0) {
				a=a+0.2;
			}
			if (a>=50.01 && a<=64.0) {
				a= a+0.1;
			}
			if (a>=64.01 && a<=75.0) {
				a= a-0.1;
			}
			if (a>=75.01 && a<=88.0) {
				a= a-0.18;
			}
			if (a>=88.01 && a<=125.0) {
				a= a-0.3;
			}
			if (a>=125.01 && a<=170.0) {
				a= a-0.45;
			}
			if (a>=170.01 && a<=220.0) {
				a= a-0.65;
			}
			if (a>=220.01 && a<=290.0) {
				a= a-0.8;
			}
			if (a>=290.01 && a<=350.0) {
				a= a-1.0;
			}
			if (a>=350.01 && a<=390.0) {
				a= a-1.3;
			}
			if (a>=390.01 && a<=430.0) {
				a= a-1.65;
			}
			if (a>=430.01 && a<=470.0) {
				a= a-1.95;
			}
			if (a>=470.01 && a<=500.0) {
				a= a-2.15;
			}
			if (a>=500.01) {
				System.out.println("WARNING!\nThe Number is too high, call Reza or your supervisor!!");
				a=0.000;
			}
			System.out.println("\nThe width cut is: \t" +a);
			break;
			
		case 3:
			if (a< 8.0) {
				System.out.println("Fabric width is Too SHORT!!!!");
				a=a+0.25;
			}
				
			if (a>=8 && a<= 500.0) {
				a=a+0.25;
			}
			
			if (a>=500.01) {
				System.out.println("WARNING!\nThe Number is too high, call Reza or your supervisor!!");
				a=0.000;
			}
			System.out.println("\nThe width cut is: \t" +a);
			break;
			
		case 4:
			if (a< 8.0) {
				System.out.println("Fabric width is Too SHORT!!!!");
				a=a+0.25;
			}
				
			if (a>=8 && a<= 50.0) {
				a=a+0.25;
			}
			if (a>=50.01 && a<=64.0) {
				a= a+0.2;
			}
			if (a>=64.01 && a<=75.0) {
				a= a+0.1;
			}
			if (a>=75.01 && a<=88.0) {
				a= a-0.05;
			}
			if (a>=88.01 && a<=125.0) {
				a= a-0.12;
			}
			if (a>=125.01 && a<=170.0) {
				a= a-0.2;
			}
			if (a>=170.01 && a<=220.0) {
				a= a-0.3;
			}
			if (a>=220.01 && a<=290.0) {
				a= a-0.4;
			}
			if (a>=290.01 && a<=350.0) {
				a= a-0.55;
			}
			if (a>=350.01 && a<=390.0) {
				a= a-0.65;
			}
			if (a>=390.01 && a<=430.0) {
				a= a-0.8;
			}
			if (a>=430.01 && a<=470.0) {
				a= a-0.95;
			}
			if (a>=470.01 && a<=500.0) {
				a= a-1.15;
			}
			if (a>=500.01) {
				System.out.println("WARNING!\nThe Number is too high, call Reza or your supervisor!!");
				a=0.000;
			}
			System.out.println("\nThe width cut is: \t" +a);
			break;
			
		default:
			System.out.println("if this is the new fabric, choose the one is most closest or talk to your supervisor");

			
		break;
		}

	}


public static void calcH (double a, int fab) {
	
	switch (fab) {
	
	
	case 1:
		if (a< 8.0) {
			System.out.println("Fabric height is Too SHORT!!!!");
			a=a+0.25;
		}
			
		if (a>=8 && a<= 50.0) {
			a=a+0.25;
		}
		if (a>=50.01 && a<=64.0) {
			a= a+0.15;
		}
		if (a>=64.01 && a<=75.0) {
			a= a+0.05;
		}
		if (a>=75.01 && a<=90.0) {
			a= a-0.1;
		}
		if (a>=90.01 && a<=125.0) {
			a= a-0.21;
		}
		if (a>=125.01 && a<=170.0) {
			a= a-0.32;
		}
		if (a>=170.01 && a<=220.0) {
			a= a-0.45;
		}
		if (a>=220.01 && a<=290.0) {
			a= a-0.55;
		}
		if (a>=290.01 && a<=350.0) {
			a= a-0.7;
		}
		if (a>=350.01 && a<=390.0) {
			a= a-0.9;
		}
		if (a>=390.01 && a<=430.0) {
			a= a-1.15;
		}
		if (a>=430.01 && a<=470.0) {
			a= a-1.45;
		}
		if (a>=470.01 && a<=500.0) {
			a= a-1.8;
		}
		if (a>=500.01) {
			System.out.println("WARNING!\nThe Number is too high, call Reza or your supervisor!!");
			a=0.000;
		}
		System.out.println("\nThe height cut is: \t" +a);
		break;
		
	case 2:
		if (a< 8.0) {
			System.out.println("Fabric height is Too SHORT!!!!");
			a=a+0.25;
		}
			
		if (a>=8 && a<= 50.0) {
			a=a+0.2;
		}
		if (a>=50.01 && a<=64.0) {
			a= a+0.1;
		}
		if (a>=64.01 && a<=75.0) {
			a= a-0.05;
		}
		if (a>=75.01 && a<=90.0) {
			a= a-0.17;
		}
		if (a>=90.01 && a<=125.0) {
			a= a-0.3;
		}
		if (a>=125.01 && a<=170.0) {
			a= a-0.45;
		}
		if (a>=170.01 && a<=220.0) {
			a= a-0.65;
		}
		if (a>=220.01 && a<=290.0) {
			a= a-0.8;
		}
		if (a>=290.01 && a<=350.0) {
			a= a-1.0;
		}
		if (a>=350.01 && a<=390.0) {
			a= a-1.3;
		}
		if (a>=390.01 && a<=430.0) {
			a= a-1.65;
		}
		if (a>=430.01 && a<=470.0) {
			a= a-1.95;
		}
		if (a>=470.01 && a<=500.0) {
			a= a-2.15;
		}
		if (a>=500.01) {
			System.out.println("WARNING!\nThe Number is too high, call Reza or your supervisor!!");
			a=0.000;
		}
		System.out.println("\nThe height cut is: \t" +a);
		break;
		
	case 3:
		if (a< 8.0) {
			System.out.println("Fabric height is Too SHORT!!!!");
			a=a+0.25;
		}
			
		if (a>=8 && a<= 500.0) {
			a=a+0.25;
		}
		
		if (a>=500.01) {
			System.out.println("WARNING!\nThe Number is too high, call Reza or your supervisor!!");
			a=0.000;
		}
		System.out.println("\nThe height cut is: \t" +a);
		break;
		
	case 4:
		if (a< 8.0) {
			System.out.println("Fabric height is Too SHORT!!!!");
			a=a+0.25;
		}
			
		if (a>=8 && a<= 50.0) {
			a=a+0.25;
		}
		if (a>=50.01 && a<=64.0) {
			a= a+0.2;
		}
		if (a>=64.01 && a<=75.0) {
			a= a+0.1;
		}
		if (a>=75.01 && a<=88.0) {
			a= a-0.05;
		}
		if (a>=88.01 && a<=125.0) {
			a= a-0.12;
		}
		if (a>=125.01 && a<=170.0) {
			a= a-0.2;
		}
		if (a>=170.01 && a<=220.0) {
			a= a-0.3;
		}
		if (a>=220.01 && a<=290.0) {
			a= a-0.4;
		}
		if (a>=290.01 && a<=350.0) {
			a= a-0.55;
		}
		if (a>=350.01 && a<=390.0) {
			a= a-0.65;
		}
		if (a>=390.01 && a<=430.0) {
			a= a-0.8;
		}
		if (a>=430.01 && a<=470.0) {
			a= a-0.95;
		}
		if (a>=470.01 && a<=500.0) {
			a= a-1.15;
		}
		if (a>=500.01) {
			System.out.println("WARNING!\nThe Number is too high, call Reza or your supervisor!!");
			a=0.000;
		}
		System.out.println("\nThe height cut is: \t" +a);
		break;
		
	default:
		System.out.println("if this is the new fabric, choose the one is most closest or talk to your supervisor");

		
	break;
	}

}

	public static void fabPrint(int code) {
		if (code ==1) {
			System.out.println("\n\nFabric: \t\tBaklit Duralex Agfa");
		}
		if (code ==2) {
			System.out.println("\n\nFabric: \t\tVortex T340 heavy knit");
		}
		if (code ==3) {
			System.out.println("\n\nFabric: \t\tUltraTex Blouckout (Blocker)");
		}
		if (code ==4) {
			System.out.println("\n\nFabric: \t\tWhite Star Nirivana/ NightStar B.O.B");
		}
		else if (code != 1 && code !=2 && code !=3 && code !=4) {
			System.out.println("\n\nError, Fabric is not Exist in the list");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("\n\nWELCOME");
		System.out.println("This program is designed to calculate the SEG frames cut file\nCurrently it is only for Backlit fabrics");
		System.out.println("Reza Akhlaqi March 2020- SEG cut calculator v 1.0.1.4");
		System.out.println("Note: This program is not designed for the Luna Frames");
		
		Scanner sc = new Scanner (System.in);
		
		
		
		System.out.println("\nPlease enter the frame width:");
		double width = sc.nextDouble();
		
		System.out.println("\nPlease enter the frame height:");
		double height = sc.nextDouble();
		
		System.out.println("\nPlease enter the fabric code: \n1= \tBacklit Agfa"
				+ "\n2= \tT340 (Heavy Knit)"
				+"\n3= \tUltraTex Blouckout (Blocker)"
				+"\n4= \tWhite Star Nirivana");
		int fab = sc.nextInt();
		
		
		fabPrint(fab);
		calcW(width, fab);
		calcH(height, fab);

		sc.close();
	}

}
