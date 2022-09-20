package PART_4_2;
public class MAIN {
    public static void main(String[] args) {
        Throws_keyword t = new Throws_keyword();
        Throw_keyword t1 = new Throw_keyword();
        try{
            t.drive(14);
        }
        catch(YoungerAgeException e){
            System.out.println("Throws Keyword used");
            System.out.println(e);
        }
        try{
            t1.drive1(15);
        }
        catch(YoungerAgeException e)
        {
            System.out.println("Throw Keyword used");
            System.out.println(e);
        }
        System.out.println("This program is created by 21CE138 Yuvrajsinh Solanki");
    }
}
