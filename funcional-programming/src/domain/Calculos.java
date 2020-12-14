package domain;

public class Calculos {
		
	public int arraySum(int[] array,int inicio) {
		int soma=0;
		if(inicio>=array.length)
			return 0;
		else		
		return array[inicio]+ arraySum(array,inicio+1); 	
	}
	
	public static void main(String[] args) {
		int[]vector = {1,2,3};
		Calculos  calculos = new Calculos();
		System.out.println(calculos.arraySum(vector, 0));	
	}

}
