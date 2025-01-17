import java.time.LocalDate;
import java.time.Period;

public class Jewel_55 {

    public string name;
    public LocalDate birthDay;

    public int age() {
        int age = Period.between(this.birthDay, LocalDate.now());

        return age.getYears();
    }

   
}

    

