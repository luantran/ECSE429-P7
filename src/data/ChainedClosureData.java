package data;

import org.apache.commons.collections4.Closure;

public class ChainedClosureData {
	public Closure<Integer> getClosureIncrement() {
		Closure<Integer> closure = new Closure<Integer>() {

			@Override
			public void execute(Integer input) {
				input+=1;
			}
		};
		
		return closure;
		
	}
	
	public Closure<Integer> getClosureIncrementBy2() {
		Closure<Integer> closure = new Closure<Integer>() {

			@Override
			public void execute(Integer input) {
				input+=2;
			}
		};
		
		return closure;
		
	}

}
