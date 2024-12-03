import java.util.Scanner;
public class ExpressingGratitude_03 {

    public static String getGReetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        //input.close();
        return recipientName;
    }

    public static void sayThankyou(){
        String name = getGReetingRecipient();
        System.out.println("thank you "+name+" for being the best teacher in the world.\n"+
                        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void sayAdditionalGreetings(){
        String name = getGReetingRecipient();
        System.out.println("hello "+name+" thank you for educating us with patience and inspiring us.\n"+
        "May i greet you?");
    }

    public static void main(String[] args) {
        sayThankyou();
        sayAdditionalGreetings();
    }
}
    