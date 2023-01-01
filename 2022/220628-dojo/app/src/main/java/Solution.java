public class Solution {
  private int base = 7;

  public String solution(int a, int b) {

    String answer = "";
    String[] dayOfTheWeek = new String[]{"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

    // 1월 1일~31일, 4월 1일~30일, 7월 1일~31일
    if (a == 1 || a == 4 || a == 7) {
      int index = b % base;
      answer = dayOfTheWeek[index];
    }

    // 2월 1일~29일, 8월 1일~31일
    dayOfTheWeek = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    if (a == 2 || a == 8) {
      int index = b % base;
      answer = dayOfTheWeek[index];
    }

    // 3월 1일~31일, 11월 1일~30일
    dayOfTheWeek = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    if (a == 3 || a == 11) {
      int index = b % base;
      answer = dayOfTheWeek[index];
    }

    // 5월 1일~31일
    dayOfTheWeek = new String[]{"SAT", "SUN", "MON", "TUE", "WED", "THU", "FRI"};
    if (a == 5) {
      int index = b % base;
      answer = dayOfTheWeek[index];
    }

    // 6월 1일~30일
    dayOfTheWeek = new String[]{"TUE", "WED", "THU", "FRI", "SAT", "SUN", "MON"};
    if (a == 6) {
      int index = b % base;
      answer = dayOfTheWeek[index];
    }

    // 9월 1일~30일, 12월 1일~31일
    dayOfTheWeek = new String[]{"WED", "THU", "FRI", "SAT", "SUN", "MON", "TUE"};
    if (a == 9 || a == 12) {
      int index = b % base;
      answer = dayOfTheWeek[index];
    }

    // 10월 1일~31일
    dayOfTheWeek = new String[]{"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
    if (a == 10) {
      int index = b % base;
      answer = dayOfTheWeek[index];
    }

    return answer;
  }
}
