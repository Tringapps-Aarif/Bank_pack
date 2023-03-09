package account;

 class Details {
        protected int AccNo;
       protected  String nameUser;
     protected int currentBalance;
        Details(int accno,String name,int currentBalance)
        {
            AccNo=accno;
            nameUser=name;
            this.currentBalance = currentBalance;
        }
 }
