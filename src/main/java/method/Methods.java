package method;


import java.util.*;
import java.util.logging.Logger;

import details.*;

public class Methods {
    Logger l =Logger.getLogger("method");
    Scanner sc = new Scanner(System.in);



    String name = sc.nextLine();
    int  accno = sc.nextInt();
    DetailsBank a = new DetailsBank(accno,name);

    public void getData() {
        l.info("NAME:" + a.name);
        l.info("ACCOUNT NUMBER:" + a.accno);
        l.info("CURRENT BALANCE:" + a.currentBalance);
    }

    public void deposit() {

        l.info("Enter the Amount");
        a.depAmt = sc.nextInt();
        a.currentBalance = a.currentBalance + a.depAmt;
        getData();

    }

    public void widthDrawal() {
        l.info("Enter the you need to widthdraw");
        a.wAmt = sc.nextInt();
        a.currentBalance = a.currentBalance - a.wAmt;
        getData();
    }
}