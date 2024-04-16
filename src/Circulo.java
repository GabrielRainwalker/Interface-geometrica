class Circulo implements FormaGeometrica {
    protected double raio;
    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
