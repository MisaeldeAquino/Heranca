/*
Crie uma classe HourlyEmployee, que é herdada da classe Employee (Exercício anterior),
e tem variáveis de instância hours (um double), que representa as horas trabalhadas, e wage (um double),
que representa os salários por hora, além de um construtor que recebe como argumentos
firstName, lastName, cpf, wage e número de horas trabalhadas (hours), métodos set e get para manipular hours e wage,
um método earnings para calcular os rendimentos de um HourlyEmployee com base nas horas trabalhadas e um método
toString que retorna a representação String de HourlyEmployee. O método setWage deve assegurar que wage não seja negativo,
e setHours, que o valor das horas esteja entre 0 e 168 (o número total de horas em uma semana).
Use a classe HourlyEmployee em um programa de teste, semelhante ao que fizemos na aula passada.
 */
public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String cpf, double hours, double wage) {
        super(firstName, lastName, cpf);
        this.hours = hours;
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException(
                    "O valor das horas deve ser >= 0 e < 168!"
            );
        }
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0) {
            throw new IllegalArgumentException(
                    "O valor do salário deve ser >= 0!"
            );
        }
        this.wage = wage;
    }

    // calcula o ganho semanal do funcionário
    public double earnings() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return String.format("%s %s\n%s: R$ %.2f\n%s: %.2f\n%s: R$ %.2f",
                "Horista",
                super.toString(),
                "Valor por hora", wage,
                "Horas trabalhadas", hours,
                "Rendimento", earnings());
    }
}
