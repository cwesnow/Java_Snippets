public class Monster {
  public String name = "Monster";
  public int health = 1;
  public int damage = 1;
  
  // Constructor
  Monster(String Name, int Health, int Damage) {
    this.name = Name;
    this.health = Health;
    this.damage = Damage;
  } 
  
  // Attack Method
  public String attack(Monster target)
  {
    target.health -= this.damage;
    return String.format("%s attacks %s for %d damage!", this.name, target.name, this.damage);
  }
}
