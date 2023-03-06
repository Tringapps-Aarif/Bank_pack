package method;


import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import details.*;

public class Methods extends DetailsBank {
    Logger l =Logger.getLogger("method");
    Scanner sc1 = new Scanner(System.in);



    String name = sc1.nextLine();
    int  accno = sc1.nextInt();

    public Methods(int accno, String name) {
        super(accno, name);
    }


    public  void getData() {
        l.log(Level.INFO, () ->"name"+name);

        l.log(Level.INFO, () ->"ACCOUNT NUMBER:" + accno);
        l.log(Level.INFO, () ->"CURRENT BALANCE:" + currentBalance);
    }

    public void deposit() {

        l.info("Enter the Amount");
        depAmt = sc1.nextInt();
        currentBalance = currentBalance + depAmt;
        getData();

    }

    public void widthDrawal() {
        l.info("Enter the you need to widthdraw");
        wAmt = sc1.nextInt();
        currentBalance = currentBalance - wAmt;
        getData();
    }
}