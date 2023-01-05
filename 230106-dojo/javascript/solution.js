function makeReportedArray(id_list, reportArray) {
  return id_list.map((value) => ({
    reportedId: value,
    reportingUsers: reportArray.filter((report) => report.reportedUser === value)
      .map((item) => item.reportingUser),
  }));
}

export default function solution(id_list, report, k) {
  const set = new Set();

  report.forEach((value) => set.add(value));

  const reportWithoutDuplicateHistory = [];

  set.forEach((value) => reportWithoutDuplicateHistory.push(value));

  const realReport = reportWithoutDuplicateHistory.map((value) => ({
    reportingUser: value.split(' ')[0],
    reportedUser: value.split(' ')[1],
  }));

  const reportedArray = makeReportedArray(id_list, realReport);

  const realReportedArray = reportedArray.filter((value) => value.reportingUsers.length >= k);

  const result = id_list.map((value) => ({
    reportingUser: value,
    count: realReportedArray.filter((item) => item.reportingUsers.includes(value)).length || 0,
  }));

  return result.map((value) => value.count);
}
