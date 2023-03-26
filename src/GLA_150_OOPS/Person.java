package GLA_150_OOPS;

public class Person {
    String name ="ramesh";
    int age=50;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

   /* public void setAge(int age) throws Exception{ // may be chances of exception
        if(age<0){
            throw  new Exception("not possible");
        }
        this.age = age;
    }*/
   public void setAge(int age) {
       try{
           if(age<0){
               throw  new Exception("not possible");
           }
           System.out.println("we are in try");
          // System.out.println();
           this.age = age;
           // may be chances of exception
       }
       catch (Exception e){
           e.printStackTrace();
           System.out.println("we are in cahce");
       }
       finally {
           System.out.println("finally");
       }

   }

    public void setName(String name) {

        this.name = name;
    }

    /* public Person(){ // constrctor//  BY DEFAULT
            this.age=12;
            this.name="sunil";


        }*/
    public  Person(String name,int age){  // arguemnt mismatch
        this.name=name;
        this.age=age;


    }
}
