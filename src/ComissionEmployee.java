// O funcionário por comissão é uma subclasse de object
// colocamos isso explícito aqui, embora normalmente não
// seja necessário
public class ComissionEmployee extends Employee {
    private double grossSales; // venda bruta semanal
    private double comissionRate; // percentual de comissão

    public ComissionEmployee(String firstName, String lastName, String cpf,
                             double grossSales, double comissionRate) {
        super(firstName, lastName, cpf);

        setGrossSales(grossSales);
        setComissionRate(comissionRate);
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
        return String.format("%s %s\n%s: R$ %.2f\n%s: %.2f\n%s: R$ %.2f",
                "Comissão",
                super.toString(),
                "Venda bruta", grossSales,
                "Comissão", comissionRate,
                "Rendimento", earnings());
    }
}
