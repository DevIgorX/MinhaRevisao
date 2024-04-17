import java.util.ArrayList;
import java.util.Scanner;

// Definição da classe Livro
class Livro {
    private String titulo;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

}

// Definição da classe Biblioteca
public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();

    public Biblioteca() {
        // Adicionando 10 livros à lista
        livros.add(new Livro("Programação Orientada a Objetos"));
        livros.add(new Livro("Banco de dados com SQL"));
        livros.add(new Livro("Mysql ou postgresSql"));
        livros.add(new Livro("Desenvolvimento Web com React"));
        livros.add(new Livro("Segurança da Informação"));
        livros.add(new Livro("Tecnologia da informação"));
        livros.add(new Livro("Sistemas Distribuidos"));
        livros.add(new Livro("Logica de Programa"));
        livros.add(new Livro("Linguam javascript"));
        livros.add(new Livro("C++"));
    }

    public void mostrarLivros() {
        System.out.println("Lista de Livros Disponíveis:");
        for (int i = 0; i < livros.size(); i++) {
            System.out.println((i + 1) + ". " + livros.get(i).getTitulo());
        }
    }

    public void emprestarLivro(String nomeSolicitante) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, " + nomeSolicitante + "! Por favor, selecione o número do livro que deseja emprestar:");
        int escolha = scanner.nextInt();

        if (escolha >= 1 && escolha <= livros.size()) {
            Livro livroSelecionado = livros.get(escolha - 1);
            System.out.println("Você selecionou o livro: " + livroSelecionado.getTitulo());
        } else {
            System.out.println("Opção inválida!");

        }
    }

    public void adicionarLivro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja adicionar um novo livro?");
        String novolivro = scanner.nextLine();

        if(novolivro.toLowerCase().equals("sim")){
            System.out.println("Digite o nome do livro");
            String nomeLivro = scanner.nextLine();
            livros.add(new Livro(nomeLivro));
            System.out.println("Livro adicionado com Sucesso!");

        }else {
            System.out.println("Ok, Saindo...");
            scanner.close();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Biblioteca! Por favor, digite seu nome:");
        String nomeSolicitante = scanner.nextLine();

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.mostrarLivros();
        biblioteca.emprestarLivro(nomeSolicitante);
        biblioteca.adicionarLivro();
    }
}
