/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author CAMILO
 */
public class Estructura {

    private double valor;
    private double res;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    private double factorial1(double valor) {
        if (this.valor == 0) {
            return 1;
        } else {
            return this.valor * factorial1(this.valor - 1);
        }
    }

    public void factorialConRecursividad(double valor) {
        this.res = factorial1(valor);
    }

    public double factorial2(double valor) {
        double aux = 0;
        aux = valor;
        valor = 1;

        for (int i = 2; i <= aux; i++) {
            valor = valor * i;
        }
        return valor;
    }

    public void factorialSinRecursividad(double valor) {
        this.res = factorial2(valor);
    }

    public double resultado() {
        return res;
    }

}
