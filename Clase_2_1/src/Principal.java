public class Principal {
    public static void main(String[] args) throws Exception {
        Automovil el_auto_fantastico = new Automovil("KIIT", "Pontiac", "Firebird Trans Am",
                                        "ABC1234","Sebastian", 5);
        
        System.out.println(el_auto_fantastico.getPlaca().length());

        Automovil batimovil = new Automovil("QUI", "bat", "unique", "power", "Bruno dias", 2);
        System.out.println(batimovil.getPlaca());
        batimovil.setPlaca("QUIAAA");
        System.out.println(batimovil.getPlaca());
    }
}
