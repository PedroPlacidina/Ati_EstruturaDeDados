public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== TESTANDO VETOR ===");
        
        Integer[] valores = {2, 7, 9, 12, 16, 21, 27, 33, 42, 54};
        
        Vetor vetor = new Vetor(10);
        for (Integer valor : valores) {
            vetor.adicionar(valor);
        }
        
        System.out.print("Vetor inicial: ");
        vetor.imprimir();
        
  
        System.out.println("Busca binária por 21: " + vetor.buscaBinaria(21));
        System.out.println("Busca binária por 100: " + vetor.buscaBinaria(100));
        
        
        vetor.inserirNoInicio(1);
        System.out.print("Após inserir 1 no início: ");
        vetor.imprimir();

        System.out.println("\n=== TESTANDO LISTA DUPLAMENTE ENCADEADA ===");
        
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        for (Integer valor : valores) {
            lista.inserirNoFinal(valor);
        }
        
        System.out.print("Lista inicial: ");
        lista.imprimir();
        System.out.println("Tamanho da lista: " + lista.getTamanho());
        
        lista.inserirAposValor(16, 18);
        System.out.print("Após inserir 18 após 16: ");
        lista.imprimir();

        System.out.println("\n=== TESTANDO ITERADOR ===");
        
        Iterador iterador = new Iterador(lista);
        
        while (iterador.temProximo()) {
            Integer valor = iterador.proximo();
            if (valor != null && valor == 16) {
                break;
            }
        }
        
        iterador.inserirAposAtual(17);
        lista.imprimir();
        
        iterador.inserirAntesDoAtual(15);
        lista.imprimir();
        
        iterador.removerAposAtual();
        lista.imprimir();
        
        iterador.removerAntesDoAtual();
        lista.imprimir();
        
        System.out.println("Tamanho final da lista: " + lista.getTamanho());
    }
}
