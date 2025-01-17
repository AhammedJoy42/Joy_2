import java.time.LocalDate;

class Jewel_54 {
    public static void main(String args[]){
        User youngerUser = new User();

        youngerUser.name = "Farhan Hasin Junior";
        youngerUser.birthDay = LocalDate.parse("1995-01-31");
         
        System.out.println("%s was born back in%s", youngerUser.name, youngerUser.birthDay.toString());
    }
}

