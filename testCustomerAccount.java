package Day2;

public class testCustomerAccount {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setcId(101);
		c1.setName("abc");
		Account account = c1.getAccount();
		account.setAnumber(123455);
		account.setBalance(78500);
		System.out.println(c1.getcId()+ " "+c1.getName()+" "+c1.getAccount().getAnumber()+" "+c1.getAccount().getBalance());
	}
}
