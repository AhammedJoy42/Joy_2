// String _ 4:
 public class Jewel_28 {
    public static void main(String args[]){
        String name = "Jewel Ahammed Joy";
        String country = "Bangladesh";
        String company = "FreeCodeCamp";
        int age = 22;
        double gpa = 3.8;

        String formattedString = String.format("My name is %s. I am from '%s'. I am an employee of %s. I am %d years old. My GPA is %f.", name, country, company, age, gpa);
        System.out.println(formattedString);

    }
    
}
