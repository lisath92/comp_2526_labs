public class Driver {
    public static void main(String args[]){
        TestProcessor obj = new TestProcessor();
        String text = "As they rounded a bend in the path that ran beside the river, Lara recognized the silhouette of a fig tree atop a nearby hill. The weather was hot and the days were long. The fig tree was in full leaf, but not yet bearing fruit. Soon Lara spotted other landmarks—an outcropping of limestone beside the path that had a silhouette like a man’s face, a marshy spot beside the river where the waterfowl were easily startled, a tall tree that looked like a man with his arms upraised. They were drawing near to the place where there was an island in the river. The island was a good spot to make camp. They would sleep on the island tonight.";

        System.out.println("Histogram Of Letters: " + obj.histogramOfLetters(text));
        System.out.println("Histogram Of Words: " + obj.histogramOfWords(text));
        System.out.println("The most frequent word is: " + obj.mostFrequentWord(text));
        System.out.println("The most frequent letter is: " + obj.mostFrequentLetter(text));
    }
}
