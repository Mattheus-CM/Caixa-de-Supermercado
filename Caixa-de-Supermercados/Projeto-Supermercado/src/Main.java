import dao.EnderecoDAO;
import dao.FuncionarioDAO;
import dao.ProdutoDAO;
import dao.UsuarioDAO;
import model.Endereco;
import model.Funcionario;
import model.Produto;
import model.Usuario;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        telaLogin();
    }
    public static void telaLogin(){
        System.out.println("--- Seja bem vindo ao sistema ---");

        System.out.println("\n\nPara continuar, faça login!");

        System.out.print("Usuario: ");
        String usuario = ler.nextLine();
        System.out.print("Senha: ");
        String senha = ler.nextLine();

        if (!(usuario.equals("admin") && senha.equals("admin"))) {
            System.out.println("Senha incorreta!");
        } else {
            System.out.println("Login realizado com sucesso!");
            telaInicial();
            }
        }

    public static void telaInicial(){

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
            ler.nextLine();

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

    public static void cadastrarProduto(){
        System.out.println("--- Tela de Cadastro de Produtos ---");

        System.out.println("Digite o nome do produto: ");
        String nome = ler.nextLine();
        System.out.println("Digite a marca do produto: ");
        String marca = ler.nextLine();
        System.out.println("Digite o preço do produto: ");
        BigDecimal preco = ler.nextBigDecimal();

        Produto produto = new Produto(nome, marca, preco);
        ProdutoDAO pdao;
    }

    public static void cadastrarFuncionario(){
        System.out.println("--- Tela de Cadastro de Funcionários ---");

        System.out.println("***** Login do Funcionário *****");
        System.out.println("Digite o usuario de login do Funcionário: ");
        String usuario = ler.nextLine();
        System.out.println("Digite a senha de login do Funcionário: ");
        String senha = ler.nextLine();
        Usuario u = new Usuario(usuario, senha);
        UsuarioDAO udao = new UsuarioDAO();
        udao.cadastrarUsuario(u);

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
        Endereco e = new Endereco(rua, numero, bairro, cidade, cep);
        EnderecoDAO edao = new EnderecoDAO();
        edao.cadastrarEndereco(e);

        System.out.println("***** Informações do Funcionário *****");
        System.out.println("Digite o nome do Funcionário: ");
        String nome = ler.nextLine();
        System.out.println("Digite o cargo do Funcionário: ");
        String cargo = ler.nextLine();
        System.out.println("Digite o cpf do Funcionário: ");
        String cpf = ler.nextLine();
        Funcionario f = new Funcionario(nome, cargo, cpf, u, e);
        FuncionarioDAO fdao = new FuncionarioDAO();
        fdao.cadastrarFuncionario(f);

        System.out.println("Chegou aqui");
    }
}