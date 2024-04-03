package Activity2;

import java.util.List;

public class Course {
    private List<Alumn> Alumn;

    public Course(List<Alumn> Alumn) {
        this.Alumn = Alumn;
    }
    public int countAlumn() {
        return Alumn.size();
    }
}