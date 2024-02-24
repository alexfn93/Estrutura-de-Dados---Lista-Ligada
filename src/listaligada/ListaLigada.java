/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaligada;

/**
 * @author alexf
 */
class ListaLigada {

    No primeiro, ultimo;

    ListaLigada() {
        primeiro = null;
        ultimo = null;
    }

    public boolean ListaVazia() {

        if (primeiro == null && ultimo == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Destruir() {

        primeiro = null;
        ultimo = null;
    }

    public int ContarNos() {

        int tamanho = 0;
        No NoTemp = primeiro;

        while (NoTemp != null) {
            tamanho = tamanho + 1;
            NoTemp = NoTemp.prox;
        }
        return tamanho;
    }

    public void MostraLista() {
        int i = 1;
        No NoTemp = primeiro;

        while (NoTemp != null) {

            System.out.println("Elemento " + NoTemp.elemento + " posição " + i);

            NoTemp = NoTemp.prox;
            i = i + 1;
        }
    }

    public void ElementoInicio() {

        if (!ListaVazia()) {
            System.out.println("Lista Ligada Vazia");
        }
    }

    public void ElementoFinal() {

        if (!ListaVazia()) {
            System.out.println("O último elemento é " + ultimo.elemento);
        } else {
            System.out.println("Lista Ligada Vazia");
        }
    }

    public void InserirInicio(No novoNo) {

        if (ListaVazia()) {
            ultimo = novoNo;
        } else {
            novoNo.prox = primeiro;
        }
        primeiro = novoNo;
    }

    public void InserirFinal(No novoNo) {
        if (ListaVazia()) {
            primeiro = novoNo;
        } else {
            ultimo.prox = novoNo;
        }
        ultimo = novoNo;
    }
}
