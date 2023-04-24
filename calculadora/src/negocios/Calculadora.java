package negocios;

public class Calculadora {
	Double num1;
	Double num2;
	Character op;

	public Calculadora(Double num1, Double num2, Character op) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}

	public Double getNum1() {
		return num1;
	}



	public void setNum1(Double num1) {
		this.num1 = num1;
	}



	public Double getNum2() {
		return num2;
	}



	public void setNum2(Double num2) {
		this.num2 = num2;
	}



	public char getOp() {
		return op;
	}



	public void setOp(char op) {
		this.op = op;
	}



	public double soma(Double num1, Double num2) {
		return num1 + num2;
	}

	public double sub(Double num1, Double num2) {
		return num1 - num2;
	}

	public double div(Double num1, Double num2) {
		return num1 / num2;
	}

	public double mult(Double num1, Double num2) {
		return num1 * num2;
	}

}
