package Domain;

/**
 * Класс Employee, расширяющий класс Person.
 * Представляет собой структуру для создания объектов типа "Employee" с именем, возрастом и степенью.
 */
public class Employee extends Person{
    private String degree;

    /**
     * Конструктор класса Employee:
     * @param firstName - имя.
     * @param age - возраст.
     * @param degree - степень.
     */
    public Employee(String firstName, int age, String degree) {
        super(firstName, age);
        this.degree = degree;
    }
}
