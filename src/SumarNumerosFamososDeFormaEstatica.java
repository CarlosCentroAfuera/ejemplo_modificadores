public class SumarNumerosFamososDeFormaEstatica {

    private static float valorPi = 3.1416f;
    private static float valorE = 2.71828f;

    private static float sumarNumero(int numero1, float numeroFamoso){
        return numero1 + numeroFamoso;
    }

    public static float sumarPi(int numero){
        return sumarNumero(numero,valorPi);
    }

    public static float sumarE(int numero){
        return sumarNumero(numero,valorE);
    }

    public static void cambiarValorPi() {
        valorPi++;
    }
}
