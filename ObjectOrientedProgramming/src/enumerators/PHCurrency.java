package enumerators;

public enum PHCurrency {
	
	PISO(1.00), 
	LIMA(5.00,"Lima"), 
	SAMPU(10), 
	BENTE(20);
	
	double pesoValue;
	String name;
	
	PHCurrency(double peso, String name){
		this.pesoValue = peso;
		this.name = name;
	}

	
	PHCurrency(double peso){		//OBJECT OVERLOADing
		this.pesoValue = peso;
	}
}
