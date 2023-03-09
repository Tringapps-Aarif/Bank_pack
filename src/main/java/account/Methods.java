package account;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Methods {
    private final Logger print = Logger.getLogger("account");
    private final Scanner sc1 = new Scanner(System.in);
    private final Scanner sc2 = new Scanner(System.in);

    protected int accno;
    protected String name;
    private int i;
    static ArrayList<Details> ist = new ArrayList<>();
    public void getName(int n) {
        int balance = 0;
        for (i = 0; i <n; i++) {
            print.info("Enter the name : ");
            name = sc1.nextLine();
            print.info("Enter the account number ; ");
            accno = sc2.nextInt();
            Details oo = new Details(accno, name, balance);
            ist.add(oo);

        }
    }
    public void deposit() {
        int depositAmt;
        print.info("Enter the Account Number : ");
        int num = sc1.nextInt();
        for (i = 0; i < ist.size(); i++) {
            if (ist.get(i).accnum == num) {
                print.info("Enter the Amount");
                depositAmt = sc1.nextInt();
                ist.get(i).currentBalance += depositAmt;
                print.info("Amount successfully deposited");
                print.log(Level.INFO, () -> ("Name : "+ist.get(i).nameUser));
                print.log(Level.INFO, () -> ("Account number : "+ist.get(i).accnum));
                print.log(Level.INFO, () -> ("Balance : "+ist.get(i).currentBalance));
                break;
            } else {
                print.info("Enter the Valid Account number");
                deposit();
            }
        }
    }

    public void widthDrawal() {
        try {
            int withdrawAmt;
            print.info("Enter the Account Number : ");
            int num = sc1.nextInt();
            for (i = 0; i < ist.size(); i++) {
                if (ist.get(i).accnum == num) {
                    print.info("Enter the Amount");
                    withdrawAmt = sc1.nextInt();
                    if (withdrawAmt > ist.get(i).currentBalance) {
                        throw new Insufficientbalance();
                    }
                    else{
                        ist.get(i).currentBalance -= withdrawAmt;
                        print.info("Amount successfully withdraw");
                        print.log(Level.INFO, () -> ("Name : "+ist.get(i).nameUser));
                        print.log(Level.INFO, () -> ("Account number : "+ist.get(i).accnum));
                        print.log(Level.INFO, () -> ("Balance : "+ist.get(i).currentBalance));

                }
                }
            }
        }
        catch(Exception e){
            print.info("Withdraw amount should be less than or equal to current balance");

        }
    }

}