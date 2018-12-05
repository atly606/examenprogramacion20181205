package fp.daw.examen;



public class Ejercicio5 {

	/* 
	 * 2,5 puntos
	 * 
	 * Escribe en el método 'main' un programa que obtenga el desglose en billetes
	 * y monedas de una cantidad exacta de euros que el usuario introducirá por teclado.
	 * Hay billetes de 500, 200, 100, 50, 20, 10 y 5 euros y monedas de 1 y 2 euros.
	 * Por ejemplo, si deseamos conocer el desglose de 434 euros, el programa mostrará
	 * por pantalla el siguiente resultado:
	 * 
	 * 		2 billetes de 200 euros.
	 * 		1 billete de 20 euros.
	 * 		1 billete de 10 euros.
	 * 		2 monedas de 2 euros.
	 * 
	 * Una vez ejecutado el programa, el usuario podrá realizar tantos desgloses como
	 * desee hasta que decida finalizar su ejecución. 
	 * El programa comprobará que la cantidad introducida sea una cantidad positiva
	 * mayor que 0. En caso contrario mostrará un mensaje de error y volverá a pedirla.
	 */
	
	public static void main(String[] args) {
		int cant=434;
		int dinero[]= new int [9];
		int i=0;
		while(cant>0) {
			while(cant-500>=0){
				cant=cant-500;
				dinero[0]++;
			}
			while(cant-200>=0){
				cant=cant-200;
				dinero[2]++;
			}
			while(cant-100>=0){
				cant=cant-100;
				dinero[0]++;
			}
			while(cant-50>=0) {
				cant=cant-50;
				dinero[0]++;
			}
			while(cant-20>=0){
				cant=cant-20;
				dinero[1]++;
			}
			while(cant-10>=0){
				cant=cant-10;
				dinero[1]++;
			}
			while(cant-5>=0){
				cant=cant-5;
				dinero[0]++;			
			}
			while(cant-2>=0){
				cant=cant-2;
				dinero[2]++;
			}
			while(cant-1>=0){
				cant=cant-1;
				dinero[0]++;
			}
			for(i=0; i<9; i++){
				if(i==0)
				System.out.println(dinero[i]+ " billetes de 500");
				if(i==1)
					System.out.println(dinero[i]+ " billetes de 200");
				if(i==2)
					System.out.println(dinero[i]+ " billetes de 100");
				if(i==3)
					System.out.println(dinero[i]+ " billetes de 50");
				if(i==4)
					System.out.println(dinero[i]+ " billetes de 20");
				if(i==5)
					System.out.println(dinero[i]+ " billetes de 10");
				if(i==6)
					System.out.println(dinero[i]+ " billetes de 5");
				if(i==7)
					System.out.println(dinero[i]+ " monedas de 2");
				if(i==8)
					System.out.println(dinero[i]+ " monedas de 1");
			}
		}
	}
}
	   