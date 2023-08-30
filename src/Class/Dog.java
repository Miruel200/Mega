package Class;

public class Dog extends Animal {
    int teeth;
    String hair;

    public Dog( int teeth, String hair){
        this.teeth = teeth;
        this.hair = hair;
    }

    @Override
    public void MakeSound() {
        System.out.println("Гав гав");
    }

    @Override
    public void eat(String str) {
        System.out.println("Dog is " + str);
    }
}
