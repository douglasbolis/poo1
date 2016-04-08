package fronteira;

public class Saida {	
	public static void equacaoPri(double x1Real, double x1Img){
		System.out.println();
		System.out.println("X'\n\t(Parte real): " + x1Real + "\n\t(Parte imaginaria): " + x1Img + "i\n");
	}

	public static void equacaoSeg(double x1Real, double x2Real, double x1Img, double x2Img){
		System.out.println();
		System.out.println("X'\n\t(Parte real): " + x1Real + "\n\t(Parte imaginaria): " + x1Img + "i\n");
		System.out.println("X''\n\t(Parte real): " + x2Real + "\n\t(Parte imaginaria): " + x2Img + "i\n");
	}

	public static void equacaoTer(double x1Real, double x2Real, double x3Real, double x1Img, double x2Img, double x3Img){
		System.out.println();
		System.out.println("X'\n\t(Parte real): " + x1Real + "\n\t(Parte imaginaria): " + x1Img + "i\n");
		System.out.println("X''\n\t(Parte real): " + x2Real + "\n\t(Parte imaginaria): " + x2Img + "i\n");
		System.out.println("X'''\n\t(Parte real): " + x3Real + "\n\t(Parte imaginaria): " + x3Img + "i\n");
	}
}
