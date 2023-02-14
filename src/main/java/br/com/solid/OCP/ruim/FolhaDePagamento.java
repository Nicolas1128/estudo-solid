package br.com.solid.OCP.ruim;

public class FolhaDePagamento {

    private double saldo;

    public void calcular(String contrato) {

        ContratoCLT contratoCLT = new ContratoCLT();
        Estagio estagio = new Estagio();

        if (contrato.matches("CLT")) {
            this.saldo = contratoCLT.salario();
        } else if (contrato.matches("Estagio")){
            this.saldo = estagio.bolsaAuxilio();
        }
    }
}
