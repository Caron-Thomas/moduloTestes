
public class VerificadorPrimo {

    public static void main(String[] args) {

        boolean b = verificadorPrimos(255845555);
        System.out.printf("Se primo, true: ->  %s",b);

    }
    public static boolean verificadorPrimos(Integer elemento){
        return elemento % 2 == 0 ?  false : true;
    }
}
