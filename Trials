public class CSVParser {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "1993,\"Blood In, Blood Out\",330,Crime,R,8,Taylor Hackford,Delroy Lindo,Jesse Borrego,Raymond Cruz";

        // Initialize variables
        String token = "";
        boolean insideQuotes = false;

        // Iterate over each character in the CSV data
        for (char c : csvData.toCharArray()) {
            if (c == '\"') {
                // Toggle the insideQuotes flag when encountering a double quote
                insideQuotes = !insideQuotes;
            } else if (c == ',' && !insideQuotes) {
                // Found a comma outside of quotes, process the token
                System.out.println(token);
                token = ""; // Reset the token
            } else {
                // Add the character to the current token
                token += c;
            }
        }

        // Process the last token after the loop
        System.out.println(token);
    }
}
