function solution(id_list, report, k) {
  const answer = [id_list.length].fill(0);
  const reportList = {}; //

  id_list.map((user) => {
    reportList[user] = []; // key로 userid를 value로 빈 배열을 가지는 객체
  });

  report.map((user) => {
    const [user_id, report_id] = user.split(' ');
    if (!reportList[report_id].includes(user_id)) {
      reportList[report_id].push(user_id);
    }
  });

  for (const key in reportList) {
    if (reportList[key].length >= k) { // 이용정지 유저
      reportList[key].map((user) => {
        answer[id_list.indexOf(user)] += 1;
      });
    }
  }
  return answer;
}
