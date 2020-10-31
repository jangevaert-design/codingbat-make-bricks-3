public class MakeBricks3 {
  public boolean makeBricks(int small, int big, int goal) {
    return (goal - big * 5 <= small && small >= goal % 5);
  }
}
