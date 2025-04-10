public class Main {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista(10);

        lista.inserirInicio(3);
        lista.mostrar();

        lista.inserirInicio(7);
        lista.mostrar();

        lista.inserirFim(9);
        lista.mostrar();

        lista.inserir(2, 2);
        lista.mostrar();

        lista.inserir(6, 2);
        lista.mostrar();

        lista.removerInicio();
        lista.removerFim();
        lista.mostrar();

        lista.remover(1);
        lista.mostrar();

    }
}
