public class Person {
    private String name; // для того что бы "name" можно было использовать только в классе "Person" добавили фразу private
    // аналогично делаем и с возрастом, добавляем для возраста дополнительно геттер "public int getAge() { return this.age;}"
    private int age;
    public Person(String name, int age) {// урок 2 (конструктор) . ввели новый метод, далее данный метод вырезали с
        // класса "main" так он является конструктором и убрали фразу create, так как мы ссылаемся на фразу названия класса
        // "Person"   public static Person(название класса) Person (название метода) (String name, int age)
        // далее удалили слово statik в конструкторе его не должно быть
        //Person person = new Person(); //прописали все о человеке что мы хотим вывести
        //person.name = name; // меняем " person на  this я их сдедал не активными
        //person.age = age;
        this.name = name;
        this.age = age;
        //return person;
        // псле удаления "statik" удаляем "Person person = new Person();" и "return person;" их сделал не активными
    }
    public String getName() { // когда пишем имя ТО прописываем "String"
        return this.name;
    }
    public int getAge() {// так как мы пишем возраст, а это число ТО пишем int
        return this.age;
    }
    public void setAge(int age) { // для изменения возраста сары добавляем метод setAge
        this.age = age;
    }
    // через get что бы дать имея свойству, мы его СПРАШИВАЕМ у свойства
    // через set мы САМИ даем имя данному свойству
    // т.е данный метод называется ИНКАПСУЛЯЦИЕЙ который не дает доступ к свойствам объекта а получает
    // их через методы





}
