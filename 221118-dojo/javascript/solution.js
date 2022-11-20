export default function solution(cacheSize, cities) {
  let answer = 0;
  const cache = new Map();

  cities.forEach((city) => {
    city = city.toLowerCase();

    if (cache.has(city)) {
      cache.delete(city);
      cache.set(city);
      answer += 1;

      return;
    }

    if (cache.size === cacheSize) {
      cache.delete(cache.keys().next().value);
    }

    if (cacheSize > 0) {
      cache.set(city);
    }

    answer += 5;
  });

  return answer;
}
