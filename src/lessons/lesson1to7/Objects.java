package lessons.lesson1to7;

public class Objects {

    // Конструкторы
    public class Person {
        String name;
        int age;
        char gender;

        public Person(String name, int age, char gender) {  //конструктор изменять нельзя, нужно создавать с добавлеными
            // новыми параметрами

            this.name = name;
            this.age = age;
            this.gender = gender;


        }

        public Person() {
            System.out.println("Hi");
        }

        public Person(String name, char gender) {
            this.name = name;
            this.gender = gender;
        }

        //_______________________________________________________________________
        public String getName() {
            if (gender == 'M') {
                return "Mr. " + name;
            } else {
                return "Mrs. " + name;
            } //return "Choose your gender";
        }
    }
}
