public class ListaDuplamenteEncadeada {
    private No inicio;
    private No fim;
    private int tamanho;

    private class No {
        Integer valor;
        No anterior;
        No proximo;

        public No(Integer valor) {
            this.valor = valor;
            this.anterior = null;
            this.proximo = null;
        }
    }

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    // EXERCÍCIO 02: Inserir no final da lista
    public void inserirNoFinal(Integer valor) {
        No novoNo = new No(valor);
        
        if (this.inicio == null) {
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            novoNo.anterior = this.fim;
            this.fim.proximo = novoNo;
            this.fim = novoNo;
        }
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void inserirAposValor(Integer valorBusca, Integer valorInserir) {
        No atual = this.inicio;
        
        while (atual != null) {
            if (atual.valor.equals(valorBusca)) {
                No novoNo = new No(valorInserir);
                
                novoNo.anterior = atual;
                novoNo.proximo = atual.proximo;
                
                if (atual.proximo != null) {
                    atual.proximo.anterior = novoNo;
                } else {
                    this.fim = novoNo;
                }
                
                atual.proximo = novoNo;
                this.tamanho++;
                return;
            }
            atual = atual.proximo;
        }
        
        System.out.println("Valor " + valorBusca + " não encontrado na lista");
    }

    public void imprimir() {
        No atual = this.inicio;
        System.out.print("[");
        while (atual != null) {
            System.out.print(atual.valor);
            if (atual.proximo != null) {
                System.out.print(", ");
            }
            atual = atual.proximo;
        }
        System.out.println("]");
    }

    public void imprimirReverso() {
        No atual = this.fim;
        System.out.print("[");
        while (atual != null) {
            System.out.print(atual.valor);
            if (atual.anterior != null) {
                System.out.print(", ");
            }
            atual = atual.anterior;
        }
        System.out.println("]");
    }
}
