package Cetvrta;

import java.util.Random;

class brojach {
	   public String chanceFunc() {
	      Random r = new Random();
	      int chance = r.nextInt(2);
	      if (chance == 1) {
	         return"tails";
	      } else {
	         return"heads";
	      }
	   }
	}
	