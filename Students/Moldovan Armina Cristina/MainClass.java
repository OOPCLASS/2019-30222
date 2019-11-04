import java.util.Iterator;

public class MainClass extends ImplementIterator {
	public static void main(String[] args) {
		// paragraf 1
		ImplementIterator implementIterator = new ImplementIterator();
		System.out.println("values with for: ");
		for (String nextValue : implementIterator.getCards()) {
			System.out.print(nextValue + " ");
		}

		System.out.println("\nvalues with iterator: ");
		while (implementIterator.hasNext()) {
			String nextValue = implementIterator.next();
			System.out.print(nextValue + " ");
		}

		// paragraf 2
		ImplementIterator2 implementIterator2 = new ImplementIterator2();

		Card first = new Card();
		first.setNumber(1);
		first.setSuit("a");
		implementIterator2.put(first);

		Card second = new Card();
		second.setNumber(2);
		second.setSuit("b");
		implementIterator2.put(second);

		Card third = new Card();
		third.setNumber(1);
		third.setSuit("a");
		implementIterator2.put(third);

		System.out.println("\nvalues with iterator: ");
		while (implementIterator2.hasNext()) {
			Card card = implementIterator2.next();
			System.out.print(card);
		}
	}
}
