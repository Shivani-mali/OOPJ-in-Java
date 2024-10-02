public class Players {
    String name;

    // Method to set the player's name
    void setName(String n) {
        name = n;
    }

    // Method to get the player's name
    String getName() {
        return name;
    }

    // Method to display the player's name
    public void displayName() {
        System.out.println("Player is: " + name);
    }

    // Main method to run the program
    public static void main(String[] args) {
        Players p1 = new Players();  // Create player 1
        Players p2 = new Players();  // Create player 2
        
        // Set names for players
        p1.setName("ABC");
        p2.setName("Xyz");

        // Get and display player names
        String n = p1.getName();
        System.out.println("Player is: " + n);
        System.out.println("Player is: " + p2.getName());

        // Display names using the method
        p1.displayName();
    }
}
