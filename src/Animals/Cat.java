package Animals;

public class Cat {
    String name;
    String color;
    int age;


    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public Cat() {

    }

    void breed (){
        System.out.println(" У кошек более 50 парод");
    }
    String getBreed(String black,String white){
        String breed = "red";
        if (black.equals(breed)&& white.equals(breed)){
            return breed;
        }
        return breed;

    }

}
