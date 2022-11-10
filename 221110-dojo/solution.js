export default function solution(people, limit) {
  let answer = 0;
  let heavyIndex = people.length - 1;
  let lightIndex = 0;

  const sortedPeopleArray = people.sort((a, b) => a - b);

  while (heavyIndex >= lightIndex) {
    answer += 1;

    if (sortedPeopleArray[lightIndex] + sortedPeopleArray[heavyIndex] <= limit) {
      lightIndex += 1;
    }
    heavyIndex -= 1;
  }

  return answer;
}

export function solution2(people, limit) {
  people.sort((a, b) => a - b);

  let count = 0;

  while (people.length) {
    count += 1;

    if (people[0] + people[people.length - 1] <= limit) {
      people.shift();
      people.pop();
      continue;
    }

    if (people[0] + people[people.length - 1] > limit) {
      people.pop();
    }
  }

  return count;
}

export function solution3(people, limit) {
  people.sort((a, b) => a - b);

  const count = [];

  while (people.length) {
    count.push(1);

    if (people[0] + people[people.length - 1] <= limit) {
      people.shift();
      people.pop();
      continue;
    }

    if (people[0] + people[people.length - 1] > limit) {
      people.pop();
    }
  }

  const result = count.reduce((acc, cur) => acc + cur, 0);

  return result;
}
