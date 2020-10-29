/*
Então, reescreva a classe CommissionEmployee da aula passada como uma
subclasse de Employee. A classe CommissionEmployee só deve conter os métodos e as variáveis de
instância que não são declarados na superclasse Employee.
O construtor da classe CommissionEmployee deve chamar o construtor da classe Employee, e o
método toString de CommissionEmployee deve invocar o método toString de Employee.
 */
public class Employee {
    private final String firstName;
    private final String lastName;
    private final String cpf;

    public Employee(String firstName, String lastName, String cpf) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s",
                "Funcionário", firstName, lastName,
                "CPF", cpf);
    }
}
