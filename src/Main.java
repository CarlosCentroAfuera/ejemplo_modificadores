public class Main {

    public static void main(String[] args) {
        sumandoNumerosFamosos();
        sumandoNumerosFamososDeFormaEstatica();
        sumandoNumerosFamososDeFormaMixta();
    }

    private static void sumandoNumerosFamosos(){
        System.out.println("Sumando numeros famosos");
        int numero1 = 1;
        int numero2 = 2;
        SumarNumerosFamosos sumarNumerosFamosos = new SumarNumerosFamosos();
        sumarNumerosFamosos.cambiarValorPi();
        float resultado1 = sumarNumerosFamosos.sumarE(numero1);
        float resultado2 = sumarNumerosFamosos.sumarPi(numero2);
        System.out.println("Si al numero " + numero1 + ", le sumamos E, el resultado es " + resultado1);
        System.out.println("Si al numero " + numero2 + ", le sumamos Pi, el resultado es " + resultado2);

        SumarNumerosFamosos sumarNumerosFamosos2 = new SumarNumerosFamosos();
        float resultado3 = sumarNumerosFamosos2.sumarE(numero1);
        float resultado4 = sumarNumerosFamosos2.sumarPi(numero2);
        System.out.println("Si al numero " + numero1 + ", le sumamos E, el resultado es " + resultado3);
        System.out.println("Si al numero " + numero2 + ", le sumamos Pi, el resultado es " + resultado4);


    }

    private static void sumandoNumerosFamososDeFormaEstatica(){
        System.out.println("Sumando numeros famosos de forma estática");
        int numero1 = 1;
        int numero2 = 2;

        SumarNumerosFamososDeFormaEstatica sumarNumerosFamosos1 = new SumarNumerosFamososDeFormaEstatica();

        sumarNumerosFamosos1.cambiarValorPi();
        float resultado1 = sumarNumerosFamosos1.sumarE(numero1);
        float resultado2 = sumarNumerosFamosos1.sumarPi(numero2);
        System.out.println("Si al numero " + numero1 + ", le sumamos E, el resultado es " + resultado1);
        System.out.println("Si al numero " + numero2 + ", le sumamos Pi, el resultado es " + resultado2);

        SumarNumerosFamososDeFormaEstatica sumarNumerosFamosos2 = new SumarNumerosFamososDeFormaEstatica();

        float resultado3 = sumarNumerosFamosos2.sumarE(numero1);
        float resultado4 = sumarNumerosFamosos2.sumarPi(numero2);
        System.out.println("Si al numero " + numero1 + ", le sumamos E, el resultado es " + resultado3);
        System.out.println("Si al numero " + numero2 + ", le sumamos Pi, el resultado es " + resultado4);
    }

    private static void sumandoNumerosFamososDeFormaMixta(){
        System.out.println("Sumando numeros famosos de forma mixta");
        int numero1 = 1;
        int numero2 = 2;
        float resultado1 = SumarNumerosFamososDeFormaMixta.sumarE(numero1);
        // al sumarPi no ser estática
        // float resultado2 = SumarNumerosFamososDeFormaMixta.sumarPi(numero2);
        // por tanto habría que crear un objeto
        SumarNumerosFamososDeFormaMixta sumarNumerosFamososDeFormaMixta = new SumarNumerosFamososDeFormaMixta();
        float resultado2 = sumarNumerosFamososDeFormaMixta.sumarPi(numero2);
        System.out.println("Si al numero " + numero1 + ", le sumamos E, el resultado es " + resultado1);
        System.out.println("Si al numero " + numero2 + ", le sumamos Pi, el resultado es " + resultado2);
    }
}
