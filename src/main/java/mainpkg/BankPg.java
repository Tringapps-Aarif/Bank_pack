package mainpkg;
import java.util.Scanner;
import caseswitch.*;
import method.Methods;
import java.util.logging.Logger;
public class BankPg {
    public static int n;
    public static void main(String[] args) {

        final Logger print = Logger.getLogger("Bankpg");
        final Scanner sc = new Scanner(System.in);
        print.info("Enter the no of customer");
        n = sc.nextInt();
        Methods call = new Methods();
        call.getName();
        caseSwitch calling = new caseSwitch();
        calling.case1();
    }
}