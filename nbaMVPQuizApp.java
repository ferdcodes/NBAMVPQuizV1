/* 
 * nbaMVPquiz
 * This code prompts the user to list all the NBA MVPS from 2023-2024(the most recent as of writing)
 * to 1955-1956 (the earliest MVP). The code will track the number of MVPs the user got right/wrong.
 * Then it will display the name of the MVPS you guessed in order.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class nbaMVPQuizApp
{
  public static void main (String [] args)
  {
    Scanner input = new Scanner (System.in);
    int correct = 0;
    String userin = "";
    ArrayList<String> mvps = new ArrayList<String>();
    
    System.out.println("NOTE: ALL answers must include FULL first and last name to be correct.");
    System.out.println("Who was the 2023-2024 MVP?");
    userin = input.nextLine();
    if(userin.equals("Nikola Jokic"))
    {
      correct++;
    }
    mvps.add(userin);
    
    System.out.println("Who was the 2022-2023 MVP?");
    userin = input.nextLine();
    if(userin.equals("Joel Embiid"))
    {
      correct++;
    }
    mvps.add(userin);
    
    System.out.println("Who was the 2021-2022 MVP?");
    userin = input.nextLine();
    if(userin.equals("Nikola Jokic"))
    {
      correct++;
    }
    mvps.add(userin);
    
    System.out.println("Who was the 2020-2021 MVP?");
    userin = input.nextLine();
    if(userin.equals("Nikola Jokic"))
    {
      correct++;
    }
    mvps.add(userin);
    
    System.out.println("Who was the 2019-2020 MVP?");
    userin = input.nextLine();
    if(userin.equals("Giannis Antetokounmpo"))
    {
      correct++;
    }
    mvps.add(userin);
    
    System.out.println("Who was the 2018-2019 MVP?");
    userin = input.nextLine();
    if(userin.equals("Giannis Antetokounmpo"))
    {
      correct++;
    }
    mvps.add(userin);
     
    System.out.println("Who was the 2017-2018 MVP?");
    userin = input.nextLine();
    if(userin.equals("James Harden"))
    {
      correct++;
    }
    mvps.add(userin);
     
    System.out.println("Who was the 2016-2017 MVP?");
    userin = input.nextLine();
    if(userin.equals("Russell Westbrook"))
    {
      correct++;
    }
    mvps.add(userin);
     
    System.out.println("Who was the 2015-2016 MVP?");
    userin = input.nextLine();
    if(userin.equals("Stephen Curry"))
    {
      correct++;
    }
    mvps.add(userin);
     
    System.out.println("Who was the 2014-2015 MVP?");
    userin = input.nextLine();
    if(userin.equals("Stephen Curry"))
    {
      correct++;
    }
    mvps.add(userin);
     
    System.out.println("Who was the 2013-2014 MVP?");
    userin = input.nextLine();
    if(userin.equals("Kevin Durant"))
    {
      correct++;
    }
    mvps.add(userin);
     
    System.out.println("Who was the 2012-2013 MVP?");
    userin = input.nextLine();
    if(userin.equals("LeBron James"))
    {
      correct++;
    }
    mvps.add(userin);
     
    System.out.println("Who was the 2011-2012 MVP?");
    userin = input.nextLine();
    if(userin.equals("LeBron James"))
    {
      correct++;
    }
    mvps.add(userin);
     
    System.out.println("Who was the 2010-2011 MVP?");
    userin = input.nextLine();
    if(userin.equals("Derrick Rose"))
    {
      correct++;
    }
    mvps.add(userin);
     
    System.out.println("Who was the 2009-2010 MVP?");
    userin = input.nextLine();
    if(userin.equals("LeBron James"))
    {
      correct++;
    }
    mvps.add(userin);
     
    System.out.println("Who was the 2008-2009 MVP?");
    userin = input.nextLine();
    if(userin.equals("LeBron James"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 2007-2008 MVP?");
    userin = input.nextLine();
    if(userin.equals("Kobe Bryant"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 2006-2007 MVP?");
    userin = input.nextLine();
    if(userin.equals("Dirk Nowitzki"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 2005-2006 MVP?");
    userin = input.nextLine();
    if(userin.equals("Steve Nash"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 2004-2005 MVP?");
    userin = input.nextLine();
    if(userin.equals("Steve Nash"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 2003-2004 MVP?");
    userin = input.nextLine();
    if(userin.equals("Kevin Garnett"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 2002-2003 MVP?");
    userin = input.nextLine();
    if(userin.equals("Tim Duncan"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 2001-2002 MVP?");
    userin = input.nextLine();
    if(userin.equals("Tim Duncan"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 2000-2001 MVP?");
    userin = input.nextLine();
    if(userin.equals("Allen Iverson"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1999-2000 MVP?");
    userin = input.nextLine();
    if(userin.equals("Shaquille O'Neal"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1998-1999 MVP?");
    userin = input.nextLine();
    if(userin.equals("Karl Malone"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1997-1998 MVP?");
    userin = input.nextLine();
    if(userin.equals("Michael Jordan"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1996-1997 MVP?");
    userin = input.nextLine();
    if(userin.equals("Karl Malone"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1995-1996 MVP?");
    userin = input.nextLine();
    if(userin.equals("Michael Jordan"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1994-1995 MVP?");
    userin = input.nextLine();
    if(userin.equals("David Robinson"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1993-1994 MVP?");
    userin = input.nextLine();
    if(userin.equals("Hakeem Olajuwon"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1992-1993 MVP?");
    userin = input.nextLine();
    if(userin.equals("Charles Barkley"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1991-1992 MVP?");
    userin = input.nextLine();
    if(userin.equals("Michael Jordan"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1990-1991 MVP?");
    userin = input.nextLine();
    if(userin.equals("Michael Jordan"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1989-1990 MVP?");
    userin = input.nextLine();
    if(userin.equals("Magic Johnson"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1988-1989 MVP?");
    userin = input.nextLine();
    if(userin.equals("Magic Johnson"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1987-1988 MVP?");
    userin = input.nextLine();
    if(userin.equals("Michael Jordan"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1986-1987 MVP?");
    userin = input.nextLine();
    if(userin.equals("Magic Johnson"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1985-1986 MVP?");
    userin = input.nextLine();
    if(userin.equals("Larry Bird"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1984-1985 MVP?");
    userin = input.nextLine();
    if(userin.equals("Larry Bird"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1983-1984 MVP?");
    userin = input.nextLine();
    if(userin.equals("Larry Bird"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1982-1983 MVP?");
    userin = input.nextLine();
    if(userin.equals("Moses Malone"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1981-1982 MVP?");
    userin = input.nextLine();
    if(userin.equals("Moses Malone"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1980-1981 MVP?");
    userin = input.nextLine();
    if(userin.equals("Julius Erving"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1979-1980 MVP?");
    userin = input.nextLine();
    if(userin.equals("Kareem Abdul-Jabbar"))
    {
      correct++;
    }
    mvps.add(userin);
      
    System.out.println("Who was the 1978-1979 MVP?");
    userin = input.nextLine();
    if(userin.equals("Moses Malone"))
    {
      correct++;
    }
    mvps.add(userin);
       
    System.out.println("Who was the 1977-1978 MVP?");
    userin = input.nextLine();
    if(userin.equals("Bill Walton"))
    {
      correct++;
    }
    mvps.add(userin);
       
    System.out.println("Who was the 1976-1977 MVP?");
    userin = input.nextLine();
    if(userin.equals("Kareem Abdul-Jabbar"))
    {
      correct++;
    }
    mvps.add(userin);
       
    System.out.println("Who was the 1975-1976 MVP?");
    userin = input.nextLine();
    if(userin.equals("Kareem Abdul-Jabbar"))
    {
      correct++;
    }
    mvps.add(userin);
       
    System.out.println("Who was the 1974-1975 MVP?");
    userin = input.nextLine();
    if(userin.equals("Bob McAdoo"))
    {
      correct++;
    }
    mvps.add(userin);
       
    System.out.println("Who was the 1973-1974 MVP?");
    userin = input.nextLine();
    if(userin.equals("Kareem Abdul-Jabbar"))
    {
      correct++;
    }
    mvps.add(userin);
       
    System.out.println("Who was the 1972-1973 MVP?");
    userin = input.nextLine();
    if(userin.equals("Dave Cowens"))
    {
      correct++;
    }
    mvps.add(userin);
       
    System.out.println("Who was the 1971-1972 MVP?");
    userin = input.nextLine();
    if(userin.equals("Kareem Abdul-Jabbar"))
    {
      correct++;
    }
    mvps.add(userin);
       
    System.out.println("Who was the 1970-1971 MVP?");
    userin = input.nextLine();
    if(userin.equals("Lew Alcindor"))
    {
      correct++;
    }
    mvps.add(userin);
       
    System.out.println("Who was the 1969-1970 MVP?");
    userin = input.nextLine();
    if(userin.equals("Willis Reed"))
    {
      correct++;
    }
    mvps.add(userin);
       
    System.out.println("Who was the 1968-1969 MVP?");
    userin = input.nextLine();
    if(userin.equals("Wes Unseld"))
    {
      correct++;
    }
    mvps.add(userin);
        
    System.out.println("Who was the 1967-1968 MVP?");
    userin = input.nextLine();
    if(userin.equals("Wilt Chamberlain"))
    {
      correct++;
    }
    mvps.add(userin);
        
    System.out.println("Who was the 1966-1967 MVP?");
    userin = input.nextLine();
    if(userin.equals("Wilt Chamberlain"))
    {
      correct++;
    }
    mvps.add(userin);
        
    System.out.println("Who was the 1965-1966 MVP?");
    userin = input.nextLine();
    if(userin.equals("Wilt Chamberlain"))
    {
      correct++;
    }
    mvps.add(userin);
        
    System.out.println("Who was the 1964-1965 MVP?");
    userin = input.nextLine();
    if(userin.equals("Bill Russell"))
    {
      correct++;
    }
    mvps.add(userin);
        
    System.out.println("Who was the 1963-1964 MVP?");
    userin = input.nextLine();
    if(userin.equals("Oscar Robertson"))
    {
      correct++;
    }
    mvps.add(userin);
        
    System.out.println("Who was the 1962-1963 MVP?");
    userin = input.nextLine();
    if(userin.equals("Bill Russell"))
    {
      correct++;
    }
    mvps.add(userin);
        
    System.out.println("Who was the 1961-1962 MVP?");
    userin = input.nextLine();
    if(userin.equals("Bill Russell"))
    {
      correct++;
    }
    mvps.add(userin);
        
    System.out.println("Who was the 1960-1961 MVP?");
    userin = input.nextLine();
    if(userin.equals("Bill Russell"))
    {
      correct++;
    }
    mvps.add(userin);
        
    System.out.println("Who was the 1959-1960 MVP?");
    userin = input.nextLine();
    if(userin.equals("Wilt Chamberlain"))
    {
      correct++;
    }
    mvps.add(userin);
        
    System.out.println("Who was the 1958-1959 MVP?");
    userin = input.nextLine();
    if(userin.equals("Bob Petit"))
    {
      correct++;
    }
    mvps.add(userin);
        
    System.out.println("Who was the 1957-1958 MVP?");
    userin = input.nextLine();
    if(userin.equals("Bill Russell"))
    {
      correct++;
    }
    mvps.add(userin);
        
    System.out.println("Who was the 1956-1957 MVP?");
    userin = input.nextLine();
    if(userin.equals("Bob Cousy"))
    {
      correct++;
    }
    mvps.add(userin);
        
    System.out.println("Who was the 1955-1956 MVP?");
    userin = input.nextLine();
    if(userin.equals("Bob Petit"))
    {
      correct++;
    }
    mvps.add(userin);
    
    
    System.out.println("You got " + correct + "/68 correct!\n");
    System.out.println("All the NBA Players that were guessed: ");
    for(Object names : mvps)
    {
      System.out.println(names);
    }
    /* Next Updates: 1. Make user guess till correct 2. Keep a counter of how many guesses.
     * 3. Display all the right answers 4. Display which years they got incorrect.
     */
  }
}