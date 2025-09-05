public class Iterador {
    private ListaDuplamenteEncadeada.No atual;
    private ListaDuplamenteEncadeada lista;

    public Iterador(ListaDuplamenteEncadeada lista) {
        this.lista = lista;
        this.atual = lista.inicio;
    }

    public boolean temProximo() {
        return atual != null;
    }

    public Integer proximo() {
        if (atual == null) {
            return null;
        }
        Integer valor = atual.valor;
        atual = atual.proximo;
        return valor;
    }

    public void inserirAposAtual(Integer valor) {
        if (atual == null) {
            System.out.println("Iterador não está em uma posição válida");
            return;
        }

        ListaDuplamenteEncadeada.No novoNo = lista.new No(valor);
        novoNo.anterior = atual;
        novoNo.proximo = atual.proximo;

        if (atual.proximo != null) {
            atual.proximo.anterior = novoNo;
        } else {
            lista.fim = novoNo;
        }

        atual.proximo = novoNo;
        lista.tamanho++;
    }

    public void removerAposAtual() {
        if (atual == null || atual.proximo == null) {
            System.out.println("Não há elemento após o atual para remover");
            return;
        }

        ListaDuplamenteEncadeada.No noRemover = atual.proximo;

        if (noRemover.proximo != null) {
            noRemover.proximo.anterior = atual;
        } else {
            lista.fim = atual;
        }

        atual.proximo = noRemover.proximo;
        lista.tamanho--;
    }

    public void inserirAntesDoAtual(Integer valor) {
        if (atual == null) {
            System.out.println("Iterador não está em uma posição válida");
            return;
        }

        ListaDuplamenteEncadeada.No novoNo = lista.new No(valor);
        novoNo.proximo = atual;
        novoNo.anterior = atual.anterior;

        if (atual.anterior != null) {
            atual.anterior.proximo = novoNo;
        } else {
            lista.inicio = novoNo;
        }

        atual.anterior = novoNo;
        lista.tamanho++;
    }

    public void removerAntesDoAtual() {
        if (atual == null || atual.anterior == null) {
            System.out.println("Não há elemento antes do atual para remover");
            return;
        }

        ListaDuplamenteEncadeada.No noRemover = atual.anterior;

        if (noRemover.anterior != null) {
            noRemover.anterior.proximo = atual;
        } else {
            lista.inicio = atual;
        }

        atual.anterior = noRemover.anterior;
        lista.tamanho--;
    }
}