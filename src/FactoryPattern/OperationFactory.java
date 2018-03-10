package FactoryPattern;

public class OperationFactory {
	
	private static Operation ope = null;
	
	public static Operation CreateOperation(String operate){
		
		switch(operate){
		
		case "+" :
			ope = new OperationAdd();
			break;
		case "-" :
			ope = new OperationSub();
			break;
		case "*" :
			ope = new OperationMul();
			break;
		case "/" :
			ope = new OperationDiv();
			break;
			
		}
		
		return ope;
		
	}
	
}
