class Retangulo extends Quadrilatero {
    public Retangulo(double base, double altura) {
        super(base, altura, base, altura);
    }

    @Override
    public double calcularArea() {
        return l1 * l2;
    }
}
