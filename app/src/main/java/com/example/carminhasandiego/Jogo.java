package com.example.carminhasandiego;


public class Jogo {
    private static final Jogo jg = new Jogo();
    public static Anomalia anom;
    public static int estado;

    private Jogo() {
        estado=0;
        anom.dica[0] ="M";
        anom.dica[1] ="Prosa";
        anom.dica[2] ="Rio de Janeiro";
        anom.dica[3] ="Realismo";
        anom.dica[4] ="critica social";
    }

    public static Jogo getJogo() {
        return jg;
    }
    public static Anomalia getJogada() {
        return anom;
    }

    private class Anomalia {
        public String[] dica;
    }
}