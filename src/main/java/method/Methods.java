package method;


import java.util.*;
import java.util.logging.Logger;

import details.*;

public class Methods extends DetailsBank {
    Logger l =Logger.getLogger("method");
    Scanner sc = new Scanner(System.in);



    String name = sc.nextLine();
    int  accno = sc.nextInt();

    public Methods(int accno, String name) {
        super(accno, name);
    }


    public  void getData() {
        l.info("NAME:" + name);
        l.info("ACCOUNT NUMBER:" + accno);
        l.info("CURRENT BALANCE:" + currentBalance);
    }

    public void deposit() {

        l.info("Enter the Amount");
        depAmt = sc.nextInt();
        currentBalance = currentBalance + depAmt;
        getData();

    }

    public void widthDrawal() {
        l.info("Enter the you need to widthdraw");
        wAmt = sc.nextInt();
        currentBalance = currentBalance - wAmt;
        getData();
    }
}