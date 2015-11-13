package courriers.main;

import courriers.entities.City;
import courriers.entities.Inhabitant;
import courriers.exceptions.NotEnoughMoneyException;
import courriers.letter.Letter;
import courriers.utils.RandomGenerator;

/**
 * Launch the application with all the initializations
 * @author Loic
 *
 */
public class Main {
	
	protected static int maxInhabitants = 100;
	protected static int days=6;
	
	public static void main(String [] args){
		
		//list of inhabitants
		Inhabitant[] inhabitants= new Inhabitant[maxInhabitants];
		
		//Create the city
		City city = new City("Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch");	
		System.out.println("Creating "+city.getName()+" city");
		
		//Create the inhabitants
		for(int i=1;i<maxInhabitants+1;i++){
			inhabitants[i-1]=new Inhabitant("inhabitant-"+i,city);
		}
		System.out.println("Creating "+maxInhabitants+" habitants");
		
		//number of inhabitants who will send a letter
		int numberOfInhabitant;
		
		//the random number inhabitant (sender & receiver)
		int inhabitantSender;
		int inhabitantReceiver;
		
		//the random letter
		Letter<?> randomLetter;
		
		
		//TESST
		//SimpleLetter simple = new SimpleLetter(inhabitants[1],inhabitants[4]);

		/*UrgentLetter<SimpleLetter> let=new UrgentLetter<SimpleLetter>(simple);
		UrgentLetter<UrgentLetter> let2=new UrgentLetter<>(let);
		
		RegisteredLetter<UrgentLetter<SimpleLetter>> l= new RegisteredLetter<UrgentLetter<SimpleLetter>>(let);
		UrgentLetter<RegisteredLetter> let3=new UrgentLetter<RegisteredLetter>(l);
		*/
		//END TEST
		
		
		
		System.out.println("Mailing letters for "+days+" days");
		int actualDay;
		
		for(actualDay=1;actualDay<days+1;actualDay++){
			
			System.out.println("**********************************************");
			System.out.println("Day "+actualDay);
			
			//generate the random number of inhabitants
			numberOfInhabitant= RandomGenerator.generateRandomNumber(1, maxInhabitants);
			
			//A random inhabitant send a random letter to another random inhabitant
			for(int i =0;i<numberOfInhabitant;i++){
				
				//generate random index of inhabitants
				inhabitantSender=RandomGenerator.generateRandomNumber(1, maxInhabitants);
				inhabitantReceiver = RandomGenerator.generateRandomNumber(1, maxInhabitants);
			
				//generate a random letter type
				randomLetter=RandomGenerator.generateRandomLetter(inhabitants[inhabitantSender], inhabitants[inhabitantReceiver]);
			
				
				try {
					inhabitants[inhabitantSender].sendLetter(randomLetter);
				} catch (NotEnoughMoneyException e) {
					System.out.println(inhabitants[inhabitantSender]+" doesn't have money anymore");
				}
			}
		}
	}

}
