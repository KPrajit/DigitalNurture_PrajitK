import Guest from "./Guest";
import User from "./User";

const Greet = ({ isLoggedIn }) => {

  if (isLoggedIn) {
    return <User />;
  }

  return <Guest />;
};

export default Greet;