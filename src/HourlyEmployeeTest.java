public class HourlyEmployeeTest {
    public static void main(String[] args) {
        HourlyEmployee employee = new HourlyEmployee(
          "João", "Ninguém", "123.456.789-00",
          44, 25
        );

        System.out.println("Imprimindo dados por métodos get: ");
        System.out.println("Nome: " + employee.getFirstName());
        System.out.println("Sobrenome: " + employee.getLastName());
        System.out.println("CPF: " + employee.getCpf());
        System.out.println("Valor por hora: " + employee.getWage());
        System.out.println("Horas trabalhadas: " + employee.getHours());
        System.out.println("Rendimento: " + employee.earnings());

        try {
            employee.setWage(-1);
        } catch (IllegalArgumentException ex) {
            System.out.println("Erro atualizando salário do funcionário: " + ex.getMessage());
        }

        try {
            employee.setHours(200);
        } catch (IllegalArgumentException ex) {
            System.out.println("Erro atualizando horas trabalhadas do funcionário: " + ex.getMessage());
        }


        System.out.println("Atualizada a informação do funcionário:");
        System.out.println(employee);
    }
}
