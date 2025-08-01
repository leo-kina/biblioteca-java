package exercicio;

public class DVD extends ItemBiblioteca{
    String diretor;
    int duracaoMinutos;
    private double multa;


    public DVD(String titulo, int anoPublicacao, int quantidadeDisponivel, String diretor, int duracaoMinutos) {
        super(titulo, anoPublicacao, quantidadeDisponivel);
        this.diretor = diretor;
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public void calcularMulta(int diasAtrasos) {
        multa = diasAtrasos * 2;
        System.out.println("Sua multa é de "+ multa+ " Pois voce atrasou "+ diasAtrasos);
    }
}
