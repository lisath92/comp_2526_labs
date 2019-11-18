public class Driver {
    public static void main(String arg[]){
        Move person1 = new John();
        person1.display();
        person1.movePerformance();

        Move person2 = new Kevin();
        person2.display();
        person2.movePerformance();
    }
}
