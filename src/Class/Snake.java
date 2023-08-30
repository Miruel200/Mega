package Class;

public class Snake extends Animal {
   int lenght;
   int width;

    public Snake(int lenght,int width ){
        this.lenght = lenght;
        this.width = width;
    }


    @Override
    public void MakeSound() {
        System.out.println("Шшшш");
    }

    @Override
    public void eat(String str) {
        System.out.println(" is eat " + str);
    }
}
