package exercicio;

public class Revistas extends ItemBiblioteca{
    String editora;
    int edicao;
    private double multa;

    @Override
    public boolean podeSerEmprestado() {
        if(anoPublicacao >2024) {
            System.out.println("Infelizmente nao podemos emprestar");
            return false;
        }
        else{
            System.out.println(titulo+" pode ser emprestado!");
            return true;
        }
    }

    public Revistas(String titulo, int anoPublicacao, int quantidadeDisponivel, String editora, int edicao) {
        super(titulo, anoPublicacao, quantidadeDisponivel);
        this.editora = editora;
        this.edicao = edicao;
    }

    @Override
    public void calcularMulta(int diasAtrasos) {
        multa = diasAtrasos * 0.75;
        System.out.println("Sua multa é de "+ multa+ " Pois voce atrasou "+ diasAtrasos);
    }
}
