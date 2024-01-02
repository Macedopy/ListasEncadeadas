public class Main {
    public static void main(String[] args){
        ListaDuplamenteEncadeada<String> listaEncadeada = new ListaDuplamenteEncadeada<>();

        listaEncadeada.add("c1");
        listaEncadeada.add("c2");
        listaEncadeada.add("c3");
        listaEncadeada.add("c4");
        listaEncadeada.add("c5");
        listaEncadeada.add("c6");
        listaEncadeada.add("c7");

        System.out.println(listaEncadeada);

        listaEncadeada.remove(3);
        listaEncadeada.add(3, "99");

        System.out.println(listaEncadeada);

    }
}
