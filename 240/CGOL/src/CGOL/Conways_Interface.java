package CGOL;

/**
 * Created by insidious on 3/23/16.
 */
public interface Conways_Interface {
    public void initPattern(int pattern);
    public void evolve();
    public void dumpWorld(boolean deadBorder, boolean printable);
    public boolean[][] goExtinct(boolean board[][]);
    public boolean[][] getLifeForm();
    public String toBitString();
    public boolean[][] toBoolArr(String str);
}