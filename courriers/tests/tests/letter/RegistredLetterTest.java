package tests.letter;

import courriers.entities.Inhabitant;
import courriers.letter.Letter;
import courriers.letter.SpecialLetter;
import courriers.letter.RegisteredLetter;

public class RegistredLetterTest<L extends Letter<?>> extends DecoratingLetterTest<Letter<?>>{

	@Override
	protected SpecialLetter<Letter<?>> createLetter(Inhabitant sender, Inhabitant receiver) {
		// TODO Auto-generated method stub
		return new RegisteredLetter<>(mockletter);
	}

}
