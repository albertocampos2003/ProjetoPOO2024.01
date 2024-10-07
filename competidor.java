package poojogo;

import java.awt.Color;

public class Competidor extends Elemento {
    private String nome;
    private int frutasNaMochila;
    private int posX, posY;
    private int pontosDeMovimento;
    private Color cor;
    private int turnosNaArvore;

    public Competidor(String nome, int pontosDeMovimento, Color cor) {
        this.nome = nome;
        this.frutasNaMochila = 0;
        this.pontosDeMovimento = pontosDeMovimento;
        this.posX = 0;
        this.posY = 0;
        this.cor = cor;
        this.turnosNaArvore = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public Color getCor() {
        return cor;
    }

    public void setPosicao(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    public int getPontosDeMovimento() {
        return pontosDeMovimento;
    }

    public void reduzirPontos(int pontos) {
        pontosDeMovimento -= pontos;
    }

    public int getFrutasNaMochila() {
        return frutasNaMochila;
    }

    public void adicionarFruta() {
        frutasNaMochila++;
    }

    public void consumirFruta() {
        frutasNaMochila = Math.max(frutasNaMochila - 1, 0);
    }

    public boolean podeColherFrutaDaArvore() {
        return turnosNaArvore >= 5;
    }

    public void incrementarTurnosNaArvore() {
        turnosNaArvore++;
    }

    public void resetarTurnosNaArvore() {
        turnosNaArvore = 0;
    }

    public int calcularForca() {
        return frutasNaMochila;
    }

    public void moverPara(int novoX, int novoY) {
        setPosicao(novoX, novoY);
        reduzirPontos(1);
    }

    public String getRepresentacao() {
        return "C"; // Representação visual do competidor
    }
}
