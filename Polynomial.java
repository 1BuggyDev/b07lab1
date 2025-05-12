class Polynomial {
	public double[] coefficients;
	
	public Polynomial() {
		coefficients = new double[1];
	}

	public Polynomial(double[] coefficients) {
		this.coefficients = coefficients;
	}

	public Polynomial add(Polynomial other) {
		if(coefficients.length < other.coefficients.length) {
			for(int i = 0; i < coefficients.length; i++) {
				other.coefficients[i] += coefficients[i];
			}
			return other;
		} else {
			for(int i = 0; i < other.coefficients.length; i++) {
				coefficients[i] += other.coefficients[i];
			}
			return this;
		}
	}
	public double evaluate(double x) {
		double sum = 0.0;
		for(int i = 0; i < coefficients.length; i++) {
			double multiplier = 1.0;
			for(int j = 0; j < i; j++) {
				multiplier *= x;
			}
			sum += multiplier * coefficients[i];
		}
		return sum;
	} 
	public boolean hasRoot(double x) {
		return evaluate(x) == 0.0;
	}
}