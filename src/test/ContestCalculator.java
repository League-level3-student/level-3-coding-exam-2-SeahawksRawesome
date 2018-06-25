package test;

import java.util.ArrayList;

public class ContestCalculator {

	public ArrayList<Double> calculateWinner(ArrayList<Double> wyateErpsNuggets,
			ArrayList<Double> butchCassidaysNuggets) {

		double addyBoi = 0.0;
		double totyBoi = 0.0;

		double addyBoib = 0.0;
		double totyBoib = 0.0;

		for (int i = 0; i < wyateErpsNuggets.size(); i++) {
			addyBoi = wyateErpsNuggets.get(i);
			totyBoi += addyBoi;
		}
		for (int i = 0; i < butchCassidaysNuggets.size(); i++) {
			addyBoib = butchCassidaysNuggets.get(i);
			totyBoib += addyBoib;
		}
		if (totyBoib > totyBoi) {
			return butchCassidaysNuggets;
		} else {
			return wyateErpsNuggets;
		}

	}
}
