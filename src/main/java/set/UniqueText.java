package set;

import java.util.HashSet;

/*
2. Идентичные тексты [#212655 #58988]
написать метод который сравнивает два текста, если они состоят из одних
и тех же слов, то они не уникальны.
 */
public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        HashSet<String> check = new HashSet<>();
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] duplicate = duplicateText.split(" ");
        for (String o : origin) {
            check.add(o);
        }
        for (String d : duplicate) {
           if (!check.contains(d)) {
                return false;
            }
        }
        return rsl;
    }
}
