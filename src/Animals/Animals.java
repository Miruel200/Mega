package Animals;

public class Animals {
    public static void main(String[] args) {
       /* Puma puma = new Puma();
        puma.name = "Lisa";
        puma.color="Black";
        puma.age = 25 ;

        Puma puma2 = new Puma("Lasa", "White", 20);

         int teeth = puma.getCountOfTeeth(true,15);
         int teeth2 = puma2.getCountOfTeeth(false,25);

        System.out.println("Пуму зовут "+ puma.name + " Она " + puma.color + " ее возраст составляет " + puma.age );
        System.out.println("Пуму зовут "+ puma2.name + " Она " + puma2.color + " ее возраст составляет " + puma2.age );
        puma.getTeeth();
        System.out.println("У первой пумы зубов :" + teeth);
        System.out.println("У второй пумы зубов :" + teeth2);     */

        Cat cat = new Cat();
        cat.name = "Lisa";
        cat.color="Black";
        cat.age = 25 ;

        Cat cat2 = new Cat("Lasa", "White", 20);

        String breed = cat.getBreed("black","whitee" );
        String breed2 = cat2.getBreed("red","whitee");


        System.out.println("Кошку зовут "+ cat.name + " Она " + cat.color + " ее возраст составляет " + cat.age );
        System.out.println("Кошку зовут "+ cat2.name + " Она " + cat2.color + " ее возраст составляет " + cat2.age );
        cat.breed();
        System.out.println(breed);
        System.out.println(breed2);
    }

}
