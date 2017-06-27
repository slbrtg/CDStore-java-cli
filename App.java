import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    CDStore beatles = new CDStore (1967, "Beatles", "Sgt. Pepper", 20);
    CDStore michaelJackson = new CDStore (1982, "Michael Jackson", "Thriller", 24);
    CDStore queen = new CDStore (1975, "Queen", "Bohemian Rhapsody", 22);
    CDStore meatloaf = new CDStore (1977, "Meatloaf", "I'd Do Anything for Love", 24);
    CDStore christinaAguilera = new CDStore (2002, "Christina Aguilera", "Dirty", 5);
    List<CDStore> allCDs = new ArrayList<CDStore>();
    allCDs.add(beatles);
    allCDs.add(michaelJackson);
    allCDs.add(queen);
    allCDs.add(meatloaf);
    allCDs.add(christinaAguilera);

    boolean programRunning = true;

    while (programRunning) {
        System.out.println("Welcome to our CD Store! What would you like to do? Enter one of the following options: All CDs, Search Release Year, Search Artist, Search Album Name, Search Price, Add CD or Exit");

        String navigationChoice = myConsole.readLine();


        if (navigationChoice.equals("All CDs")){
          for ( CDStore individualCD : allCDs ) {
            System.out.println( "----------------------" );
            System.out.println( individualCD.mYear );
            System.out.println( individualCD.mArtist );
            System.out.println( individualCD.mAlbumName );
            System.out.println( individualCD.mPrice );
          }
        } else if (navigationChoice.equals("Search Release Year")){
          System.out.println("Release year:");
          String stringUserReleaseYear = myConsole.readLine();
          int userReleaseYear = Integer.parseInt(stringUserReleaseYear);
          System.out.println("Alright, here's what we have in this release year:");
          for ( CDStore individualCD : allCDs ) {
            if (individualCD.mYear == userReleaseYear ){
              System.out.println( "----------------------" );
              System.out.println( individualCD.mYear );
              System.out.println( individualCD.mArtist );
              System.out.println( individualCD.mAlbumName );
              System.out.println( individualCD.mPrice );
            }
          }
        } else if (navigationChoice.equals("Search Artist")){
          System.out.println("Search Artist Name:");
          String stringUserArtistName = myConsole.readLine();
          System.out.println("Alright, here's what we have in this release year:");
          for ( CDStore individualCD : allCDs ) {
            if (individualCD.mArtist == stringUserArtistName ){
              System.out.println( "----------------------" );
              System.out.println( individualCD.mYear );
              System.out.println( individualCD.mArtist );
              System.out.println( individualCD.mAlbumName );
              System.out.println( individualCD.mPrice );
            }
          }
        }
      }
    }
  }
