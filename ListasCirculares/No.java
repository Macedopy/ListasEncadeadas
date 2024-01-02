public class No<T> {

    private T conteudo;
    private No<T> noPosterior;

    public No(T conteudo){
        this.conteudo = conteudo;
        this.noPosterior = null;
    }

    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }
    
    public T getConteudo(){
        return conteudo;
    }

    public void setnoPosterior(No<T> noPosterior){
        this.noPosterior = noPosterior;
    }

    public No getnoPosterior(){
        return noPosterior;
    }

    @Override
    public String toString(){
        return "No{conteudo=" + conteudo + "}";
    }
}