public class Main {

    public static void main (String[] args){
        ListaCircular<String> listaCircular = new ListaCircular<>();

        listaCircular.add("c0");
        listaCircular.add("c1");
        listaCircular.add("c2");
        listaCircular.add("c3");
        listaCircular.add("c4");
        for(int i = 0; i<20; i++){
            System.out.println(listaCircular.get(i));
        }
    }
}