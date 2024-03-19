public class BadYearException extends Exception
{
	public BadYearException(String message)
	{
		super(message);
	}
	public BadYearException()
	{
		System.out.println("There is an error with the year of the movie.");
	}
}

public class BadTitleException extends Exception {
	
	public BadTitleException(String message)
	{
		super(message);
	}
	public BadTitleException()
	{
		System.out.println("There is an error in the title of the movie.");
	}
}

public class BadGenreException extends Exception{

	public BadGenreException(String message)
	{
		super(message);
	}
	public BadGenreException()
	{
		System.out.println("There is an error in the genre of the movie.");
	}
}

public class BadScoreException extends Exception{

	public BadScoreException(String message)
	{
		super(message);
	}
	public BadScoreException()
	{
		System.out.println("There is an error in the Score of the movie");
	}
}

public class BadDurationException extends Exception{

	public BadDurationException(String message)
	{
		super(message);
	}
	public BadDurationException()
	{
		System.out.println("There is an error in the duration of the movie.");
	}
}

class BadRatingException extends Exception {
    public BadRatingException(String message) {
        super(message);
    }
    public BadRatingException()
    {
    	System.out.println("There is an error in the Rating of the movie.");
    }
}

class BadNameException extends Exception {
    public BadNameException(String message) {
        super(message);
    }
    public BadNameException()
    {
    	System.out.println("There is an error in the name of the movie.");
    }
}

class MissingQuotesException extends Exception {
    public MissingQuotesException(String message) {
        super(message);
    }
    public MissingQuotesException()
    {
    	System.out.println("This field is missing quotes.");
    }
}

class ExcessFieldsException extends Exception {
    public ExcessFieldsException(String message) {
        super(message);
    }
    public ExcessFieldsException()
    {
    	System.out.println("This movie has an excess of fields.");
    }
}

class MissingFieldsException extends Exception {
    public MissingFieldsException(String message) {
        super(message);
    }
    public MissingFieldsException()
    {
    	System.out.println("This movie has missing fields.");
    }
}
