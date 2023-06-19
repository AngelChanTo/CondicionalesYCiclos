package condicionalesYCiclos;
import java.util.Scanner;
public class condicionalesYCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Condicionales
		 * 
		 * 
		 * if
		 * else
		 * else if
		 * switch
		 */
	
	
		System.out.println("Programa para calcular la hora");
		
		Scanner valorIngresado = new Scanner(System.in);
		System.out.println("Por favor ingrese una hora en formato 24 horas: ");
		int hora= valorIngresado.nextInt();
		
		if(hora >= 0 && hora <= 23) { //hora valida 
			System.out.println("hora ingresada correctamente");
			
			
			if(hora>=7 && hora<=11) {
				System.out.println("Buenos dias solecito");
			}else if(hora>=12 && hora <=18) {
				System.out.println("Buenas tardes");
			}else if(hora>=19 && hora <=24) {
				System.out.println("Buenas noches");
			}else {
				System.out.println("Es de madrugada");
			}
		}else {
			System.out.println("hora no valida");
		}
	valorIngresado.close();
	
	//condicional switch
		int opcion = 1;
		switch(opcion) {
		
		case 1:
			System.out.println("Bienvenido al servicio de reservas");
			break;
		case 2:
			System.out.println("Bienvenido al servicio de check-in");
			break;
		case 3:
			System.out.println("Bienvenido al servicio de check-out");
			break;
		default:
			System.out.println("opcion invalida");
			break;
		}
	
	}
	

}
