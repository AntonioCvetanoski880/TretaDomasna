package Cetvrta;

public class pecatenje {
	   public static void main(String[] args) {
	      brojach t = new brojach();
	      int heads = 0;
	      int tails = 0;
	      int chances = 10;
	      for (int i = 1; i<= chances; i++) {
	         if (t.chanceFunc().equals("tails")) {
	            tails++;
	         } else {
	            heads++;
	         }
	      }
	      System.out.println("Frlanja = " + chances);
	      System.out.println("Glava: " + heads);
	      System.out.println("Pismo: " + tails);
	   }
	}
