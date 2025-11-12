package edu.bhscs;

public interface Offsetable {
  int getWidth();


  default int getOffset(Offsetable below) {
    if (below == null)
      return 0;
    return Math.max(0, (below.getWidth() - this.getWidth()) / 2);
  }


  void draw(Offsetable below);
}
