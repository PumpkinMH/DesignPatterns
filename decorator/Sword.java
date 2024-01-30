package decorator;

public class Sword extends PlayerDecorator {
  public Sword(Player player) {
    super(player);
    integrateDecor(FileReader.getLines("decorator/sword.txt"));
  }
}
