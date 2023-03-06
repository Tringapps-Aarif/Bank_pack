package details;

import java.util.*;

  public class DetailsBank {
     int account;
   int bal;
   protected int currentBalance = 0;
  protected int depAmt;
protected int wAmt;
      String customerName;
    Scanner sc = new Scanner(System.in);

    public DetailsBank(int accno, String name) {
        account = accno;
        customerName = name;
    }

}
