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

/*
OUTPUT
c0 arrived
c1 arrived
c2 arrived
Barber goes to sleep
c0 gets a seat in waitingroom
c0 was invited by barber
c0 leaves waitingroom
c0 is seated in barber chair
barber cuts c0
c2 gets a seat in waitingroom
c0 leaves the barbershop
c0 arrived
c2 was invited by barber
c2 leaves waitingroom
c2 is seated in barber chair
barber cuts c2
Barber goes to sleep
c2 leaves the barbershop
c2 arrived
c1 gets a seat in waitingroom
c1 was invited by barber
c1 leaves waitingroom
c1 is seated in barber chair
barber cuts c1
Barber goes to sleep
c1 leaves the barbershop
c1 arrived
c0 gets a seat in waitingroom
c0 was invited by barber
c0 leaves waitingroom
c0 is seated in barber chair
barber cuts c0
Barber goes to sleep
c0 leaves the barbershop
c0 arrived
c0 gets a seat in waitingroom
c0 was invited by barber
c0 leaves waitingroom
c0 is seated in barber chair
barber cuts c0
c0 leaves the barbershop
c0 arrived
Barber goes to sleep
c2 gets a seat in waitingroom
c2 was invited by barber
c2 leaves waitingroom
c2 is seated in barber chair
barber cuts c2
Barber goes to sleep
c2 leaves the barbershop
c2 arrived
c2 gets a seat in waitingroom
c2 was invited by barber
c2 leaves waitingroom
c2 is seated in barber chair
barber cuts c2
c1 gets a seat in waitingroom
c2 leaves the barbershop
*/