import java.time.LocalDate;

public class Patient {

    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private boolean health;


    public Patient(String name, String surname, LocalDate dateOfBirth, boolean health) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.health = health;
    }

    public Patient(String name, String surname, String dateOfBirth, String health) {
        this(name, surname, LocalDate.parse(dateOfBirth), Boolean.valueOf(health));
    }

    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isHealth() {
        return health;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Patient { "+ "name "
                +name +"; surname "+
                surname + "; date of birth "+
                dateOfBirth + "; health"+
                health + " }";
    }
}
