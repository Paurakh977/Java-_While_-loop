import java.util.Scanner;

public class car_game {
    public static void main(String[] args) {
        String input="";
        Scanner obj=new Scanner(System.in);
        System.out.println("***********************Program Starter***********************");
        System.out.println("--->");
        input= obj.next();
        int i=1;
        while (true){
            if (i%3==0){
                System.out.println("1) Start to Start ");
                System.out.println(("2)Stop To stop"));
                System.out.println("3) quit to Quit");
                input= obj.next();
                i++;
            }
            if (input.equalsIgnoreCase("hint")){
                System.out.println("1) Start to Start ");
                System.out.println(("2)Stop To stop"));
                System.out.println("3) quit to Quit");
                input= obj.next();

            }else if (input.equalsIgnoreCase("quit")) {
                break;
            }
            else if (input.equalsIgnoreCase("start")){
                System.out.println("Car Started");
                System.out.println("-->");
                input= obj.next();
            }
            else if (input.equalsIgnoreCase("stop")){
                System.out.println("car stopped");
                System.out.println("-->");
                input= obj.next();
            }
            else {
                System.out.println("-->");
                input= obj.next();
                i++;
            }
        }
    }
}
