package org.example;

public class Main {
    public static void main(String[] args) {
    //posso chamar no main , usando Sout ServClassD() e servClassA()

           // System.out.println ("Valor percentual: " + processo(120,20));
        }

        //2.Os métodos são repetidos, os 4 por exemplo somam taxa de serviço e hospedagem. Podemos então:

   //2.criar um método que calcula taxa de serviçoBD com acesso ao BD, e subistitui pela taxa de serviço de 10 que esta sendo retornada.
   // 2.para facilitar ainda mais, pode criar variaveis com os valores globais no main e chamar o retorno do método : exemplo taxaserviço, café, almoço e janta.
   //Se quiser simplificar ainda mais, dá para fazer todas chamadas de serviços, em uma classe só.Criando um único método serviço., e retornaria a classe em si, com uso de if.
    //
    public static int ServClasseD(){
        //2 Acessa o BD
        //2 TaxaServ + Hosp
        return 10+350;
    }

    public static int ServClasseC(){
        //2 TaxaServ + Hosp + Cafe + Almoço
        return 10+350+30+70;
    }
    public static int ServClasseB(){
        //2 TaxaServ + Hosp + Cafe + Almoço + Janta
        return 10+350+30+70+80;
    }

    public static int ServClasseA(){
        //2 TaxaServ + Hosp + Cafe + Almoço + Janta + VIP
        return 10+350+30+70+80+500;
    }








    //1. Problema numero um: A nomeclatura do método, não está clara. Sugestão CalcularPercentual ao invés de processo.
    //1. Problema dois idenditificar com o p, que é um parametro e colocar algo menos generico em x exemplo: Valor base e valor percentual.
    public static double processo(double x, double y)
        {
            //1.Problema três: não a nescessidade de repetir várias vezes resultado, pois da pra retornar direto o calculo
            double resultado = 0;
            resultado = x * (y/100);
            return resultado;
        }

    }


