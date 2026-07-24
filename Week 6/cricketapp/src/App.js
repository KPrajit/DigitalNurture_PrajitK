import {players} from './data/players.js'
import ListofPlayers from "./Components/ListofPlayers";
import ScoreBelow70 from "./Components/ScoreBelow70";
import { IndianPlayers } from "./Components/IndianPlayers";
import TrophyPlayers from "./Components/TrophyPlayers";
import './App.css';

function App() {
  const flag = true;

  return (
    <>
      {flag ? (
        <>
          <h1>List of Players</h1>
          <ListofPlayers players={players} />
          <hr />
          <h1>Players Scoring Below 70</h1>
          <ScoreBelow70 players={players} />
        </>
      ) : (
        <>
          <IndianPlayers />
          <hr />
          <h1>Merged Indian Players</h1>
          <TrophyPlayers />
        </>
      )}
    </>
  );
}

export default App;
