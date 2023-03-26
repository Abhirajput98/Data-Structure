package GLA_150_OOPS;

public class student {
    String name;

    {
        name = "Abhishek";
    }

    int age=20;

    public void setAge() {
        System.out.println("my name is "+name +" and age"+age);
    }
    public void sayhey(String name){
        System.out.println(name+"  " +this.name);
    }

}
