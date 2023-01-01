export default function emojify(message, emoji) {
  const newMessage = message.replaceAll(' ', emoji);

  if (!newMessage.includes(emoji)) {
    return 'invalid string';
  }

  return newMessage;
}
