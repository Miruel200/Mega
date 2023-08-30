package Animals;

public class Puma {
    String name;
    String color;
    int age;


    public Puma(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public Puma() {

    }

    void getTeeth (){
        System.out.println(" У Пумы 30 зубов");
    }
    int getCountOfTeeth(Boolean isTeeth, int count){
        int countOfTeeth = 30;
        if (isTeeth){
         return countOfTeeth-count;
        }
        return countOfTeeth;

    }

}