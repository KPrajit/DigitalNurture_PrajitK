const t20Players = [
  "First Player",
  "Second Player",
  "Third Player"
];

const ranjiPlayers = [
  "Fourth Player",
  "Fifth Player",
  "Sixth Player"
];

const indianPlayers = [...t20Players, ...ranjiPlayers];

const TrophyPlayers = () => {
  return (
    <ul>
      {indianPlayers.map(player => (
        <li key={player}>{player}</li>
      ))}
    </ul>
  );
};

export default TrophyPlayers;