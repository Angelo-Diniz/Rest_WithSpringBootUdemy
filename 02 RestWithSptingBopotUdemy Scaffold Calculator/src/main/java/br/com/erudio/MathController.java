package br.com.erudio;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.UnsuportedMathOperationException;

@RestController
public class MathController {
	
	private Operations op = new Operations();
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		
		
		if(!Utilitarios.isNumeric(numberOne) || !Utilitarios.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("PLease set a numeric value!!"); 
		}
		
		Double sum = op.sum(Utilitarios.convertToDouble(numberOne) , Utilitarios.convertToDouble(numberTwo)); 
		
		return sum;
	}
	
	@RequestMapping(value="/sub/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!Utilitarios.isNumeric(numberOne) || !Utilitarios.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("PLease set a numeric value!!"); 
		}
		
		Double sub = op.sub(Utilitarios.convertToDouble(numberOne) , Utilitarios.convertToDouble(numberTwo)); 
		
		return sub;
	}
	
	@RequestMapping(value="/div/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!Utilitarios.isNumeric(numberOne) || !Utilitarios.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("PLease set a numeric value!!"); 
		}
		
		Double div = op.div(Utilitarios.convertToDouble(numberOne) , Utilitarios.convertToDouble(numberTwo)); 
		
		return div;
	}
	
	@RequestMapping(value="/mul/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double mul(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!Utilitarios.isNumeric(numberOne) || !Utilitarios.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("PLease set a numeric value!!"); 
		}
		
		Double mul = op.mult(Utilitarios.convertToDouble(numberOne) , Utilitarios.convertToDouble(numberTwo)); 
		
		return mul;
	}
	
	@RequestMapping(value="/med/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double med(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!Utilitarios.isNumeric(numberOne) || !Utilitarios.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("PLease set a numeric value!!"); 
		}
		
		Double med = op.media(Utilitarios.convertToDouble(numberOne) , Utilitarios.convertToDouble(numberTwo)); 
		
		return med;
	}
	
	@RequestMapping(value="/rad/{numberOne}", method=RequestMethod.GET)
	public Double rad(@PathVariable("numberOne") String numberOne) throws Exception {
		
		if(!Utilitarios.isNumeric(numberOne)) {
			throw new UnsuportedMathOperationException("PLease set a numeric value!!"); 
		}
		
		Double rad = op.rad(Utilitarios.convertToDouble(numberOne)); 
		
		return rad;
	}
	
}


// ?number1=1&number2=4