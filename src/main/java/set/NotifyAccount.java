package set;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accountList) {
        HashSet<Account> result = new HashSet<>();
        for (Account a : accountList) {
            if (accountList.contains(a)) {
                result.add(a);
            }
        }

        return result;

    }

}
