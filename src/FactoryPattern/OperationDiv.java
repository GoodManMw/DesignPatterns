package FactoryPattern;

public class OperationDiv extends Operation{

	@Override
	public double getResult() throws Exception {
		// TODO Auto-generated method stub
		double result = 0;
		if(getNumB() == 0){
			throw new Exception("分母不能为0");
		}
		result = getNumA() / getNumB();
		return result;
	}
	
}
