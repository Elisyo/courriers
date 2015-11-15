package tests.letter;

import courriers.letter.Letter;
import courriers.letter.SpecialLetter;
import courriers.entities.Inhabitant;

public abstract class DecoratingLetterTest<L extends Letter<?>> extends LetterTest<MockLetter>{
	
	MockLetter mockletter = new MockLetter(sender, receiver);

	@Override
	protected Letter<?> createLetter() {
		return createLetter(sender, receiver);
	}
	
	protected abstract SpecialLetter<MockLetter> createLetter(Inhabitant sender, Inhabitant receiver);

}
