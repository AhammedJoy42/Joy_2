// String _ 2:

public class Jewel_26 {
    public static void main(String args[]){
        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");

        System.out.println(literalString1 == literalString2);
        System.out.println(objectString1 == objectString2);

        System.out.println(objectString1.equals(objectString2));
        System.out.println(objectString1.equalsIgnoreCase(objectString2));
    }
    
}
