import { useState } from "react";
const CurrencyConverter = () => {
const [rupees, setRupees] = useState("");
const [euro, setEuro] = useState("");
const handleSubmit = (event) => {event.preventDefault();
    const converted = Number(rupees) / 90; //might vary time to time
    setEuro(converted.toFixed(2));
    alert(
      `Converting to Euro Amount is ${converted.toFixed(2)}`
    );
  };
  return (
    <>
      <h1 style={{ color: "green" }}>
        Currency Converter
      </h1>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Amount</label>
          <input
            type="number"
            value={rupees}
            onChange={(e) =>
              setRupees(e.target.value)
            }
          />
        </div>
        <br />
        <div>
          <label>Currency</label>
          <input
            value={euro}
            readOnly//only for euro
          />
        </div>
        <br />
        <button type="submit">
          Submit
        </button>
      </form>
    </>
  );
};
export default CurrencyConverter;