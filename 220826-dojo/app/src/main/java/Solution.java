// 1. 매개변수 s: 일부 자릿수가 영단어로 바뀐(또는 바뀌지 않음) 문자열

// 2. 해야할 것: 이 문자열을 원.래. 숫자로 리턴하기

// 3. 가장 작게 쪼갤 수 있는 단위는 뭐가 있을까?
//  1) s의 모든 요소가 숫자이면 그냥 숫자 그대로 뱉어내기 => 어떻게 확인? 아스키? 알파벳 테이블?
//     그냥 s가 모두 숫자라고 생각하고 뱉어내도록 만들자. 오케이. 들어온 s를 그냥 인티저로 형변환하여 리턴

//  2) s의 요소에 단 1개라도 문자가 섞여있으면 그때부터 골치. 쪼개서 생각하자.
//     - 만약 단 하나의 단어가 들어왔고 그걸 숫자로 뱉어내야 한다면? => 예. s == eight 라면?
//     - 또 잘개 쪼개자. s가 숫자면 int 형변환 후 리턴, s가 eight이라면 숫자 8을 뱉어내도록. 오케이 통과.
//     - 이번엔 한번만 다른걸로 해보자. s가 five라면? 숫자 5를 뱉어내도록.
//     - 그럼 1의자리 숫자에 대해서는 모든 switch 문으로 '문자열인지' 또는 숫자인지 에 대해서 반환을해줄 수 있겠음. 오케이 얘도 함
//     - 그럼 두자리 숫자에 대해서는? 경우의 수를 쪼개보자. (1) 다 숫자이던지, (2) 문자+숫자, (3) 숫자+문자, (4) 올 문자
//     - 테스트 먼저 작성. 다 깨지는데 그린을 내기 위해 우선 switch case에 그 4개의 경우의 수만 추가. 오케이. 하나씩 또 쪼개자.
//  3) 두자리 숫자가 모두 다 숫자형태의 문자열이라면 어떻게 판별할것임? => 이거 아스키코드 번호로 할 수 있나..?
//      - 아니면 숫자/문자 섞여있는 문자열을 인트형으로 강제 변환하려고 할 때 에러가 있으면 자바는 어떤 에러를 내뱉나? (스크립트의 경우 NaN 이런거던데) => 넘버포맷 익셉션
//      -또 쪼개자. for문으로 돌면서 둘 다 모두 숫자이면 그대로 내뱉기.
//      - 쪼개... 딱 정하자 케이스를 .String temp 변수를 만들어서 각 변환한 내용을 더해준담에 나중에 한번에 인트로 전환
//      (1) 14 라면? charAt(0)은 숫자, charAt(1)도 숫자. 둘 다 아스키코드로 변환시킨담에 숫자 범위 안에 포함되면 temp에 걍 더해주는걸로
//

class Solution {
  public int solution(String s) {
    int answer = 0;

    String tempNumber = "";

    for (int i = 0; i < s.length(); i += 1) {
      int asciiCodeNumber = s.charAt(i);

      if (asciiCodeNumber >= 48 && asciiCodeNumber <= 57) {
        tempNumber += s.charAt(i) + "";
      }

      if (asciiCodeNumber == 122) {     // zero는 유니크
        tempNumber += "0";
        i += 3;
        continue;
      }

      if (asciiCodeNumber == 111) {     // one 유니크
        tempNumber += "1";
        i += 2;
        continue;
      }

      if (asciiCodeNumber == 101) {     // eight 유니크
        tempNumber += "8";
        i += 4;
        continue;
      }

      if (asciiCodeNumber == 110) {     // nine 유니크
        tempNumber += "9";
        i += 3;
        continue;
      }

      if (asciiCodeNumber == 116) {     // 2와 3의 구별
        if (s.charAt(i + 1) == 119) {
          tempNumber += "2";
          i += 2;
          continue;
        }

        if (s.charAt(i + 1) == 104) {
          tempNumber += "3";
          i += 4;
          continue;
        }
      }

      if (asciiCodeNumber == 102) {     // 4와 5의 구별
        if (s.charAt(i + 1) == 105) {
          tempNumber += "5";
          i += 3;
          continue;
        }

        if (s.charAt(i + 1) == 111) {
          tempNumber += "4";
          i += 3;
          continue;
        }
      }

      if (asciiCodeNumber == 115) {     // 6와 7의 구별
        if (s.charAt(i + 1) == 105) {
          tempNumber += "6";
          i += 2;
          continue;
        }

        if (s.charAt(i + 1) == 101) {
          tempNumber += "7";
          i += 4;
          continue;
        }
      }

      if (i >= s.length() - 1) {
        break;
      }
    }

    answer = Integer.parseInt(tempNumber);
    return answer;
  }
}

//
//    answer = switch (s) {
//      case "zero" -> 0;
//      case "one" -> 1;
//      case "two" -> 2;
//      case "three" -> 3;
//      case "four" -> 4;
//      case "five" -> 5;
//      case "six" -> 6;
//      case "seven" -> 7;
//      case "eight" -> 8;
//      case "nine" -> 9;
//      default -> Integer.parseInt(s);
//    };
