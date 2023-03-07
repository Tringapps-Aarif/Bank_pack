package method;

import mainpkg.BankPg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Methods {
    Logger print = Logger.getLogger("method");
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    public int accno;
    public String name;
    public int currentBalance = 0;
    public int depAmt;
    public int wAmt;

    public int i;
    static ArrayList<Details> ist = new ArrayList<>();

    public void getName() {
        print.info(String.valueOf(BankPg.n));
        for (i = 0; i < BankPg.n; i++) {
            print.info("Enter the name : ");
            String name = sc1.nextLine();
            print.info("Enter the account number ; ");
            int accno = sc2.nextInt();
            int Balance = 0;
            Details oo = new Details(accno, name, Balance);
            ist.add(oo);

        }
    }

    public void deposit() {

        print.info("Enter the Account Number : ");
        int num = sc1.nextInt();
        for(i = 0; i < ist.size(); i++) {
            if(ist.get(i).AccNo == num) {
                print.info("Enter the Amount");
                depAmt = sc1.nextInt();
                ist.get(i).currentBalance += depAmt;
                System.out.println( ist.get(i).currentBalance);
            }
        }
    }

    public void widthDrawal() {
        print.info("Enter the Account Number : ");
        int num = sc1.nextInt();
        for(i = 0; i < ist.size(); i++) {
            if(ist.get(i).AccNo == num) {
                print.info("Enter the Amount");
                wAmt = sc1.nextInt();
                ist.get(i).currentBalance -= wAmt;
                System.out.println( ist.get(i).currentBalance);
            }
        }
    }
}
