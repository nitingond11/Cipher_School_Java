import java.util.*;

public class ConditionLoops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Speed : ");
        int speed = sc.nextInt();

        System.out.println("Today is your birthday :");
        boolean isbirthday = sc.nextBoolean();

        if(isbirthday==true){
            speed-=5;
        }
        if(speed>80){
            System.out.println("High ticket");
        }else if(speed>=60){
            System.out.println("Mid ticket");
        }else
            System.out.println("No ticket");
        sc.close();
    }
}
