
const ListOfPlayers = ({ players }) => {
  return (
    <ul>
      {players.map(({ name, score }) => (
        <li key={name}>
          Mr. {name} - {score}
        </li>
      ))}
    </ul>
  );
};

export default ListOfPlayers;