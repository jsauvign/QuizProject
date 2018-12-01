package edu.unca.csci201;

public class QuizTime {
	
	public static void main(String[] args) {
		
		Question [] questionPool = {
		//Multiple Choice Questions:
		new MultipleChoiceQuestion ("What is the major element found in a photovoltaic (PV) cell? \n a. Hydrogen \n b. Nitrogen \n c. Silicon \n d. Carbon", "c"),
		new MultipleChoiceQuestion ("What does the word photovoltaic mean? \n a. Sun-powered \n b. Light-cells \n c. Light-electricity \n d. Solar-energy", "c"),
		new MultipleChoiceQuestion ("The efficiency of photovoltaic panels ______ with _______ temperature. \n a. increases, decreasing \n b. decreases, increasing \n c. remains same, increasing \n d. depends upon type of collector", "b"),
		new MultipleChoiceQuestion ("What is the optimal orientation for a solar panel to face in the southern hemisphere? \n a. North \n b. East \n c. South \n d. West", "a"),
		new MultipleChoiceQuestion ("In the northern hemisphere, assuming your panels are facing the optimal direction, what is the optimal tilt angle for year round production? \n a. latitude \n b. latitude - 15 degrees \n c. longitude \n d. longitude + 15 degrees", "a"),
				
		// True False Questions:
		new TrueFalseQuestion ("The photovoltaic effect was discovered in 1939.\n a. True \n b. False" , "b"),
		new TrueFalseQuestion ("Most solar cells are made from amorphous silicon.\n a. True \n b. False" , "b"),
		new TrueFalseQuestion ("Solar cells can be made from plastic.\n a. True \n b. False" , "a"),
		new TrueFalseQuestion ("Most solar cells are about 60 percent efficient at converting sunlight into electricity.\n a. True \n b. False" , "b"),
		new TrueFalseQuestion ("A solar panel produces DC power — an inverter converts it to AC.\n a. True \n b. False" , "a"),
		new TrueFalseQuestion ("A typical size for a residential solar-electric system is between 2,000 and 5,000 watts.\n a. True \n b. False" , "a"),
		new TrueFalseQuestion ("Net-metering laws and feed-in tariffs are both policies that help homeowners get paid more for the electricity their solar panels produce.\n a. True \n b. False" , "a"),
		new TrueFalseQuestion ("Over the course of a year, a photovoltaic (PV) system in Albuquerque, N.M., would produce almost exactly the same amount of electricity as an identical PV system located in Seattle.\n a. True \n b. False" , "b"),
		new TrueFalseQuestion ("The United States currently produces more electricity from solar power than it does from wind power.\n a. True \n b. False" , "b"),
		new TrueFalseQuestion ("New Jersey has more PV power installed than any other state.\n a. True \n b. False" , "b"),
		
		
		
		//Short Answer Questions:
		new ShortAnswerQuestion ("If you want to power a 1000 watt heater for 3 hours a day, how many 300 watt solar panels would you need? (assume 5 full sun hours per day and perfect system efficiency and no losses)", "2"),
		new ShortAnswerQuestion ("What is the max system voltage for a PV system in the United States?", "1000"),
		new ShortAnswerQuestion ("If a solar panel puts out 10 amps at 12 Volts, how many watts is it generating?", "120"),
		new ShortAnswerQuestion ("How many PV cells does a panel meant for charging a 12 volt battery contain?", "36"),
		new ShortAnswerQuestion ("How many cells does a 12 volt lead acid battery contain?", "6")
		
		};
		
		Quiz pvQuiz = new Quiz();
		for(int i = 0; i < questionPool.length; i++ ) {
			pvQuiz.addQuestion(questionPool[i]);
		}
		pvQuiz.giveQuiz();
	}
}
