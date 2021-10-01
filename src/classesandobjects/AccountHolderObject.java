package classesandobjects;

public class AccountHolderObject {
	
	public static void main(String[] args) {
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		tom.firstName="Tom";
		tom.lastName="Smith";
		tom.age=21;
		tom.accountBalance=10000;
		tom.testEligiblityForCreditCard();
		System.out.println("Is Tom Eligible for CC:"+tom.eligibleForCreditCard);
		

		henry.firstName="Henry";
		henry.lastName="Hill";
		henry.age=31;
		henry.accountBalance=20000;
		henry.testEligiblityForCreditCard();
		System.out.println("Is Henry Eligible for CC:"+henry.eligibleForCreditCard);
		
	}
}
