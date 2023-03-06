package details;

import java.util.*;

  public class DetailsBank {
     int accno;
   int bal;
   protected int currentBalance = 0;
  protected int depAmt;
protected int wAmt;
    String name;
    Scanner sc = new Scanner(System.in);

    public DetailsBank(int accno, String name) {
        this.accno = accno;
        this.name = name;
    }

}
