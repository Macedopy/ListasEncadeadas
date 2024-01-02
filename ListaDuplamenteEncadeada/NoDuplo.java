public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> noPosterior;
    private NoDuplo<T> noAnterior;

    public NoDuplo(T conteudo){
        this.conteudo = conteudo;
    }

    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }

    public T getConteudo(){
        return conteudo;
    }

    public void setnoPosterior(NoDuplo noPosterior){
        this.noPosterior = noPosterior;
    }

    public NoDuplo getnoPosterior(){
        return noPosterior;
    }

    public void setnoAnterior (NoDuplo noAnterior){
        this. noAnterior = noAnterior;
    }

    public NoDuplo getnoAnterior(){
        return noAnterior;
    }

    @Override
    public String toString(){
        return "NoDuplo{" + "conteudo=" + conteudo + '}';
    }    
}
