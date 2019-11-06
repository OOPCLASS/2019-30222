package Tema;

import java.util.HashMap;
import java.util.Map;

public class Bank {
	 private Map<Integer, Account> accounts = new HashMap<Integer, Account>();

     public void openAccount(Account account, int position) {
    	 this.accounts.put(position, account);
     }
     
     public void closeAccount(Account account, int position) {
    	 this.accounts.remove(position);
     }
     
     public Account getAccount(int position) {
    	 return this.accounts.get(position);
     }
     
//	 * this.accounts[position] = account; } public void deleteAccount(Account
//	 * account, int position) { this.accounts[position] = NULL; } public Account
//	 * getAccount(int position) { return this.accounts[position]; }
//	 */
}
