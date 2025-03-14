package unifal.poo;

/**
 * This is Lab 2 and this is <b>MyFirstMavenProject</b>.**/
public class App 
{
    public static void main( String[] args )
    {
        if(args.length > 0){
            System.out.println(args.length + " arguments provided:");
            for (String arg : args) {
                System.out.println(arg);
            }
        }else{
            System.out.println("No arguments provided!");
        }
    }
}