package exercicio;

public abstract class ItemBiblioteca implements Emprestavel{
    String titulo;
    int anoPublicacao;
    int quantidadeDisponivel;

    public ItemBiblioteca(String titulo, int anoPublicacao, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
    public boolean podeSerEmprestado(){
        if(quantidadeDisponivel > 0){
            System.out.println(titulo+" pode ser emprestado!");
            return true;

        }
        System.out.println("Desculpa, nao podemos emprestar");
        return false;
    }
    public abstract void calcularMulta(int diasAtrasos);
    public void emprestarItem(){
        if(!podeSerEmprestado()){
            System.out.println("Estamos esgotados");
        }else{
            quantidadeDisponivel--;
            System.out.println("Item emprestado " + titulo);
        }
    }
    public void devolverItem(){
        quantidadeDisponivel++;
        System.out.println("Item devolvido " + titulo);
    }
}
