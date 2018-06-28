
import java.util.Scanner;

public class Secretary {
    private Hospital hospital;
    Scanner scanner = new Scanner (System.in);


    public Patient addPatient(){
        //   hospital.add(new Patient("Paul","Mccartney","1958-06-08","true"));
        //  hospital.add(new Patient("Michael","Jackson","1958-08-29","false"));
        // hospital.add(new Patient("Paul","Mccartney","1958-06-08","true"));
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        String dateOfBirth = scanner.nextLine();
        String health = scanner.nextLine();
        return new Patient(name,surname,dateOfBirth,health);
    }




}
