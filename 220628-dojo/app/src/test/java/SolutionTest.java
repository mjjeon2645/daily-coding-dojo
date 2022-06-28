import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void creation() {
    // 1월 1일: 금
    Solution solution = new Solution();

    assertEquals("FRI", solution.solution(1, 1));
    assertEquals("SUN", solution.solution(1, 31));
  }

  @Test
  void february() {
    // 2월 1일: 월
    Solution solution = new Solution();

    assertEquals("MON", solution.solution(2, 1));
    assertEquals("MON", solution.solution(2, 29));
  }

  @Test
  void march() {
    // 3월 1일: 화
    Solution solution = new Solution();

    assertEquals("TUE", solution.solution(3, 1));
    assertEquals("THU", solution.solution(3, 31));
  }

  @Test
  void april() {
    // 4월 1일: 금
    Solution solution = new Solution();

    assertEquals("FRI", solution.solution(4, 1));
    assertEquals("SAT", solution.solution(4, 30));
  }

  @Test
  void may() {
    // 5월 1일: 일
    Solution solution = new Solution();

    assertEquals("SUN", solution.solution(5, 1));
    assertEquals("TUE", solution.solution(5, 31));
  }

  @Test
  void june() {
    // 6월 1일: 수
    Solution solution = new Solution();

    assertEquals("WED", solution.solution(6, 1));
    assertEquals("THU", solution.solution(6, 30));
  }

  @Test
  void july() {
    // 7월 1일: 금
    Solution solution = new Solution();

    assertEquals("FRI", solution.solution(7, 1));
    assertEquals("SUN", solution.solution(7, 31));
  }

  @Test
  void aug() {
    // 8월 1일: 금
    Solution solution = new Solution();

    assertEquals("MON", solution.solution(8, 1));
    assertEquals("WED", solution.solution(8, 31));
  }

  @Test
  void sep() {
    // 9월 1일: 목
    Solution solution = new Solution();

    assertEquals("THU", solution.solution(9, 1));
    assertEquals("FRI", solution.solution(9, 30));
  }

  @Test
  void oct() {
    // 10월 1일: 토
    Solution solution = new Solution();

    assertEquals("SAT", solution.solution(10, 1));
    assertEquals("MON", solution.solution(10, 31));
  }

  @Test
  void nov() {
    // 11월 1일: 화
    Solution solution = new Solution();

    assertEquals("TUE", solution.solution(11, 1));
    assertEquals("WED", solution.solution(11, 30));
  }

  @Test
  void dec() {
    // 12월 1일: 목
    Solution solution = new Solution();

    assertEquals("THU", solution.solution(12, 1));
    assertEquals("SAT", solution.solution(12, 31));
  }


}