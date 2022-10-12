import dao.UsuarioDAO;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Seja bem vindo ao sistema ---");
    }

    public void telaLogin(){
        while (true) {
            Scanner ler = new Scanner(System.in);
            System.out.println("\n\nPara continuar, faça login!");

            System.out.print("Usuario: ");
            String user = ler.nextLine();
            System.out.print("Senha: ");
            String password = ler.nextLine();

            if (!UsuarioDAO.checkLogin(user, password)) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Login realizado com sucesso!");
                break;
            }
            ler.close();
        }
    }

    public void telaInicial(){
        Scanner ler = new Scanner(System.in);

        int opc;

        do {

            System.out.println("--- Menu Principal ---");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Editar produto");
            System.out.println("3 - Deletar produto");
            System.out.println("4 - Cadastrar funcionário");
            System.out.println("5 - Editar funcionário");
            System.out.println("6 - Deletar funcionário");
            System.out.println("7 - Abrir o caixa");
            System.out.println("0 - Sair");

            System.out.println("Digite a opção: ");
            opc = ler.nextInt();

            switch (opc){

                case 0:
                    System.out.println("Até breve!");
                    break;

                case 1:
                    // Cadastrar um produto
                    break;

                case 2:
                    // Editar o produto
                    break;

                case 3:
                    // Deletar o produto
                    break;

                case 4:
                    // Cadastrar funcionário
                    break;

                case 5:
                    // Editar funcionário
                    break;

                case 6:
                    // Deletar funcionário
                    break;

                case 7:
                    // Abrir o caixa
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        }while (opc != 0);

        ler.close();
    }

}