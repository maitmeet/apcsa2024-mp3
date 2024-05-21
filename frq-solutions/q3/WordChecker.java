import java.util.*;

public class WordChecker {
  private ArrayList<String> wordList;

  public WordChecker(ArrayList<String> words) {
    wordList = words;
  }

  public boolean isWordChain() {
    for (int s = 0; s < wordList.size(); s++) {
      String str = wordList.get(s);
      if (s < wordList.size() -1) {
        if (!(wordList.get(s+1).contains(str))) {
          return false;
        }
      }
    }
    return true;
  }

  public ArrayList<String> createList(String target) {
    ArrayList<String> result = new ArrayList<String>();
    for (int i = 0; i < wordList.size(); i++) {
      String str = wordList.get(i);
      if (i < wordList.size() -1) {
        if (str.indexOf(target) == 0) {
          String str2 = str.substring(target.length());
          result.add(str2);
        }
      }
    }
    return result;             
  }
}
