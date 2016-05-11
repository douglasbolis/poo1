public class Principal{
	public static void main(String[] args){
    Contato a,b,c,d;

    a = new Amigo();
    if (a instanceof IAmigo ) System.out.println("xuxu Beleza!");
    else  System.out.println("Michou o carbureto!");
    // Acima será impresso "xuxu Beleza!" pois a é instancia de IAmigo.

    b = new Familiar();
    if (b instanceof IAmigo ) System.out.println("xuxu Beleza!");
    else System.out.println("Michou o carbureto!");
    // Acima será impresso "Michou o carbureto!" pois a não é instancia de IAmigo.

    c = new FamiliarAmigo();
    if (c instanceof IAmigo ) System.out.println("xuxu Beleza!");
    else  System.out.println("Michou o carbureto!");

    d = new FamiliarAmigo();
    if (d instanceof IFamiliar ) System.out.println("xuxu Beleza!");
    else System.out.println("Michou o carbureto!");
    // Acima será impresso "Xuxu beleza" duas vezes pois a é tanto instancia de IAmigo quanto de IFamiliar.
	}
}
