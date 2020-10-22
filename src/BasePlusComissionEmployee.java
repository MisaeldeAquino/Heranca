// O funcionário por comissão é uma subclasse de object
// colocamos isso explícito aqui, embora normalmente não
// seja necessário
public class BasePlusComissionEmployee extends ComissionEmployee {
    // outros atributos encontram-se na classe ComissionEmployee
    private double baseSalary; // salário base

    public BasePlusComissionEmployee(String firstName, String lastName, String cpf,
                                     double grossSales, double comissionRate,
                                     double baseSalary) {
        // chamando o construtor da superclasse (classe pai: ComissionEmployee)
        super(firstName, lastName, cpf, grossSales, comissionRate);
        setBaseSalary(baseSalary); // atributo que é específico da classe BasePlusComissionEmployee
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException(
                    "O salário base (baseSalary) deve ser > 0!"
            );
        }

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // calcula o ganho semanal do funcionário
    @Override
    public double earnings() {
        return baseSalary + comissionRate * grossSales;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: R$ %.2f\n%s: %.2f\n%s: R$ %.2f\n%s: R$ %.2f",
                "Funcionário por comissão", firstName, lastName,
                "CPF", cpf,
                "Venda bruta", grossSales,
                "Comissão", comissionRate,
                "Salário base", baseSalary,
                "Rendimento", earnings());
    }
}
