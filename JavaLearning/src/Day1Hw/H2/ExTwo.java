package Day1Hw.H2;

public class ExTwo {
    public static void main(String[] args){
        if (args.length == 0) {
            System.out.println("Please provide a name as a command line argument.");
        } else {
            System.out.println("Welcome " + args[0]);
        }
    }
}
