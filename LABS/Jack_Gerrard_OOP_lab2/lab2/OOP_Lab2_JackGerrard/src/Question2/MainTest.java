package Question2;

public class MainTest {
	public static void main(String argsp[]) {
		// Constructor order = String n, String ad, integer ag, Film[] f
			Actor Jack = new Actor("Jack Nicholson","Miami",74);
			Actor Violente = new Actor("Violante Placido ","Bologna",38);

			
					
			//Create array to pass to jack object as array of films
			
			Film[] jackFilms = new Film[3];
			jackFilms[0]=new Film("Wolf", "05255");
			jackFilms[1]=new Film("As Good as it gets", "85544");
			jackFilms[2]=new Film("One flew over the Cuckoo’s Nest", "74158");
			
			Film[] violanteFilms  = new Film[3];
			violanteFilms[0] = new Film("The american", "05765");
			violanteFilms[1] = new Film("Ghost Rider spirit of vengence", "80123");
			violanteFilms[2] = new Film("Barah Aanan", "45624");
			
	
			
			//pass actors objects the films arrays
			Jack.setFilm(jackFilms);
			Violente.setFilm(violanteFilms);
			
	
			// print actor objects details;
			
			Jack.print();
			Violente.print();



	}		
}
