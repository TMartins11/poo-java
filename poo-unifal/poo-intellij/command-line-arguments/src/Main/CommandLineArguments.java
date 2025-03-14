package Main;

public class CommandLineArguments {
    public static void main(String[] args){
        if(args.length > 0){
            System.out.println(args.length + " " + "arguments provided: ");
            for (String s: args) {
                System.out.println(s);
            }
        }else{
            System.out.println("No Arguments provided!");
        }
    }
}