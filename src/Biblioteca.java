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
        livros.add(new Livro("Livro 1"));
        livros.add(new Livro("Livro 2"));
        livros.add(new Livro("Livro 3"));
        livros.add(new Livro("Livro 4"));
        livros.add(new Livro("Livro 5"));
        livros.add(new Livro("Livro 6"));
        livros.add(new Livro("Livro 7"));
        livros.add(new Livro("Livro 8"));
        livros.add(new Livro("Livro 9"));
        livros.add(new Livro("Livro 10"));
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Biblioteca! Por favor, digite seu nome:");
        String nomeSolicitante = scanner.nextLine();

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.mostrarLivros();
        biblioteca.emprestarLivro(nomeSolicitante);
    }
}
