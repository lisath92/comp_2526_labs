package driver;

import data.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextProcessorDriver {
  public static void main(String[] args) {
    String test = "As they rounded a bend in the path that ran beside the river, Lara recognized the silhouette of a fig tree atop a nearby hill. The weather was hot and the days were long. The fig tree was in full leaf, but not yet bearing fruit. Soon Lara spotted other landmarks—an outcropping of limestone beside the path that had a silhouette like a man’s face, a marshy spot beside the river where the waterfowl were easily startled, a tall tree that looked like a man with his arms upraised. They were drawing near to the place where there was an island in the river. The island was a good spot to make camp. They would sleep on the island tonight";
    TextProcessor processor = new TextProcessor();
    HashMap letterMap = processor.histogramOfLetters(test);
    HashMap wordMap = processor.histogramOfWords(test);
    System.out.println("***** LetterHistogram *****");
    String finalString = processor.display(letterMap);
    System.out.println(finalString);
    System.out.println("\n***** WordHistogram *****");
    System.out.println(processor.display(wordMap));

    String word = processor.mostFrequentWord(test);
    char letter = processor.mostFrequentLetter(test);
    System.out.println("Most frequent letter: " + letter);
    System.out.println("Most frequent word: " + word);
  }

}
