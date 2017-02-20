public class MonsterSim
{
  public static void main(String[] args){
    int round = 0;
    
    // Constructor (Name, Health, Damage)
    Monster monster1 = new Monster("Troll", 10, 2);
    Monster monster2 = new Monster("Goblin", 10, 2);

    // If both are alive, keep fighting
    while( monster1.health > 0 && monster2.health > 0 )
    {
    	round++;
    	System.out.println("\nRound " + round);

      	// Print result of the attack method
    	System.out.println( monster1.attack(monster2) );
    	System.out.println( monster2.attack(monster1) );
    }
    System.out.print("\nEnd Combat: ");
    if( monster1.health < 1 && monster2.health < 1) {
	    System.out.printf("The %s and the %s died fighting each other!", monster1.name,monster2.name);
    } else if ( monster1.health > 0 ) {
	    System.out.printf("%s wins!", monster1.name);
	} else {
	    System.out.printf("%s wins!", monster2.name);
    }  
  }
}
