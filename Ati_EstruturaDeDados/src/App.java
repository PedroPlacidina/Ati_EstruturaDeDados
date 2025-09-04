public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== TESTANDO VETOR ===");
        
        // Teste com os valores sugeridos
        Integer[] valores = {2, 7, 9, 12, 16, 21, 27, 33, 42, 54};
        
        Vetor vetor = new Vetor(10);
        for (Integer valor : valores) {
            vetor.adicionar(valor);
        }
        
        System.out.print("Vetor inicial: ");
        vetor.imprimir();
        
        // Teste busca binária
        System.out.println("Busca binária por 21: " + vetor.buscaBinaria(21));
        System.out.println("Busca binária por 100: " + vetor.buscaBinaria(100));
        
        // Teste inserir no início
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
        
        // Teste inserir após valor
        lista.inserirAposValor(16, 18);
        System.out.print("Após inserir 18 após 16: ");
        lista.imprimir();

        
    }
}
