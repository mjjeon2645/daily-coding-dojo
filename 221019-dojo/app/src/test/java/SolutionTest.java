import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void toLower() {
    Solution solution = new Solution();

    assertEquals(solution.toLower("3people unFollowed me"), "3people unfollowed me");
    assertEquals(solution.toLower("For The Last Week"), "for the last week");
    assertEquals(solution.toLower("For    The Last Week"), "for    the last week");
    assertEquals(solution.toLower("For The Last Week  "), "for the last week  ");
  }

  @Test
  void toArray() {
    Solution solution = new Solution();

    assertArrayEquals(solution.toArray("for the last week"), new String[]{"for", "the", "last", "week"});
    assertArrayEquals(solution.toArray("for  the last week"), new String[]{"for", "", "the", "last", "week"});
    assertArrayEquals(solution.toArray("for   the last week"), new String[]{"for", "", "", "the", "last", "week"});
    assertArrayEquals(solution.toArray("for the last week  "), new String[]{"for", "the", "last", "week", "", ""});
  }

  @Test
  void solution() {
    Solution solution = new Solution();

    assertEquals("For The Last Week", solution.solution("for the last week"));
    assertEquals("For The Last Week  ", solution.solution("for the last week  "));
  }

  @Test
  void makeAnswer() {
    Solution solution = new Solution();

    assertEquals("For The Last Week", solution.makeAnswer(new String[]{"for", "the", "last", "week"}));
    assertEquals("For The Last Week  ", solution.makeAnswer(new String[]{"for", "the", "last", "week", "", ""}));
  }
}
