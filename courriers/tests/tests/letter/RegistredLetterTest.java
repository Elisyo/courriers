package tests.letter;

import courriers.entities.Inhabitant;
import courriers.letter.Letter;
import courriers.letter.RegisteredLetter;

public class RegistredLetterTest<L extends Letter<?>> extends DecoratingLetterTest<L>{

	@Override
	protected RegisteredLetter<MockLetter> createLetter(Inhabitant sender, Inhabitant receiver) {
		// TODO Auto-generated method stub
		return new RegisteredLetter<MockLetter>(mockletter);
	}

}
