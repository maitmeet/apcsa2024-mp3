import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A (uncomment first)
  public Location getNextLoc(int row, int col) {
    if (row == 4) {
      Location l = new Location(row, col + 1);
      return l;
    } 
    else if (col == 4) {
      Location l = new Location(row + 1, col);
      return l;
    }
    else {
      if (grid[row][col + 1] > grid[row + 1][col]) {
        Location l = new Location(row + 1, col);
        return l;
      }
      else {
        Location l = new Location(row, col + 1);
        return l;
      }
    }
  }

  
  // PART B
  public int sumPath(int row, int col) {
    int sum = grid[row][col];
    Location loc = getNextLoc(row, col);

    while(loc != null)
    {
      sum += grid[loc.getRow()][loc.getCol()];
      if(loc.getRow() < grid.length - 1 || loc.getCol() < grid[0].length - 1){
        loc = getNextLoc(loc.getRow(), loc.getCol());
      }
      else {
        loc = null;
      }
    }

    return sum;
  }

  // added to see the array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}
