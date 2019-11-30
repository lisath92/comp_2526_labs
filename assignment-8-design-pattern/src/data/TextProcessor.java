package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextProcessor {
  
  /**
   * Default Constructor
   */
  public TextProcessor() {

  }

  /**
   * Get a list of the most frequently used word from a snippet of texts
   * @param String text
   * @return a List of Strings with highest used frequency
   */
  public String mostFrequentWord(String text) {
    HashMap<String, Integer> wordMap = histogramOfWords(text);
    String mostFrequentWord = (String) calculateFrquency(wordMap);
    return mostFrequentWord;
  }

  public char mostFrequentLetter(String text) {
    HashMap<Character, Integer> letterMap = histogramOfLetters(text);
    Character mostFrequentLetter = (Character) calculateFrquency(letterMap);
    return mostFrequentLetter.charValue();
  }

  /**
   * Build the number of occurrences of a letter
   * @param String text
   * @return HashMap of how often an English character occurs
   */
  public HashMap histogramOfLetters(String text) {
    String textArr[] = text.split("[^a-zA-Z]+"); // split out the punctuations
    String joinedText = String.join("", textArr);
    HashMap<Character, Integer> letterMap = new HashMap<Character, Integer>();
    
    for(int i = 0; i < joinedText.length(); i++) {
      Character letter = Character.toLowerCase(joinedText.charAt(i));
      Integer num = letterMap.getOrDefault(letter, 0);
      letterMap.put(letter, ++num);
    }
    return letterMap;
  }

  /**
   * Build the number of occurrences of a word
   * @param String text
   * @return HashMap of how often a word occurs
   */
  public HashMap histogramOfWords(String text) {
    HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
    List<String> arr = splitString(text);
    for(String s: arr){
      String word = s.toLowerCase();
      Integer num = wordMap.getOrDefault(word, 0);
      wordMap.put(word, ++num);
    }
    return wordMap;
  }

  /**
   * Helper method to split a string on words
   * @param String text
   * @return List of words without punctuations
   */
  private List splitString(String text) {
    String textArr[] = text.split("\\W+"); // pattern for splitting out non-word characters
    List<String> arr = new ArrayList<String>();
    arr = Arrays.asList(textArr);
    return arr;
  }

  /**
   * Private method to calculate highest frequency of a key in a map
   * @param map - histogram with any key and Integer
   * @return the key with the highest frequency
   */
  private Object calculateFrquency(Map<?,Integer> map) {
    Collection<Integer> values = map.values();
    Integer maxNum = Collections.max(values);

    for(Map.Entry<?, Integer> set : map.entrySet()) {
      if (set.getValue() == maxNum) {
        return set.getKey();
      }
    }
    return null;
  }

  /**
   * Displays any of the histograms
   * @param map
   */
  public String display(Map<?,Integer> map) {
	String finalString = "";
    for(Map.Entry<?, Integer> set: map.entrySet()) {
    	finalString = finalString + set.getKey() + ": " + set.getValue() + "\n";
    }
    return finalString;
  }
}