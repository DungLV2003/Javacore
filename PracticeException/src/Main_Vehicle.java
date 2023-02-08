
public class Main_Vehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        try {
            v1.speedUp(101);
        } catch(InvalidSpeedException ex){
            System.out.println(ex.getMessage());
        }
        //v1.speedDown(2);
        System.out.println(v1.getSpeed());
    }// end main
}
