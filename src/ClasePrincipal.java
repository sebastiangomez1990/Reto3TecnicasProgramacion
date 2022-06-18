

/**
 *
 * @author Usuario
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        System.out.println("A continuación debe ingresar ");
        Automovil miAuto = new Automovil("ijs 54e", "yamaha", "verdeazul", "una moto muy mela", "anda reduro", "un man del 12 de octubre");
        System.out.println(miAuto.tipoModelo());
    }
    
}
