package Class;

public class Main {
    public static void main(String[] args) {
        Snake snake = new Snake(20,15);
        snake.name = "Lais";
        snake.age = 25;
        snake.breed = "Black mamba";
        snake.color = "Black";
        snake.type = "Arges";
        snake.eat();

        System.out.println(" My Snake is called " + snake.name + " she is " + snake.age + " her breed " + snake.breed + " her color " + snake.color+
        " her type " + snake.type + " her lenght " + snake.lenght + " her width " + snake.width);
        snake.MakeSound();
        snake.eat("Snake");


        Dog dog = new Dog(30,"Black");
        dog.name = "Laura";
        dog.age = 10;
        dog.breed = "Labrador";
        dog.color = "White";
        dog.type = "Spoke";
        dog.sleep();
        System.out.println(" My Dog is called " + dog.name + " she is " + dog.age + " her breed " + dog.breed + " her color " + dog.color+
                " her type " + dog.type + " her hair " + dog.hair + " her teeth " + dog.teeth);
        dog.MakeSound();
        dog.eat(" Eat ");
    }

}
