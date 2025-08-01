package exercicio;

public class Main {
    public static void main(String[] args) {
        Livros livro1 = new Livros("Livro legal",2000, 12, "Leo Kina", 1600);
        Livros livro2 = new Livros("Livro legal 2",1945, 23, "Autor legal", 1250);
        DVD dvd1 = new DVD("Tanana" , 2020, 201, "SuperDirecao", 2);
        Revistas revista1 = new Revistas("Supers", 2010, 20, "salgados" , 2);
        livro1.emprestarItem();
        livro1.devolverItem();
        livro1.calcularMulta(10);
        livro1.podeSerEmprestado();

        revista1.podeSerEmprestado();
    }
}
