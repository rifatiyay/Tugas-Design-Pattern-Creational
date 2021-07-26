package DPSingleton;

public class Main {
	public static void main(String[] args){
        System.out.println("Try 1st instance : ");
        DataManager account = DataManager.getInstance("12345");
        System.out.println("Instance Value : " + account.getID());
        
        System.out.println("Try 2nd instance : ");
        DataManager anotherAccount = DataManager.getInstance("67890");
        System.out.println("Instance Value : " + anotherAccount.getID());
        
    }
}
