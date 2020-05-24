import React, { useState } from 'react';
import '../styles/Login.css';
import Header from './Header.js';

function Login() {

  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");

  function handleLoginClick(e){
    e.preventDefault();
    console.log(username);
    console.log(password);
    console.log("How will we impliment login?")
  }

  return (
    <div>
    <Header />
    <div className="centeringStuff">
    <p>Login</p>
    <form>
      <label>
        email:{"  "}
        <input type="text" name="name" onChange={e => setUsername(e.target.value)} />
      </label>
      <br />
      <br />
      <label>
        password:{"  "}
        <input type="password" name="name" onChange={e => setPassword(e.target.value)} />
      </label>
      <br />
      <br />
      <input type="submit" value="Submit" onClick={e => handleLoginClick(e)} />
    </form>
    </div>
    </div>
  );
}

export default Login;
