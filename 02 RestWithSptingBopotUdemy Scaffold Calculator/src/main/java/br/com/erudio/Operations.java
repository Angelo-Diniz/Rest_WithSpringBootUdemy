package br.com.erudio;


public class Operations {
	
	public Double sum(Double firstNumber, Double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public Double sub(Double firstNumber, Double secondNumber) {
		return firstNumber - secondNumber;
	}

	
	public Double div(Double firstNumber, Double secondNumber) {
		return firstNumber / secondNumber;
	}

	
	public Double mult(Double firstNumber, Double secondNumber) {
		return firstNumber * secondNumber;
	}

	
	public Double media(Double firstNumber, Double secondNumber) {
		return (firstNumber + secondNumber) / 2;
	}

	
	public Double rad(Double number) {
		return (Double) Math.sqrt(number);
	}

}
