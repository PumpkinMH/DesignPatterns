package decorator;

public class Sword extends PlayerDecorator {
  /**
   * Pass the desired Player to the constructor, and "a sword" will be added to its lines
   * @param player Player that "a sword" will be added to
   */
  public Sword(Player player) {
    super(player);
    integrateDecor(FileReader.getLines("decorator/sword.txt"));
  }
}
