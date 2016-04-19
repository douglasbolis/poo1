package fronteira;

public class Saida {
	public static void equacaoPri(double x1){
		System.out.println();
		System.out.println("X': " + x1);
	}

	public static void equacaoSeg(double x1, double x2){
		System.out.println();
		System.out.println("X' : " + x1);
		System.out.println("X'': " + x2);
	}

	public static void equacaoTer(double x1, double x2, double x3){
		System.out.println();
		System.out.println("X'  : " + x1);
		System.out.println("X'' : " + x2);
		System.out.println("X''': " + x3);
	}

	public static void equacaoTer(double x1, double x2, double x3, double x11, double x22, double x33){
		System.out.println();
		System.out.println("X'\n\t(Parte real): " + x1 + "\n\t(Parte imaginaria): " + x11 + "i\n");
		System.out.println("X''\n\t(Parte real): " + x2 + "\n\t(Parte imaginaria): " + x22 + "i\n");
		System.out.println("X'''\n\t(Parte real): " + x3 + "\n\t(Parte imaginaria): " + x33 + "i\n");
	}
}
