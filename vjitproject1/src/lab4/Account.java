package lab4;
class MyException extends Exception
{
	private static final long serialVersionUID = 1L;
	public MyException(String s)
	{
		super(s);
	}
}
class Person{
	String name;
	float age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		try {
			if(age<15)
				throw new MyException("cannot create account");
			else
				this.age = age;	
		}
		catch(MyException e){
			System.out.println(e.getMessage());
		}
	}
	
}
public abstract class Account extends Person {
	long accnum=9986;
	double balance;
	double minbala=500;
	Person acchl=new Person();

	public void deposite(double dep)
	{
		balance=dep+balance;
	}
    public abstract void withdraw(double draw);
     
    public double getbalance()
    {
    	return balance;
    }
	public long getAccnum() {
		return accnum;
	}
	public void setAccnum(long accnum) {
		this.accnum = accnum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAcchl() {
		return acchl;
	}
	public void setAcchl(Person acchl) {
		this.acchl = acchl;
	}
	 public static void main(String args[])
		{
			SavingAccount ac=new SavingAccount();
			SavingAccount ac1=new SavingAccount();
			ac.balance=2000;
			ac.accnum++;
			ac.setName("smith");
			ac1.balance=3000;
			ac1.accnum++;
			ac1.setName("kathy");
			ac.deposite(2000);
			ac1.withdraw(2000);
			double upbal=ac.getbalance();
			 System.out.println("updated balance of smith "+upbal);
			upbal=ac1.getbalance();
			System.out.println("updated balance of kathy "+upbal);
		}
	
	@Override
	public String toString() {
		return "Account [accnum=" + accnum + ", balance=" + balance + ", minbala=" + minbala + ", acchl=" + acchl + "]";
	}
}
class SavingAccount extends Account
{
   final double minimum_bal=500;
   public void withdraw(double draw)
   {
	   if(balance>minimum_bal)
	   {
		   if(draw<(balance-minimum_bal))
		   {
			   balance=balance-draw;
		   }
		   else
			  System.out.println("insufficient funds");
	   }
	   else
		  System.out.println("insufficient funds");
   }
  
}
class CurrentAccount extends Account
{
	double overdraft_limit=10000;
	public void withdraw(double draw)
	{
		if(draw<overdraft_limit)
		{
			if(balance>minbala)
			   {
				   if(draw<(balance-minbala))
				   {
					   balance=balance-draw;
				   }
				   else
					  System.out.println("insufficient funds");
			   }
			   else
				  System.out.println("insufficient funds");
		}
		else
			 System.out.println("cannot withdraw");
	}
}
