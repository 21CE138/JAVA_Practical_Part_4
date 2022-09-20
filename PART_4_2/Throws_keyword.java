package PART_4_2;

public class Throws_keyword {
    static void drive(int age) throws YoungerAgeException {
        if ( age <18){
            throw new YoungerAgeException("You are not eligible to drive car");
        }
        else{
            System.out.println("You can Drive");
        }
        System.out.println("Throws Keyword used");
    }
}
