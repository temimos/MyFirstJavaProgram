public class Main {

    public static void main(String[] args) {
        int x, y, answer;
        double temperature;
        float Temperature;
        String firstName, lastName;
        String question = "unknown";
        x=99;
        y=2147483647;
        answer=42;
        firstName="Temi";
        lastName="Moses";
        // String question = "unknown"; //question is initialized
        temperature=98.6;
        Temperature = 32.0f;

        System.out.println( "The variable x contains a value of " + x );
        System.out.print( "The value " + y + " is the largest value ");
        System.out.println( "you can store in an integer." );
        System.out.println("The anwser to the question is: " + answer );
        System.out.println("And the question has long since been " + question);
        System.out.println("If you're not sick your temperature is "+ temperature);
        System.out.println("If you're an ice cube your temperature is "+ Temperature);
        System.out.println("The variable Temperature is not "+ "the same as  temperature");
        System.out.println("The founder of Java is " + firstName + ' ' + lastName );

    }

}
