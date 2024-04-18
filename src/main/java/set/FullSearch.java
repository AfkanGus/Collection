package set;

import java.util.HashSet;
import java.util.List;
/*
1. Уникальные задачи. [#212653 #58990]
 */
public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> set = new HashSet<>();
        for (Task task : list) {
            set.add(task.getNumber());
        }
        return set;
    }
}
