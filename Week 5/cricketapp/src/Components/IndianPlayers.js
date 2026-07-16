const team = [
  "Sachin",
  "Dhoni",
  "Virat",
  "Rohit",
  "Yuvraj",
  "Raina"
];

export const IndianPlayers = () => {
  const [first, second, third, fourth, fifth, sixth] = team;

  return (
    <>
      <h2>Odd Players</h2>

      <ul>
        <li>First : {first}</li>
        <li>Third : {third}</li>
        <li>Fifth : {fifth}</li>
      </ul>

      <h2>Even Players</h2>

      <ul>
        <li>Second : {second}</li>
        <li>Fourth : {fourth}</li>
        <li>Sixth : {sixth}</li>
      </ul>
    </>
  );
};