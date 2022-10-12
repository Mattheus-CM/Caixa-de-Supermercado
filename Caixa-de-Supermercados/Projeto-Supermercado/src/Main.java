import dao.UsuarioDAO;
import model.Endereco;
import model.Funcionario;
import model.Usuario;

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
            String usuario = ler.nextLine();
            System.out.print("Senha: ");
            String senha = ler.nextLine();

            if (!(usuario.equals("admin") && senha.equals("admin"))) {
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
                    cadastrarFuncionario();
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

    public void cadastrarFuncionario(){
        Scanner ler = new Scanner(System.in);

        System.out.println("--- Tela de Cadastro de Funcionários ---");

        System.out.println("***** Informações do Funcionário *****");
        System.out.println("Digite o nome do Funcionário: ");
        String nome = ler.nextLine();
        System.out.println("Digite o cargo do Funcionário: ");
        String cargo = ler.nextLine();
        System.out.println("Digite o cpf do Funcionário: ");
        String cpf = ler.nextLine();

        System.out.println("***** Login do Funcionário *****");
        System.out.println("Digite o usuario de login do Funcionário: ");
        String usuario = ler.nextLine();
        System.out.println("Digite a senha de login do Funcionário: ");
        String senha = ler.nextLine();

        System.out.println("***** Endereço do Funcionário *****");
        System.out.println("Digite a rua: ");
        String rua = ler.nextLine();
        System.out.println("Digite o numero: ");
        String numero = ler.nextLine();
        System.out.println("Digite o bairro: ");
        String bairro = ler.nextLine();
        System.out.println("Digite a cidade: ");
        String cidade = ler.nextLine();
        System.out.println("Digite o CEP: ");
        String cep = ler.nextLine();

        ler.close();

        Usuario usuario1 = new Usuario(usuario, senha);
        Endereco endereco1 = new Endereco(rua, numero, bairro, cidade, cep);
        Funcionario funcionario1 = new Funcionario(nome, cargo, cpf, usuario1, endereco1);



    }
}