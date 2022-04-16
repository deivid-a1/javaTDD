package com.sistemabancario.model;

import java.util.ArrayList;
import java.util.List;

public class Conta implements Cadastro {

    private long id;
    private String numero;
    private boolean poupanca;

    private boolean especial;

    private double saldo;

    private double limite;

    private List<Movimentacao> movimentacoes = new ArrayList<>();

    public Conta() {
        // TODO: Você precisa implementar este método
    }

    public Conta(Agencia agencia, boolean especial, final double limite) {
        // TODO: Você precisa implementar este método
    }

    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    
    public void addMovimentacao(Movimentacao movimentacao) {
        // TODO: Você precisa implementar este método
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (!numero.matches("\\d{5}-\\d"))
        {
            throw new IllegalArgumentException("Formato 11111-1 não encontrado");
        }

        this.numero = numero;
    }

    public boolean isPoupanca() {
        return poupanca;
    }

    public void setPoupanca(boolean poupanca) {
        this.poupanca = poupanca;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        

        this.especial = especial;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if(!especial && limite > 0)
        {
            throw new IllegalStateException("Precisa ter conta especial para definir um limite");
        }

        this.limite = limite;
    }
}
