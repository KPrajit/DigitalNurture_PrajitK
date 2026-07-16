import { useState } from "react";
import CurrencyConverter from "./Components/CurrencyConverter";

const App = () => {
  const [count, setCount] = useState(0);
  const increment = () => {
    setCount((prev) => prev + 1);
  };
  const decrement = () => {
    setCount((prev) => prev - 1);
  };
  const sayHello = () => {
    alert("Hello!");
  };
  const handleIncrement = () => {
    increment();
    sayHello();
  };
  const sayWelcome = (message) => {
    alert(message);
  };
    const handleClick = (event) => {
    alert("I was clicked");
    console.log(event);
  };
  return (
    <div style={{ padding: "30px" }}>
      <h2>{count}</h2>
      <button onClick={handleIncrement}>
        Increment
      </button>
      <br />
      <br />
      <button onClick={decrement}>
        Decrement
      </button>
      <br />
      <br />
      <button
        onClick={() =>
          sayWelcome("Welcome")
        }
      >
        Say Welcome
      </button>
      <br />
      <br />
      <button onClick={handleClick}>
        Click on Me
      </button>
      <hr />
      <CurrencyConverter />
    </div>
  );
};
export default App;