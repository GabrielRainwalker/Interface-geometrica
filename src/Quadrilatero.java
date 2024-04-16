abstract class Quadrilatero implements FormaGeometrica {
    protected double l1, l2, l3, l4;
    public Quadrilatero(double l1, double l2, double l3, double l4) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
    }
    @Override
    public double calcularPerimetro() {
        return l1 + l2 + l3 + l4;
    }
}
