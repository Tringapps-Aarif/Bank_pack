package method;

import mainpkg.BankPg;

import java.util.ArrayList;

import java.util.Scanner;

import java.util.logging.Logger;

public class Methods {
  private  final Logger print = Logger.getLogger("method");
    private  final Scanner sc1 = new Scanner(System.in);
    private  final Scanner sc2 = new Scanner(System.in);
    protected   int depAmt;
    protected  int wAmt;
    protected int Balance = 0;
    protected int accno;
    protected String name;
    private  int i;
    static ArrayList<Details> ist = new ArrayList<>();

    public void getName() {
        print.info(String.valueOf(BankPg.n));
        for (i = 0; i < BankPg.n; i++) {
            print.info("Enter the name : ");
             name = sc1.nextLine();
            print.info("Enter the account number ; ");
             accno = sc2.nextInt();
             Balance = 0;
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
