package compound;

public class CountDuckFactory extends AbstractDuckFactory {

	@Override
	public I_Quackable createDuck1() {
		// TODO Auto-generated method stub
		return new QuackCounter(new Duck1());
	}

	@Override
	public I_Quackable createDuck2() {
		// TODO Auto-generated method stub
		return new QuackCounter(new Duck2());
	}

}
