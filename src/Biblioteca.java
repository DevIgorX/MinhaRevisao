//import java.util.ArrayList;
//import java.util.Scanner;
//
//// Definição da classe Livro
//class Livro {
//    private String titulo;
//
//    public Livro(String titulo) {
//        this.titulo = titulo;
//    }
//
//    public String getTitulo() {
//        return titulo;
//    }
//
//}
//
//// Definição da classe Biblioteca
//public class Biblioteca {
//    private ArrayList<Livro> livros = new ArrayList<>();
//
//    public Biblioteca() {
//        // Adicionando 10 livros à lista
//        livros.add(new Livro("Programação Orientada a Objetos"));
//        livros.add(new Livro("Banco de dados com SQL"));
//        livros.add(new Livro("Mysql ou postgresSql"));
//        livros.add(new Livro("Desenvolvimento Web com React"));
//        livros.add(new Livro("Segurança da Informação"));
//        livros.add(new Livro("Tecnologia da informação"));
//        livros.add(new Livro("Sistemas Distribuidos"));
//        livros.add(new Livro("Logica de Programa"));
//        livros.add(new Livro("Linguam javascript"));
//        livros.add(new Livro("C++"));
//    }
//
//    public void mostrarLivros() {
//        System.out.println("Lista de Livros Disponíveis:");
//        for (int i = 0; i < livros.size(); i++) {
//            System.out.println((i + 1) + ". " + livros.get(i).getTitulo());
//        }
//    }
//
//    public void emprestarLivro(String nomeSolicitante) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Olá, " + nomeSolicitante + "! Por favor, selecione o número do livro que deseja emprestar:");
//        int escolha = scanner.nextInt();
//
//        if (escolha >= 1 && escolha <= livros.size()) {
//            Livro livroSelecionado = livros.get(escolha - 1);
//            System.out.println("Você selecionou o livro: " + livroSelecionado.getTitulo());
//        } else {
//            System.out.println("Opção inválida!");
//
//        }
//    }
//
//    public void adicionarLivro(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Deseja adicionar um novo livro?");
//        String novolivro = scanner.nextLine();
//
//        if(novolivro.toLowerCase().equals("sim")){
//            System.out.println("Digite o nome do livro");
//            String nomeLivro = scanner.nextLine();
//            livros.add(new Livro(nomeLivro));
//            System.out.println("Livro adicionado com Sucesso!");
//
//        }else {
//            System.out.println("Ok, Saindo...");
//            scanner.close();
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Bem-vindo à Biblioteca! Por favor, digite seu nome:");
//        String nomeSolicitante = scanner.nextLine();
//
//        Biblioteca biblioteca = new Biblioteca();
//        biblioteca.mostrarLivros();
//        biblioteca.emprestarLivro(nomeSolicitante);
//        biblioteca.adicionarLivro();
//    }
//}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

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
public class Biblioteca extends JFrame {
    private ArrayList<Livro> livros = new ArrayList<>();
    private JList<String> listaLivros;
    private DefaultListModel<String> listModel;
    private JTextField nomeSolicitanteField;
    private JTextField novoLivroField;

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

        // Configurando a janela principal
        setTitle("Biblioteca");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout da janela
        setLayout(new BorderLayout());

        // Lista de livros
        listModel = new DefaultListModel<>();
        for (Livro livro : livros) {
            listModel.addElement(livro.getTitulo());
        }
        listaLivros = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(listaLivros);
        add(scrollPane, BorderLayout.CENTER);

        // Painel inferior com campo de nome e botões
        JPanel painelInferior = new JPanel();
        painelInferior.setLayout(new GridLayout(3, 2));

        painelInferior.add(new JLabel("Seu nome:"));
        nomeSolicitanteField = new JTextField();
        painelInferior.add(nomeSolicitanteField);

        JButton emprestarButton = new JButton("Emprestar Livro");
        emprestarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                emprestarLivro();
            }
        });
        painelInferior.add(emprestarButton);

        JButton adicionarButton = new JButton("Adicionar Livro");
        adicionarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adicionarLivro();
            }
        });
        painelInferior.add(adicionarButton);

        novoLivroField = new JTextField();
        painelInferior.add(new JLabel("Novo livro:"));
        painelInferior.add(novoLivroField);

        add(painelInferior, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void emprestarLivro() {
        String nomeSolicitante = nomeSolicitanteField.getText();
        int index = listaLivros.getSelectedIndex();
        if (index != -1) {
            String tituloLivro = listModel.get(index);
            JOptionPane.showMessageDialog(this, "Olá, " + nomeSolicitante + "! Você selecionou o livro: " + tituloLivro);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um livro.");
        }
    }

    private void adicionarLivro() {
        String novoLivro = novoLivroField.getText();
        if (!novoLivro.isEmpty()) {
            listModel.addElement(novoLivro);
            livros.add(new Livro(novoLivro));
            novoLivroField.setText("");
            JOptionPane.showMessageDialog(this, "Livro adicionado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, insira o título do livro.");
        }
    }

    public static void main(String[] args) {
        new Biblioteca();
    }
}
