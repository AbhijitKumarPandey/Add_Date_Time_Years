import java.time.LocalDate;
import java.util.Scanner;

public class Date_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Started...");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year [yyyy]");
        int y = sc.nextInt();
        System.out.println("Enter year [MM]");
        int m = sc.nextInt();
        System.out.println("Enter year [DD]");
        int d = sc.nextInt();
        
        LocalDate d1 = LocalDate.of(y, m, d);
        System.out.println("Enter The Years you want to add");
        int addmonth = sc.nextInt();
//        adding Month
        LocalDate d2 = d1.plusYears(addmonth);
        System.out.println("New Date is " + d2.toString());
	}

}
