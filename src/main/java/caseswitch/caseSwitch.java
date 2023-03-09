package caseswitch;


import account.Methods;

import java.util.Scanner;
import java.util.logging.Logger;

public class caseSwitch {
    private  final  Logger l = Logger.getLogger("caseSwitch");
    private  final  Scanner sc = new Scanner(System.in);
   final Methods obj = new Methods();
   private int choice;
   public  void case1()

    {
        while (choice != 3) {
            l.info("Enter your choice \n1.DEPOSIT \n2.WITHDRAW \n3.EXIT");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> obj.deposit();
                case 2 -> obj.widthDrawal();
                case 3 -> System.exit(0);
                default -> l.info("invalid choice");
            }
        }
    }
}
