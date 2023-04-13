import java.util.*;
class Main {

public static String[][] videogame = new String[2][2];
public static String[][] movie = new String[2][2];
public static Scanner input = new Scanner(System.in);
public static Random num = new Random();
public static int count = 0;

public static void intro(){
  System.out.print("\033\143");
  System.out.println("A multiverse shattering battle is brewing.");
  System.out.println();
  System.out.println("Videogame characters Vs Movie characters");
  System.out.println();
  System.out.println("You are going to pick what characters fight.");
  System.out.println();
  System.out.println("Press enter to continue...");
  input.nextLine();
}

public static void fill( String[][] array ){
  System.out.print("\033\143");
  System.out.println("We're going to select the fighters. ");
  System.out.println();
  if( count == 0) {
    System.out.println("Let's start with the videogame characters. ");
    count++;
  } else {
    System.out.println("Now the movie characters. ");
  }
  System.out.println();
  for(int i = 0; i < array.length; i++){
    for(int j = 0; j < array[i].length; j++){
      System.out.println("Enter a character: ");
      array[i][j] = input.nextLine();
    }
  }
}

public static void setBattle(){
  System.out.print("\033\143");
  System.out.println("The arena is ready for battle: ");
  System.out.println();
  System.out.println("Press enter to continue...");
  input.nextLine();
  System.out.print("\033\143");
  for(int i = 0; i < movie.length; i++){
    for(int j = 0; j < movie[i].length; j++){
      System.out.print(" " + movie[i][j] + " ");
    }
    System.out.println();
    System.out.println();
  }
  System.out.println();
  System.out.println(" ******VS****** ");
  System.out.println();
  for(int i = 0; i < videogame.length; i++){
    for(int j = 0; j < videogame[i].length; j++){
      System.out.print(" " + videogame[i][j] + " ");
      }
    System.out.println();
    System.out.println();
  }
  System.out.println("Press enter to continue...");
  input.nextLine();
}

public static void match1(){
  System.out.print("\033\143");
  int numOne = num.nextInt(2);
  int numTwo = num.nextInt(2);
  System.out.println("In our first fight: ");
  System.out.println();
  System.out.println(videogame[numOne][numTwo] + " is the videogame character.");
  System.out.println();
  System.out.println(movie[numOne][numTwo] + " is the movie character.");
  System.out.println();
  System.out.println("Press enter to continue...");
  input.nextLine();
  System.out.println( videogame[numOne][numTwo] + " got " + numOne + " hits.");
  System.out.println();
  System.out.println( movie[numOne][numTwo] + " got " + numTwo + " hits.");
  System.out.println();
  System.out.println("Press enter to continue...");
  input.nextLine();
  System.out.println("\033\143");
  if( numOne > numTwo ){
    System.out.println( videogame[numOne][numTwo] + " Mitte ad mortem");
  } else if ( numTwo > numOne ){
    System.out.println( movie[numOne][numTwo] + " Mitte ad mortem");
  } else { 
  System.out.println("Mortuus");
  }
}
public static void match2(){
  System.out.print("\033\143");
  int numOne = num.nextInt(2);
  int numTwo = num.nextInt(2);
  System.out.println("In our second fight: ");
  System.out.println();
  System.out.println(videogame[numOne][numTwo] + " is the videogame character.");
  System.out.println();
  System.out.println(movie[numOne][numTwo] + " is the movie character.");
  System.out.println();
  System.out.println("Press enter to continue...");
  input.nextLine();
  System.out.println( videogame[numOne][numTwo] + " got " + numOne + " hits.");
  System.out.println();
  System.out.println( movie[numOne][numTwo] + " got " + numTwo + " hits.");
  System.out.println();
  System.out.println("Press enter to continue...");
  input.nextLine();
  System.out.println("\033\143");
  if( numOne > numTwo ){
    System.out.println( videogame[numOne][numTwo] + " Mitte ad mortem");
  } else if ( numTwo > numOne ){
    System.out.println( movie[numOne][numTwo] + " Mitte ad mortem");
  } else { 
  System.out.println("Mortuus");
  }
}
public static void match3(){
  System.out.print("\033\143");
  int numOne = num.nextInt(2);
  int numTwo = num.nextInt(2);
  System.out.println("In our third fight: ");
  System.out.println();
  System.out.println(videogame[numOne][numTwo] + " is the videogame character.");
  System.out.println();
  System.out.println(movie[numOne][numTwo] + " is the movie character.");
  System.out.println();
  System.out.println("Press enter to continue...");
  input.nextLine();
  System.out.println( videogame[numOne][numTwo] + " got " + numOne + " hits.");
  System.out.println();
  System.out.println( movie[numOne][numTwo] + " got " + numTwo + " hits.");
  System.out.println();
  System.out.println("Press enter to continue...");
  input.nextLine();
  System.out.println("\033\143");
  if( numOne > numTwo ){
    System.out.println( videogame[numOne][numTwo] + " Mitte ad mortem");
  } else if ( numTwo > numOne ){
    System.out.println( movie[numOne][numTwo] + " Mitte ad mortem");
  } else { 
  System.out.println("Mortuus");
  }
}
public static void match4(){
  System.out.print("\033\143");
  int numOne = num.nextInt(2);
  int numTwo = num.nextInt(2);
  System.out.println("In our final fight: ");
  System.out.println();
  System.out.println(videogame[numOne][numTwo] + " is the videogame character.");
  System.out.println();
  System.out.println(movie[numOne][numTwo] + " is the movie character.");
  System.out.println();
  System.out.println("Press enter to continue...");
  input.nextLine();
  System.out.println( videogame[numOne][numTwo] + " got " + numOne + " hits.");
  System.out.println();
  System.out.println( movie[numOne][numTwo] + " got " + numTwo + " hits.");
  System.out.println();
  System.out.println("Press enter to continue...");
  input.nextLine();
  System.out.println("\033\143");
  if( numOne > numTwo ){
    System.out.println( videogame[numOne][numTwo] + " Mitte ad mortem");
  } else if ( numTwo > numOne ){
    System.out.println( movie[numOne][numTwo] + " Mitte ad mortem");
  } else { 
  System.out.println("Mortuus");
  }
}

public static void main(String[] args) {
  intro();
  fill( videogame );
  fill( movie );
      setBattle();
  match1();
  match2();
  match3();
  match4();
}
}