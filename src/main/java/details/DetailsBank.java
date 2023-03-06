package details;

import java.util.*;

public class DetailsBank {
     int accno;
     int bal;
     int currentBalance = 0;
     int depAmt;
     int wAmt;
     String name;
    Scanner sc = new Scanner(System.in);

    public DetailsBank(int accno, String name) {
        this.accno = accno;
        this.name = name;
    }

}
