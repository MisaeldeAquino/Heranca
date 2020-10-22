// O funcionário por comissão é uma subclasse de object
// colocamos isso explícito aqui, embora normalmente não
// seja necessário
public class BasePlusComissionEmployee extends Object {
    private final String firstName;
    private final String lastName;
    private final String cpf;
    private double grossSales; // venda bruta semanal
    private double comissionRate; // percentual de comissão
    private double baseSalary; // salário base

    public BasePlusComissionEmployee(String firstName, String lastName, String cpf,
                                     double grossSales, double comissionRate,
                                     double baseSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;

        setGrossSales(grossSales);
        setComissionRate(comissionRate);
        setBaseSalary(baseSalary);
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

    public double getGrossSales() {
        return grossSales;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0) {
            throw new IllegalArgumentException(
                    "O valor de vendas brutas (grossSales) deve ser >= 0!"
            );
        }
        this.grossSales = grossSales;
    }

    public void setComissionRate(double comissionRate) {
        if (comissionRate <= 0 || comissionRate > 1) {
            throw new IllegalArgumentException(
                    "A comissão (comissionRate) deve ser > 0 e <= 1!"
            );
        }
        this.comissionRate = comissionRate;
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
