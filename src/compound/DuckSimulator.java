package compound;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountDuckFactory();
		simulator.simulate(duckFactory);
	}

	private void simulate(AbstractDuckFactory duckFactory) {
		// TODO Auto-generated method stub
		I_Quackable duck1 = duckFactory.createDuck1();
		I_Quackable duck2 = duckFactory.createDuck2();
		I_Quackable gooseDuck = new GooseAdapter(new Goose());
		
		Flock flockofDucks = new Flock();
		flockofDucks.add(duck1);
		flockofDucks.add(duck2);
		flockofDucks.add(gooseDuck);
		
//		System.out.println("Duck Simulator");
//		simulate(flockofDucks);
//		
//		System.out.println("Ducks quacked "+QuackCounter.getQuacks()+" times");
		
		System.out.println("Duck Simulator with Obsever");
		Quackist quackist = new Quackist();
		flockofDucks.registerObserver(quackist);
		
		simulate(flockofDucks);
	}

	private void simulate(I_Quackable duck) {
		// TODO Auto-generated method stub
		duck.quack();
	}

}
