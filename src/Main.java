import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the customer id : ");
        String id=sc.nextLine();

        System.out.print("Enter the customer name : ");
        String name=sc.nextLine();

        System.out.print("Enter the customer address : ");
        String address=sc.nextLine();

        System.out.print("Enter the customer meterNo. : ");
        String cusmeterno=sc.nextLine();

        Customer customer=new Customer(id,name,address,cusmeterno);

        System.out.print("Enter unit consume : ");
        int unitconsume=sc.nextInt();

        System.out.print("Enter Rate per unit : ");
        int rateperunit=sc.nextInt();

        Bill bill=new Bill(customer,unitconsume,rateperunit);

        bill.printBill();




    }
}
