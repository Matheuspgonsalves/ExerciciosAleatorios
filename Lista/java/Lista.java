public class Lista {
    int[] array;
    int n;

    Lista(){
        this(6);
    }

    Lista(int tam) {
        array = new int[tam];
        n = 0;
    } 

    void inserirInicio(int x) throws Exception{
        if(n >= array.length) {
            throw new Exception("Erro: Lista cheia!");
        }

        for(int i = n; i > 0; i--) {
            array[i] = array[i-1];
        }

        array[0] = x;
        n++;
    }

    void inserirFim(int x) throws Exception{
        if(n >= array.length) {
            throw new Exception("Erro: Lista cheia!");
        }

        array[n] = x;
        n++;
    }

    void inserir(int x, int pos) throws Exception{
        if(n >= array.length) {
            throw new Exception("Erro: Lista cheia!");
        }

        for(int i = n; i > pos; i--) {
            array[i] = array[i-1];
        }

        array[pos] = x;
        n++;

    }

    int removerInicio() throws Exception{
        if(n == 0) {
            throw new Exception("Erro: Lista já está vazia!");
        }

        int resp = array[0];
        n--;
        
        for(int i = 0; i < n; i++){
            array[i] = array[i+1];
        }

        return resp;
    }

    int removerFim() throws Exception{
        if(n == 0) {
            throw new Exception("Erro: Lista já está vazia!");
        }

        return array[--n];
    }

    int remover(int pos) throws Exception{
        if(n == 0) {
            throw new Exception("Erro: Lista já está vazia!");
        }

        int resp = array[pos];
        n--;

        for(int i = pos; i < n; i++) {
            array[i] = array[i+1];
        }

        return resp;
    }

    void mostrar(){
        System.out.print("[");
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

}