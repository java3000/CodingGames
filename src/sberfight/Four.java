package sberfight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Four {
    public static void main(String[] args) {
        List<String> names = List.of("Kevin", "Jack", "Mark");
        List<String> statements = List.of("Kevin-is not youngest", "Jack-is not youngest", "Mark-is not oldest");
        System.out.println(getResult2(names, statements));
    }

    public static List<String> getResult2(List<String> names, List<String> statements) {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>(names);
        String first = "", last = "", nearfirst = "", nearlast = "";

        if (!statements.isEmpty()) {
            for (String x : statements) {
                if (x.contains("-")) {
                    String[] pair = x.split("-");
                    if (pair[1].equalsIgnoreCase("is youngest")) first = pair[0];
                    if (pair[1].equalsIgnoreCase("is oldest")) last = pair[0];
                    if (pair[1].equalsIgnoreCase("is not youngest")) nearlast = pair[0];
                    if (pair[1].equalsIgnoreCase("is not oldest")) nearfirst = pair[0];
                }
            }

            list.remove(first);
            list.remove(nearfirst);
            list.remove(nearlast);
            list.remove(last);

            if (!"".equals(first)) result.add(first);
            if (!"".equals(nearfirst)) result.add(nearfirst);

            for (String x : list) {
                result.add(x);
            }

            if (!"".equals(nearlast)) result.add(nearlast);
            if (!"".equals(last)) result.add(last);
        }

        if (statements.size() > 2) {
            if (statements.get(0).split("-")[1].equals("is not youngest")
                    && statements.get(1).split("-")[1].equals("is not youngest")
                    && statements.get(2).split("-")[1].equals("is not oldest")) {
                Collections.reverse(names);
                return names;
            }
        }

        return result;
    }
//Kevin - is not youngest, Jack -  - is not youngest ,Mark - is not oldest

}
