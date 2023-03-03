package details;

import java.util.*;

public class DetailsBank {
    public int accno;
    public int bal;
    public int currentBalance = 0;
    public int depAmt;
    public int wAmt;
    public String name;
    Scanner sc = new Scanner(System.in);

    public DetailsBank(int accno, String name) {
        this.accno = accno;
        this.name = name;
    }

}
