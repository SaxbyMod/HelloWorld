import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Purpose: Introducing Myself to Java [Again]

//Author: SaxbyMod
//Version: 1.0.0 - Date: 8/14/2025

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Create a reader so we can record user Input.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Create a Multiline Welcome Message; this is done to prevent having dozens of prints when it can be compacted into one.
        String WelcomeMessage = """
                Hello!
                We are now embarking on a new realm.
                Please make sure you have all your things before you proceed.
                
                [Type "Ready!"]
                Type here: """;
        System.out.printf(WelcomeMessage);
        // Create a base variable for read contents.
        String Readcontents = "";
        // Error Handling for if the read fails.
        try {
            Readcontents = reader.readLine();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Let's do something with the fetched input!; A If check to ensure proper input.
        if (Readcontents.toLowerCase().trim().equals("ready!")) {
            // Define the ProceedingMessage
            String ProceedingMessage = """
                    Thanks for gathering your things, lets store them under the seat provided.
                    
                    Next Stop: The JavaShop
                    Traveling to Destination [""";
            System.out.printf(ProceedingMessage);
            // Handle the Destination Meter via a For Loop.
            for (int i = 0; i < 10; i++) {
                // If I knew how to handle delay there would be a delay of ~2 seconds before the next prints.
                System.out.printf(" - ");
            }
            // Finish up with a Finalizing Message.
            String FinalizingMessage = """
                    ]
                    
                    We have arrived now get your things and get out please!""";
            System.out.printf(FinalizingMessage);
        } else {
            System.out.println("Try again when your actually ready!\n");
            main(args);
        }
    }
}