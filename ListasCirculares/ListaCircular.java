public class ListaCircular<T> {
    
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setnoPosterior(cauda);
        }else{
            novoNo.setnoPosterior(this.cauda);
            this.cabeca.setnoPosterior(novoNo);
            this.cauda = novoNo;
        }

        this.tamanhoLista++;
    }

    public void remove(int index){
        if(index >= tamanhoLista){
            throw new IndexOutOfBoundsException("Índice maior que o tamanho da lista");}
        No<T> noAuxiliar = this.cauda;
            if(index == 0){
                this.cauda = this.cauda.getnoPosterior();
                this.cabeca.setnoPosterior(this.cauda);
            }else if(index == 1){
                this.cauda.setnoPosterior(this.cauda.getnoPosterior().getnoPosterior());
            }else{
                for(int i = 0; i<index-1; i++){
                    noAuxiliar = noAuxiliar.getnoPosterior();
                }
                noAuxiliar.setnoPosterior(noAuxiliar.getnoPosterior().getnoPosterior());
            }

            this.tamanhoLista--;
        }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return this.tamanhoLista;
    }

    private No<T> getNo(int index){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("A lista está vazia");
        }

        if(index == 0){
            return this.cauda;
        }

        No<T> noAuxiliar = this.cauda;
        for(int i = 0; (i<index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getnoPosterior();
        }

        return noAuxiliar;
    }

    @Override
    public String toString(){
        String strRetorno = "";

        No<T> noAuxiliar = this.cauda;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No conteudo =" +noAuxiliar.getConteudo() + "]---";
            noAuxiliar = noAuxiliar.getnoPosterior();
        }

        strRetorno += this.size() != 0 ? "(Retorna ao início)": "[]";

        return strRetorno;
    }
}
