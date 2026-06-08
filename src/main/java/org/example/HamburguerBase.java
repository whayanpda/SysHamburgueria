package org.example;

class HamburguerBase implements ItemCardapio {
    private String pao;
    private String carne;

    public HamburguerBase(String pao, String carne) {
        this.pao = pao;
        this.carne = carne;
    }

    public String getDescricao() { return "Burger (" + pao + " + " + carne + ")"; }
    public double getPreco() { return 22.00; }
}
