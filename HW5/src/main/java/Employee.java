/**
 * Java1 Home work 5
 *
 * @author Anna Velichko
 * @version 8.11.2021
 */
public class Employee {
    String full_name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String full_name, String position, String email, String phone, int salary, int age) {
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void print() {
        System.out.println(this);
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Алексей Григорьевич Ардов", "Инженер", "a@mail.ru", "123456",90000,35);
        employees[1] = new Employee("Игорь Алексеевич Александров", "Схемотехник", "i@mail.ru", "234567",92000,41);
        employees[2] = new Employee("Вера Андреевна Кузнецова", "Технический писатель", "v@mail.ru", "345678",80000,28);
        employees[3] = new Employee("Григорий Иннокентьевич Крутовский", "Программист", "g@mail.ru", "456789",100000,44);
        employees[4] = new Employee("Людмила Александровна Натова", "HR", "l@mail.ru", "567890",80000,31);

        for (Employee employee : employees)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}

