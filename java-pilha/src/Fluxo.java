public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();        	
        } catch(ArithmeticException | NullPointerException | MinhaException ex) {
        	String msg = ex.getMessage();
        	System.out.println("Exception message: " + msg);
        	System.out.println("Rastro da exceção: ");
        	ex.printStackTrace();
        System.out.println("Fim do main");
        }
    }

    private static void metodo1() throws MinhaException {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
 
    //A classe MinhaException extende diretamente a classe Exception
    private static void metodo2() throws MinhaException {
        System.out.println("Ini do metodo2");
        
        throw new MinhaException("Deu erro!");
        
//        System.out.println("Fim do metodo2");
    }
}