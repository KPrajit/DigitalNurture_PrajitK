import CalculateScore from './Components/CalculateScore.js'
import './App.css';

function App() {
  return (
    <div>
      <CalculateScore
        name="Sleeve"
        school="DNV Public School"
        total={284}
        goal={3}
      />
      
    </div>
  );
}

export default App;
