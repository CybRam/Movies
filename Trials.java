import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MovieDriver2 {

    public static void main(String[] args) {
        String inputFile = "Movies1993.csv"; // Path to the file you want to read from
        String outputFile = "bad_movie_records.txt"; // Path to the new file you want to create
        Scanner reader = null;
        PrintWriter writer = null;
        try {
            reader = new Scanner(new FileInputStream(inputFile));
            writer = new PrintWriter(new FileOutputStream(outputFile));

        } catch (FileNotFoundException e){
			System.out.println("Problem opening files.");
			System.exit(0);
		}catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
        
        PrintWriter writerTry = null;
        try
		{
			writerTry = new PrintWriter(new FileOutputStream("chicken.txt"));
		}
		catch (FileNotFoundException e){
		System.out.println("Problem opening files.");
		System.exit(0);
		}
        
        while(reader.hasNextLine())
		{
			String line = reader.nextLine();
//			Scanner lineScanner = new Scanner(line);
			if(validateMovie(line)){
				writer.println(line);
			}
			else
			{				
				writerTry.println(line);
			}
		}
        
        
        writerTry.close();
        reader.close();
        writer.close();
		    }

    // Validate Method for semantic errors
    public static boolean validateMovie(String line)
    {
    	boolean invalidRecord = false;
    	Scanner lineScanner = null;
    	
    	String year = null;
    	String title = null;
    	String duration = null;
    	String genre = null;
    	String rating = null;
    	String score = null;
    	String director = null;
    	String actor1 = null;
    	String actor2 = null;
    	String actor3 = null;
    	String excess = null;
    	
    	String[] array = new String[10];
    	// Initialize variables
        String token = "";
        boolean insideQuotes = false;
        int j = 0;
        try {
        	// Iterate over each character in the CSV data
            for (int i = 0; i< line.toCharArray().length;i++) {
                if (line.toCharArray()[i] == '\"') {
                    // Toggle the insideQuotes flag when encountering a double quote
                    insideQuotes = !insideQuotes;
                } else if (line.toCharArray()[i] == ',' && !insideQuotes) {
                    // Found a comma outside of quotes, process the token
                    array[j] = token;
                    j++;
                    token = ""; // Reset the token
                } else {
                    // Add the character to the current token
                    token += line.toCharArray()[i];
                }
        }
            year = array[0];
            title = array[1];
            duration = array[2];
            genre = array[3];
            rating = array[4];
            score = array[5];
            director = array[6];
            actor1 = array[7];
            actor2 = array[8];
            actor3 = array[9];   
             
        }catch(IndexOutOfBoundsException e) {
    		invalidRecord = true;
    		return true;
    	}
        
    	if (!(title.startsWith("\"") && title.endsWith("\"")) || Integer.parseInt(year) < 1990 || Integer.parseInt(year) > 1999 
    			|| Integer.parseInt(duration) < 30 || Integer.parseInt(duration) > 300 
    			|| Double.parseDouble(score) > 10.0 ) {
    	                invalidRecord = true;
    		} else {
    		String[] validGenres = {"musical", "comedy", "animation", "adventure", "drama",
    	        "crime", "biography", "horror", "action", "documentary", "fantasy",
    	        "mystery", "sci-fi", "family", "romance", "thriller", "western"};
    			boolean validRecord = true;
    			for(int i = 0; i < validGenres.length; i++){			
    				if(validGenres[i].equalsIgnoreCase(genre)){
    					validRecord = false;
    					break;
    				}
    			}
    			invalidRecord = validRecord;
    		}
    	
    	return invalidRecord;
    	}

}
