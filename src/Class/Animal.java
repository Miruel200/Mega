package Class;

public abstract class Animal {
    String name;
    String breed;
    int age;
    String color;
    String type;

    public void eat(){
        System.out.println(" I am eating ");
    }
    public  void sleep(){
        System.out.println(" i am sleeping");
    }
    public abstract void MakeSound();

    public abstract void eat(String str);
}
