public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.tamanhoLista = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento); 
        novoNo.setnoPosterior(null);
        novoNo.setnoAnterior(ultimoNo);
        if(primeiroNo == null){primeiroNo = novoNo;}
        if(ultimoNo != null){ultimoNo.setnoPosterior(novoNo);}
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setnoPosterior(noAuxiliar);

        if(novoNo.getnoPosterior() != null){
            novoNo.setnoAnterior(noAuxiliar.getnoAnterior());
            novoNo.getnoPosterior().setnoAnterior(novoNo);
        }else{
            novoNo.setnoAnterior(ultimoNo);
            ultimoNo = novoNo;}
        
        if(index == 0){
            primeiroNo = novoNo;
        }else{novoNo.getnoAnterior().setnoPosterior(novoNo);}
        tamanhoLista++;
    }

    public void remove(int index){
        if(index==0){
            primeiroNo = primeiroNo.getnoPosterior();
            if(primeiroNo != null){
                primeiroNo.setnoAnterior(null);
            }
        }else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getnoAnterior().setnoPosterior(noAuxiliar.getnoPosterior());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getnoPosterior().setnoAnterior(noAuxiliar.getnoAnterior());
            }else{
                ultimoNo = noAuxiliar;
            }
        }

        this.tamanhoLista--;
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0; (i<index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getnoPosterior();
        }

        return noAuxiliar;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString(){
        String strRetorno = "";

        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i <size(); i++){
            strRetorno += "[No{conteudo=" +noAuxiliar.getConteudo() + "}]";
            noAuxiliar=noAuxiliar.getnoPosterior();
        }
        strRetorno += "null";
        return strRetorno;
    }
    
}
