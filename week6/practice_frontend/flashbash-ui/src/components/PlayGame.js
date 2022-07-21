

import React from "react";
// import "./styles.css";

export default function PlayGame() {
  function play() {
    console.log("You Won!");
  }

  return (
    <div onClick={play()}>
      <p>Click this text to see the event bubbling</p>
      <button onClick={play}>Play Game</button>
    </div>
  );
}