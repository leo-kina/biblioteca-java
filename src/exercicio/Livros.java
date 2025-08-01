package exercicio;

public class Livros extends ItemBiblioteca  {
    String autor;
    int numeroPaginas;
    private double multa;
    public Livros(String titulo, int anoPublicacao, int quantidadeDisponivel,
                  String autor, int numeroPaginas) {

        super(titulo, anoPublicacao, quantidadeDisponivel);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }




    public void calcularMulta(int diasAtrasos){
        multa = diasAtrasos * 1.5;
        System.out.println("Sua multa é de "+ multa+ " Pois voce atrasou "+ diasAtrasos);
    }
}
