package decorator;

public class Armor extends PlayerDecorator {
  /**
   * Pass the desired Player to the constructor, and "armor" will be added to its lines
   * @param player Player that "armor" will be added to
   */
  public Armor(Player player) {
    super(player);
    integrateDecor(FileReader.getLines("decorator/armor.txt"));

  }
}
