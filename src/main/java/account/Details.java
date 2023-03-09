package account;

 class Details {
        protected int accnum;
       protected  String nameUser;
     protected int currentBalance;
        Details(int accno,String name,int currentBalance)
        {
            accnum=accno;
            nameUser=name;
            this.currentBalance = currentBalance;
        }
 }
