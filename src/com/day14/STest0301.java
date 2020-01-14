package com.day14;

class Account{
    private String accountName;
    private double amount;

    public static synchronized int deposit(Account account,double money)
    {
        if(account==null)return 0;
        try{
            double balance=account.getAmount()+money;
            account.setAmount(balance);
        }catch(Exception e)
        {
            System.out.println("密码错误:"+e.getMessage());
            return 0;
        }
        return 1;
    }




    public static synchronized int withdraw(Account account,double money)
    {
        if(account==null)return 0;
        try{
            if(account.getAmount()>=money)
                account.setAmount(account.getAmount()-money);
            return 1;
        }catch(Exception e)
        {
            System.out.println("密码错误:"+e.getMessage());
            return 0;
        }
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}