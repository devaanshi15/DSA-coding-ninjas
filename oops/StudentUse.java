public class StudentUse {
    public static void main(String[] args) {
        // Scanner s = new Scanner(source);
        Student s1 = new Student();
        Student s2 = new Student();
        // s1.name="deva";
        // s1.roll=10;
        // System.out.println(s1);
        // System.out.println(s1.name+" "+s1.roll);

        s2.name="lol";
        s2.roll=10;

        s1.setRoll(150);                        //getters and setters
        System.out.println(s1.getRoll() );


         // This will call the overridden toString() method
    }
}
