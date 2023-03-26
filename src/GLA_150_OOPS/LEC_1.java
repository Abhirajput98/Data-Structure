package GLA_150_OOPS;

public class LEC_1 {
    public static void main(String[] args) throws Exception {
       /* student s = new student();
        System.out.println(s.age);
        System.out.println(s.name);
        s.name="Avvi";
        s.age=23;
        s.setAge();
        student s1 = new student();
      //  s1.name="kaju";
        s.sayhey("kaju");*/

        Person s= new Person("kaju",11);
       // System.out.println(s.getAge());
        s.setAge(-22);
        System.out.println(s.getAge());
       // System.out.println(s.age+" "+ s.name);

    }

}
