/**
 * @author Nirton Afonso de Oliveira Filho
 * @matricula 201851301411
 *
 * @author Ilmar Macedo Alves Junior
 * @matricula 201851406603
 *
 * @docente Dr. Oberdan Rocha Pinheiro
 *
 */
package br.com.poo.modelo;

public class Carrinho {

    private String nomeEvento;
    private String artista;
    private String Local;
    private double valor;
    private int quantidade;
    private Data data;
    private Hora horario;

    /**
     * Construtor
     *
     * @param nomeEvento
     * @param artista
     * @param Local
     * @param valor
     * @param quantidade
     * @param data
     * @param horario
     */
    public Carrinho(String nomeEvento, String artista, String Local, double valor, int quantidade, Data data, Hora horario) {
        this.nomeEvento = nomeEvento;
        this.artista = artista;
        this.Local = Local;
        this.valor = valor;
        this.quantidade = quantidade;
        this.data = data;
        this.horario = horario;
    }

    public String getArtista() {
        return artista;
    }

    /**
     *
     * @param artista
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getLocal() {
        return Local;
    }

    /**
     *
     * @param Local
     */
    public void setLocal(String Local) {
        this.Local = Local;
    }

    public Data getData() {
        return data;
    }

    /**
     *
     * @param data
     */
    public void setData(Data data) {
        this.data = data;
    }

    public Hora getHorario() {
        return horario;
    }

    /**
     *
     * @param horario
     */
    public void setHorario(Hora horario) {
        this.horario = horario;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    /**
     *
     * @param nomeEvento
     */
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public double getValor() {
        return valor;
    }

    /**
     *
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    /**
     *
     * @param quantidade
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
