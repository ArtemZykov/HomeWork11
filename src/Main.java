public class Main {

    public static void main(String[] args) {// урок №1 (создание класса)
        String nameJohn = "John";
        int ageJohn = 13;
        String nameSarah = "Sarah";
        int ageSarah = 30;
        String[] names = {"John", "Sarah"};
        int ages[] = {13, 30};
        for (int i = 0; i < names.length; i++) {
            System.out.println( " Имя " + names[i] + " Возраст "+ ages[i]);
        }
        //Person sarah = new Person(); урок первый // после того как прописали новый метод по уроку 2 данное предложение можно удалить
        // так же удалить строки где присваиваем имя Сара и возраст (строки 27 и 29) для наглядности сделал строки не активными
        //Person sarah = Person. Person (" Sarah ", 30); //весь метод, Person createPerson(String name, int age), вывели в класс
        // Person (так как это конструктор) и добавили название класса перед createPerson (то есть там где искать все необходимые данные)
        //sarah.name = "Sarah"; после этого можно удалить create и оставить только Person
        // Person sarah = Person(название класса).Person (метод) (" Sarah ", 30)
        // так как перед вызовом конструктороа должно стоятьь слово "new" слодовательно Person sarah = Person (убрать и поставить
        // "new" далее  Person ( имя возраст) (строка 18 (как было и сделал не активным) строка 24 как стало
        Person sarah = new Person (" Sarah ", 30);
        System.out.println(" sarah.name = " + sarah.getName());
        //sarah.age = 30;
        System.out.println(" sarah.age = " + sarah.getAge());// конец урока №1 (создан класс Person (новая вкладка, внесены данные)
        sarah.setAge(31); // что бы изменить возраст "Сары" необходмио добавить новый метод "Set" в классе.
        System.out.println("sarah.getAge() = " + sarah.getAge());
        Person john = new Person("John", 13);
        //System.out.println(" sarah.name = " + sarah.name); в классе создали новый метод возврата имя public String getName() {   return this.name;
        //    } и теперь можно писать вмеcто + sarah.name просто sarah.getName()
        // такую же операцию проделываем с возрастом

    }

}