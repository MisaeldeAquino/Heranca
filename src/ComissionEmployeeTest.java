public class ComissionEmployeeTest {
    public static void main(String[] args) {
        ComissionEmployee employee = new ComissionEmployee(
          "João", "Ninguém", "123.456.789-00",
          10000, .1
        );

        System.out.println("Imprimindo dados por métodos get: ");
        System.out.println("Nome: " + employee.getFirstName());
        System.out.println("Sobrenome: " + employee.getLastName());
        System.out.println("CPF: " + employee.getCpf());
        System.out.println("Venda bruta: " + employee.getGrossSales());
        System.out.println("Comissão: " + employee.getComissionRate());
        System.out.println("Rendimento: " + employee.earnings());

        try {
            employee.setGrossSales(-1);
        } catch (IllegalArgumentException ex) {
            System.out.println("Erro atualizando vendas brutas do funcionário: " + ex.getMessage());
        }

        try {
            employee.setComissionRate(4);
        } catch (IllegalArgumentException ex) {
            System.out.println("Erro atualizando comissão do funcionário: " + ex.getMessage());
        }


        System.out.println("Atualizada a informação do funcionário:");
        System.out.println(employee);
    }
}
