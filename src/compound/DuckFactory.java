package compound;

public class DuckFactory extends AbstractDuckFactory {

	@Override
	public I_Quackable createDuck1() {
		// TODO Auto-generated method stub
		return new Duck1();
	}

	@Override
	public I_Quackable createDuck2() {
		// TODO Auto-generated method stub
		return new Duck2();
	}

}
