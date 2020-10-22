// O funcionário por comissão é uma subclasse de object
// colocamos isso explícito aqui, embora normalmente não
// seja necessário
public class ComissionEmployee extends Object {
    protected final String firstName;
    protected final String lastName;
    protected final String cpf;
    protected double grossSales; // venda bruta semanal
    protected double comissionRate; // percentual de comissão

    public ComissionEmployee(String firstName, String lastName, String cpf,
                             double grossSales, double comissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;

        setGrossSales(grossSales);
        setComissionRate(comissionRate);
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

    // calcula o ganho semanal do funcionário
    public double earnings() {
        return comissionRate * grossSales;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: R$ %.2f\n%s: %.2f\n%s: R$ %.2f",
                "Funcionário por comissão", firstName, lastName,
                "CPF", cpf,
                "Venda bruta", grossSales,
                "Comissão", comissionRate,
                "Rendimento", earnings());
    }
}
