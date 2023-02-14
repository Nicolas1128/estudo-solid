package br.com.solid.OCP.boa;

public class FolhaDePagamento {

    private double saldo;

    public void calcular (Remuneravel contrato) {
        this.saldo = contrato.remuneracao();

    }
}
