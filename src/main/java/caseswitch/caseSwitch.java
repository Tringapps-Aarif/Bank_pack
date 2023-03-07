package caseswitch;


import method.Methods;

import java.util.Scanner;
import java.util.logging.Logger;

public class caseSwitch {
    Logger l = Logger.getLogger("caseSwitch");
    Scanner sc = new Scanner(System.in);
    Methods obj = new Methods();
   private int choice;
   public  void case1()

    {
        while (choice != 3) {
            l.info("Enter your choice \n1.DEPOSIT \n2.WITHDRAW \n3.EXIT");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj.deposit();
                    break;
                case 2:
                    obj.widthDrawal();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    l.info("invalid choice");
                    break;
            }
        }
    }
}
