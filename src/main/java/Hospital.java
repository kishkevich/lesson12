import java.util.HashSet;
import java.util.Set;

public class Hospital {

    private Set<Patient> patientList = new HashSet<>();

    public Set<Patient> getPatientList() {
        return patientList;
    }

    public void add(Patient patient) {
        this.patientList.remove(patient);
        this.patientList.add(patient);
        return ;
    }

    public void addAll(Set<Patient> patients) {
        this.patientList.removeAll(patients);
        this.patientList.addAll(patients);
    }

    @Override
    public String toString() {
        return "Hospital {" +
                "patients=" + patientList +
                '}';
    }
}
