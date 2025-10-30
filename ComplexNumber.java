class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(final double real, final double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public ComplexNumber plus(final ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber sub(final ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    public ComplexNumber times(final ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber div(final ComplexNumber other) {
        final double commonDenominator = other.getReal() * other.getReal() + other.getImaginary() * other.getImaginary();
        final double realNumerator = this.getReal() * other.getReal() + this.getImaginary() * other.getImaginary();
        final double imaginaryNumerator = other.getReal() * this.getImaginary() - this.getReal() * other.getImaginary();
        return new ComplexNumber(realNumerator / commonDenominator, imaginaryNumerator / commonDenominator);
    }
    @Override
    public String toString() {
    return this.real + " + " + this.imaginary + "i";
}
}