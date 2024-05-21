package set;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accountList) {
        HashSet<Account> hashSet = new HashSet<>();
        for (Account a : accountList) {
            if (accountList.contains(a)) {
                hashSet.add(a);
            }
        }
        return hashSet;
    }
}
