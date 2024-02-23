package predfined_functional_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateDemo {

	public static void main() {

		Predicate<Integer> predicate = new Predicate() {
			@Override
			public boolean test(Object t) {
				return false;
			}
		};
	}

	Consumer<Integer> consumer = new Consumer() {
		@Override
		public void accept(Object t) {

		}
	};
	
	Function<Integer, String> f= new Function<Integer, String>(){
		@Override
		public String apply(Integer t) {
			// TODO Auto-generated method stub
			return null;
		}	
	};
	
	Supplier<Integer> s= new Supplier<Integer>() {	
		@Override
		public Integer get() {
			return null;
		}
	};

}
