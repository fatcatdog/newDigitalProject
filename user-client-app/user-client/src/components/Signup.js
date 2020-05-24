import React, { useState } from 'react';
import '../styles/Signup.css';
import Header from './Header.js';

function Signup() {

  const [username, setUsername] = useState("");
  const [confirmUsername, setConfirmUsername] = useState("");
  const [password, setPassword] = useState("");
  const [confirmPassword, setConfirmPassword] = useState("");

  function handleLoginClick(e){
    e.preventDefault();
    console.log(username);
    console.log(password);
    console.log("How will we impliment signup?")
  }

  return (
    <div>
    <Header />
    <div className="centeringStuff">
    <form>
    <p>Signup</p>

      <label>
        email:{"  "}
        <input type="text" name="name" onChange={e => setUsername(e.target.value)} />
      </label>
      <br />
      <br />
      <label>
        confirm email:{"  "}
        <input type="text" name="name" onChange={e => setConfirmUsername(e.target.value)} />
      </label>
      <br />
      <br />
      <label>
        password:{"  "}
        <input type="password" name="name" onChange={e => setPassword(e.target.value)} />
      </label>
      <br />
      <br />
      <label>
        confirm password:{"  "}
        <input type="password" name="name" onChange={e => setConfirmPassword(e.target.value)} />
      </label>
      <br />
      <br />
      <input type="submit" value="Submit" onClick={e => handleLoginClick(e)} />
    </form>
    </div>
    </div>
  );
}

export default Signup;
