import "../StyleSheets/mystyle.css";
const percentToDecimal = (decimal) => `${decimal.toFixed(2)}%`;

const calculateScore = (total, goal) => {
  return percentToDecimal((total / goal) );
};

const CalculateScore = ({ name, school, total, goal }) => {
  return (
    <div className="formatstyle">
      <h1 style={{ color: "brown" }}>
        Student Details
      </h1>

      <div className="name">
        <strong>Name:</strong> {name}
      </div>

      <div className="school">
        <strong>School:</strong> {school}
      </div>

      <div className="total">
        <strong>Total:</strong> {total} Marks
      </div>

      <div className="score">
        <strong>Score:</strong> {calculateScore(total, goal)}
      </div>
    </div>
  );
};

export default CalculateScore;