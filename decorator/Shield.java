package decorator;

public class Shield extends PlayerDecorator {
  /**
   * Pass the desired Player to the constructor, and "a shield" will be added to its lines
   * @param player Player that "a shield" will be added to
   */
  public Shield(Player player) {
    super(player);
    integrateDecor(FileReader.getLines("decorator/shield.txt"));
  }
  
}
