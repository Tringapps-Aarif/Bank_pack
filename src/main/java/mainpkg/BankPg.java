package mainpkg;
import java.util.Scanner;
import caseswitch.*;
import account.Methods;
import java.util.logging.Logger;
public class BankPg {
    public static void main(String[] args) {

        final Logger print = Logger.getLogger("Banking");
        final Scanner sc = new Scanner(System.in);
        print.info("Enter the no of customer");
        int n = sc.nextInt();
        Methods call = new Methods();
        call.getName(n);
        Caseswitch calling = new Caseswitch();
        calling.case1();
    }
}