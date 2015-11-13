package tests.letter;

import courriers.letter.Letter;
import courriers.letter.SpecialLetter;
import courriers.content.Content;
import courriers.entities.Inhabitant;

public abstract class DecoratingLetterTest<L extends Letter<?>> extends LetterTest<Content>{
	
	MockLetter mockletter = new MockLetter(sender, receiver);

	@Override
	protected Letter<?> createLetter() {
		// TODO Auto-generated method stub
		return createLetter(sender, receiver);
	}
	
	protected abstract SpecialLetter<Letter<?>> createLetter(Inhabitant sender, Inhabitant receiver);

}
