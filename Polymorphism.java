import java.util.Scanner;
abstract class Doctor{
        abstract void treatPatient();
}

    class Physician extends Doctor{
        @Override
        void treatPatient(){
            System.out.println("Hii! I am Physician \nI treat Patients using Medicines.");
        }
    }

    class Surgeon extends Doctor{
        @Override
        void treatPatient(){
            System.out.println("Hii! I am Surgeon \nI treat Patients using Surgeory");
        }
    }
    class Dentist extends Doctor{
        @Override
        void treatPatient(){
            System.out.println("Hii! I am Dentist \nI treat Patients Teeth");
        }
    }
    
public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("HI! I am Lucy! Receptionist at Max Care");
        System.out.println("Who you are looking for?");
        System.out.println("Press \n1. Physician\n2. Surgeon \n3. Dentist");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        Doctor doc = null;
        switch(choice){
            case 1:
                doc = new Physician();
            break;

            case 2:
                doc = new Surgeon();
            break;

            case 3: 
                doc = new Dentist();
            break;

            default:
                System.out.println("A Oh! Invalid Choice");
            break;
        }
        if(choice<0 || choice>3){
            System.exit(0);
        }
        else{
            doc.treatPatient();
        }
        sc.close();
    }
}
