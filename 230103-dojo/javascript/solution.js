export default function solution(participant, completion) {
  const sortedParticipant = participant.sort();
  const sortedCompletion = completion.sort();

  const answer = sortedParticipant.find((value, index) => (value !== sortedCompletion[index]));

  return answer || sortedParticipant[sortedParticipant.length - 1];
}
