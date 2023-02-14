package br.com.solid.ISP.ruim;

public class Pinguim implements Aves {

    @Override
    public String setLocalizacao(String longitude, String latitude) {
        return null;
    }

    @Override
    public String setAltitude(String altitude) {
        return null;
        //        Não faz nada, pois Pinguins não voam
    }

    @Override
    public String renderizar() {
        return null;
    }
}
