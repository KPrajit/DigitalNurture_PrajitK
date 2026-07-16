import { useState } from "react";
import Greet from "./components/Greet";
import Login from "./components/Login";
import Logout from "./components/Logout";

const App = () => {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const handleLogin = () => {
    setIsLoggedIn(true);
  };
  const handleLogout = () => {
    setIsLoggedIn(false);
  };
  return (
    <div
      style={{
        padding: "40px"
      }}
    >
      <Greet
        isLoggedIn={isLoggedIn}
      />
      <br />
      {isLoggedIn ? (
        <Logout
          onClick={handleLogout}
        />
      ) : (
        <Login
          onClick={handleLogin}
        />
      )}
    </div>
  );
};

export default App;