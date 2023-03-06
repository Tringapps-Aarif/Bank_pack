package org.example;
import java.util.*;
import java.util.logging.Logger;

import method.*;

class BankPg {
    public static void main(String[] args) {
        Logger l =Logger.getLogger("Bankpg");
        int accno;
        int ch = 0;
        String name;
        Scanner sc = new Scanner(System.in);
        l.info("Enter the Name and Account Number");



        Methods M = new Methods();

        while (ch != 3) {

            l.info("Enter your choice \n1.DEPOSIT \n2.WITHDRAW \n3.EXIT");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    M.deposit();
                    break;
                case 2:
                    M.widthDrawal();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    l.info("invalid choice");
                    break;
            }
        }
        sc.close();

    }
}