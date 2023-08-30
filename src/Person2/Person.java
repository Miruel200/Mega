package Person2;

public class Person {
    String fullName;
    int age;

    public void move(){
        System.out.println("Такой то " + fullName + " " + age );
    }
    public void talk(){
        System.out.println(" Говорит "+ fullName + " " + age);
    }

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        move();
        talk();
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person("david", 20);
        System.out.println(person);
        Person person11 = new Person();
        person11.fullName = "Dava";
        person11.age = 15;
        System.out.println(person11);
        person.move();
        person11.talk();


    }


    }




