package barbershop;

public class Main {
	//Number of Barber is fixed to 1
	private static final int NR_OF_CUSTOMERS = 3;
	public static void main(String[] args) {

		Monitor barbershop = new Monitor();
		Thread [] customer;
		Thread barber;
		customer = new Thread[NR_OF_CUSTOMERS];
		
		for(int i = 0; i<NR_OF_CUSTOMERS; i++){
			customer[i] = new Customer ("c"+i, barbershop);
			customer[i].start();
		}
		barber = new Barber(barbershop);
		barber.start();
	}
}
