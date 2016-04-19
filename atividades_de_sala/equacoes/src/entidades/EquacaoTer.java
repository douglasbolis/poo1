package entidades;

public class EquacaoTer {
    private Double a, b, c, d;
    private Double x1, x2, x3;
    private Double r, q, s, t, discrim, dum1, term1, r13;
    private Double x11 = 0.0, x22 = 0.0, x33 = 0.0;

    public void setCoeficientes(double aa, double bb, double cc, double dd) {
      a = aa;
      b = bb;
      c = cc;
      d = dd;
    }

    public void resolveEquacao() {
        x1 = 0.0;  //A primeira raiz é sempre real.
        term1 = (b/3.0);

        if (discrim > 0) {
        // uma real, duas imaginarias
            discrimPos();
        } else if (discrim == 0) {
        // todas as raizes sao reais.
            discrimZer();
        } else {
        // todas as raizes sao reais e distintas (q < 0)
            discrimNeg();
        }
    }

    public void resolveDiscrim() {
        b /= a;
        c /= a;
        d /= a;

        q = (3*c - (b*b))/9;
        r = -(27*d) + b*(9*c - 2*(b*b));
        r /= 54;

        discrim = q*q*q + r*r;
    }

    private void discrimPos() {
        s = r + Math.sqrt(discrim);
        s = (s < 0) ? -Math.cbrt(-s) : Math.cbrt(s);
        t = r - Math.sqrt(discrim);
        t = (t < 0) ? -Math.cbrt(-t) : Math.cbrt(t);

        x1= -term1 + s + t;
        term1 += (s + t)/2.0;
        x33 = x22 = -term1; //parte real
        term1 = Math.sqrt(3.0)*(-t + s)/2;
        x2 = term1;
        x3 = -term1;
    }

    private void discrimZer() {
        r13 = (r < 0) ? -Math.cbrt(-r) : Math.cbrt(r);
        x1 = -term1 + 2.0*r13;
        x3 = x2 = -(r13 + term1);
    }

    private void discrimNeg() {
        q = -q;
        dum1 = q*q*q;
        dum1 = Math.acos(r/Math.sqrt(dum1));

        r13 = 2.0*Math.sqrt(q);
        x1 = -term1 + r13*Math.cos(dum1/3.0);
        x2 = -term1 + r13*Math.cos((dum1 + 2.0*Math.PI)/3.0);
        x3 = -term1 + r13*Math.cos((dum1 + 4.0*Math.PI)/3.0);
    }

    public double getDiscrim() {
        return discrim;
    }

  	public double getA() {
  	    return a;
  	}

  	public double getB() {
  	    return b;
  	}

  	public double getC() {
  	    return c;
  	}

  	public double getD() {
  	    return d;
  	}

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getX3() {
        return x3;
    }

    public double getX11() {
        return x11;
    }

    public double getX22() {
        return x22;
    }

    public double getX33() {
        return x33;
    }

    public void setDiscrim(Double discriminante) {
        discrim = discriminante;
    }

    public void setX1(Double raiz1) {
        x1 = raiz1;
    }

    public void setX2(Double raiz2) {
        x2 = raiz2;
    }
}
