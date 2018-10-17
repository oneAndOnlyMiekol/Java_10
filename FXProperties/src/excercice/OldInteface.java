package excercice;

import java.util.Scanner;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class OldInteface {

	public static void main(String[] args) {

		IntegerProperty first = new SimpleIntegerProperty();
		IntegerProperty second = new SimpleIntegerProperty();

		second.bind(first);
		try (Scanner input = new Scanner(System.in);) {
			first.set(input.nextInt());
			input.nextLine();

			System.out.println(second.get());

			first.set(input.nextInt());
			input.nextLine();

			System.out.println(second.get());
		}

	}

}
