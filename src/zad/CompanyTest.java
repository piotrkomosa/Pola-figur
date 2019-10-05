package zad;

public class CompanyTest {

    public static void main(String[] args) {

        Emplyee emp = new Emplyee("jan", "kowalski",2500);
        Company company = new Company();
        company.increaseSalary(emp);

        System.out.println(emp.firstName + emp.salary);
    }
}
