package com.darsh.calculadoradegorjeta;

public class Calculadora {
    /**
     * Calcula o valor de uma gorjeta dado o valor da compra e
     * o valor do percentual de gorjeta
     * @param valor o valor da compra
     * @param percentual o percentual da gorjeta
     * @return ele retorna o valor da gorjeta
     */
    //metodo
    static double gorjeta(double valor, double percentual){
        return  valor * percentual / 100.0;
    }

//-----------------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * Calcula os valores padrão de gorjeta dado o valor
     * total da conta.
     * @param valor Valor total da conta
     * @return Um vetor de três posição com as gosrjetas 5%, 10% e 15%
     */
    //sobrecarga
    static double [] gorjeta(double valor){
        double[] saida = new double[3];
        for (int i = 0; i < 3; i++){
            saida[i] = gorjeta(valor, i + 5 + 5);
        }
        return saida;
    }

}
