import java.util.*;

public class SortHashMapByValue {

    public HashMap<String, Integer> sortByValue(HashMap txt){

        // Create a list from elements of HashMap
        List<HashMap.Entry<String, Integer> > list =
                new LinkedList<HashMap.Entry<String, Integer> >(txt.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<HashMap.Entry<String, Integer> >() {
            public int compare(HashMap.Entry<String, Integer> value1,
                               HashMap.Entry<String, Integer> value2)
            {
                return (value2.getValue()).compareTo(value1.getValue());
            }
        });

        // put data from sorted list to new HashMap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (HashMap.Entry<String, Integer> element : list) {
            temp.put(element.getKey(), element.getValue());
        }
        return temp;
    }

}
