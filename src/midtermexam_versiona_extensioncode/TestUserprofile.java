import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        String name;
        int genreChoice;
        // Display available genres
        try (Scanner scanner = new Scanner(System.in)) {
            // Display available genres
            System.out.println("Available Genres:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Drama");
            System.out.println("4. Fantasy");
            System.out.println("5. Sci-Fi");
            System.out.println();
            // Get user input
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
            System.out.print("Enter your favorite genre (enter the corresponding number): ");
            genreChoice = scanner.nextInt();
        }

        // Map genre choice to genre name
        String genre;
        switch (genreChoice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Comedy";
                break;
            case 3:
                genre = "Drama";
                break;
            case 4:
                genre = "Fantasy";
                break;
            case 5:
                genre = "Sci-Fi";
                break;
            default:
                genre = "Unknown";
                break;
        }

        // Create the user profile
        UserProfile userProfile = new UserProfile(name, genre);

        // Display confirmation message
        System.out.println("User profile created:");
        System.out.println(userProfile);
    }
}

class UserProfile {
    private final String name;
    private final String favoriteGenre;

    public UserProfile(String name, String favoriteGenre) {
        this.name = name;
        this.favoriteGenre = favoriteGenre;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nFavorite Genre: " + favoriteGenre;
    }
}
