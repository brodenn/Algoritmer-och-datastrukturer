package lab1;

public class IsEvenFunctor implements UnaryPred<Integer> {

	@Override
	public boolean pred(Integer t) {
		return t % 2 == 0;
	}

}
