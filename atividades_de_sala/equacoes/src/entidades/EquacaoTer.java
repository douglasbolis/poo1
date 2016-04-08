package entidades;

public class EquacaoTer {
    private double a, b, c, d;
    private double x1, x2, x3;    
    private double r, q, s, t, discrim, dum1, term1, r13;
    private double x11=0, x22=0, x33=0;

    public void setCoeficientes(double a, double b, double c, double d) {
    	this.a = a;
    	this.b = b;
    	this.c = c;
    	this.d = d;
    }

    public resolveEquacao() {
        this.x1 = 0;  //A primeira raiz é sempre real.
        this.term1 = (this.b/3.0);

        if (this.discrim > 0) {
        // uma real, duas imaginarias   
            discrimPos();
        } else if (this.discrim == 0) {
        // todas as raizes sao reais.
            discrimZer();
        } else {
        // todas as raizes sao reais e distintas (q < 0)
            discrimNeg();
        }
    }

    private double resolveDiscrim() {
        this.b /= this.a;
        this.c /= this.a;
        this.d /= this.a;

        this.q = (3*this.c - (this.b*this.b))/9;
        this.r = -(27*this.d) + this.b*(9*this.c - 2*(this.b*this.b));
        this.r /= 54;

        this.discrim = q*q*q + r*r;
    }

    private void discrimPos() {
        this.s = this.r + Math.sqrt(this.discrim);
        this.s = (this.s < 0) ? -Math.cbrt(-this.s) : Math.cbrt(this.s);
        this.t = this.r - Math.sqrt(this.discrim);
        this.t = (this.t < 0) ? -Math.cbrt(-this.t) : Math.cbrt(this.t);

        this.x1= -this.term1 + this.s + this.t;
        this.term1 += (this.s + this.t)/2.0;
        this.x33 = this.x22 = -this.term1; //parte real
        this.term1 = Math.sqrt(3.0)*(-this.t + this.s)/2;
        this.x2 = this.term1;
        this.x3 = -this.term1;
    }

    private void discrimZer() {
        this.r13 = (this.r < 0) ? -Math.cbrt(-this.r) : Math.cbrt(this.r);
        this.x1 = -this.term1 + 2.0*this.r13;
        this.x3 = this.x2 = -(this.r13 + this.term1);
    }

    private void discrimNeg() {
        this.q = -this.q;
        this.dum1 = this.q*this.q*this.q;
        this.dum1 = Math.acos(this.r/Math.sqrt(this.dum1));

        this.r13 = 2.0*Math.sqrt(this.q);
        this.x1 = -this.term1 + this.r13*Math.cos(this.dum1/3.0);
        this.x2 = -this.term1 + this.r13*Math.cos((this.dum1 + 2.0*Math.PI)/3.0);
        this.x3 = -this.term1 + this.r13*Math.cos((this.dum1 + 4.0*Math.PI)/3.0);
    }

    public double getDiscrim() {
        return this.discrim;
    }

    public double getX1() {
        return this.x1;
    }

    public double getX2() {
        return this.x2;
    }

    public double getx3() {
        return this.x3;
    }

    public double getX11() {
        return this.x11;
    }

    public double getX22() {
        return this.x22;
    }

    public double getx33() {
        return this.x33;
    }
}
