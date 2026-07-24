const ScoreBelow70 = ({ players }) => {
  const lowScorers = players.filter(player => player.score < 70);

  return (
    <ul>
      {lowScorers.map(({ name, score }) => (
        <li key={name}>
          Mr. {name} - {score}
        </li>
      ))}
    </ul>
  );
};

export default ScoreBelow70;