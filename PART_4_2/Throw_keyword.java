package PART_4_2;

public class Throw_keyword {
    static void drive1(int age) {
        if ( age <18){
            throw new YoungerAgeException("You are not eligible to drive car");
        }
        else{
            System.out.println("You can Drive");
        }
        System.out.println("Throw Keyword used");
    }
}
