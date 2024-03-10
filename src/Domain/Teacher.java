package Domain;

/**
 * Класс Teacher
 * Представляет собой учителя.
 */
public class Teacher extends Person{
    private String acadDegree;

    /**
     * Конструктор класса Teacher:
     * @param firstName - имя учителя.
     * @param age - возраст учителя.
     */
    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }
}
