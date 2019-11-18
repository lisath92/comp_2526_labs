import java.util.*;

public class TestProcessor {
    HashMap<String, Integer> text = new HashMap<>();
    public HashMap histogramOfLetters(String st){
        st = st.toLowerCase();
        for(int i=0; i<= st.length()-1; i++) {
            int cnt=0;
            for (int j = 0; j <= st.length()-1; j++) {
                if(st.charAt(i)==st.charAt(j))
                    cnt++;
            }
            if(st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
                String c = String.valueOf(st.charAt(i));
                text.put(c, cnt);
            }
        }
        return text;
    }

    public HashMap histogramOfWords(String st){
        st = st.toLowerCase();
        String txt = null;
        text.clear();
        for(int i=0; i<st.length(); i++) {
            if ((st.charAt(i) >= 'a' && st.charAt(i) <= 'z') || st.charAt(i) == ' ') {
                txt = txt + st.charAt(i);
            }
        }
        String[] stArr = txt.split(" ");

        for (int i = 0; i < stArr.length; i++) {
            int cnt=0;
            for (int j = 0; j < stArr.length; j++) {
                if(stArr[i].equals(stArr[j]) == true)
                    cnt++;
            }
            text.put(stArr[i], cnt);
        }
        return text;
    }

    public String mostFrequentWord (String st){
        SortHashMapByValue text = new SortHashMapByValue();
        HashMap map = text.sortByValue(histogramOfWords(st));
        String key = (String) map.keySet().stream().findFirst().get();
        return key;
    }

    public String mostFrequentLetter (String st){
        SortHashMapByValue text = new SortHashMapByValue();
        HashMap map = text.sortByValue(histogramOfLetters(st));
        String key = (String) map.keySet().stream().findFirst().get();
        return key;
    }

}
