public class Figura {
  public Figura(int xx, int, yy) {
    x = xx;
    y = yy;
  }
  public void mova(int xx, int yy) {
    apague();
    setValores(xx,yy);
    desenhe();
  }

  public void desenhe() {}
  public void apague() {}
  public void setValores(int xx, int yy) {}

  private x, y;
}

public class Circulo extends Figura {
  public Circulo(int xx, int yy, int rr) {
    raio = rr;
    super(xx, yy);
  }
  public void setValores(int xx, int yy) {
    x = xx;
    y = yy;
  }

  public void desenhe() {}
  public void apague() {}

  public int raio;
}

public class Principal {
  public static void main(String[] args) {
    Figura f = new Circulo(100, 100, 30);
    f.desenhe();
    f.mova(300, 300);
  }
}
