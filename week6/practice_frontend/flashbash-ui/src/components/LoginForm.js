import { useState } from "react";

// const LoginForm = () => {}  ... arrow function syntax of LoginForm()
export default function LoginForm() {
    
    // State Variabls are special in that onChange/mutation of state React will trigger a rerender through called Reconciliation

    // useState() is a function that returns 2 things
    //          0th index: the state variable
    //          1st index: the function to update the state variable
    // let [anmeOfVariable, nameOfFunction] = useState(initialState);


    let [username, updateUsername] = useState("");
    let [password, updatePassword] = useState ("");

    
    function handleChangeUsername(event) {
        updateUsername(event.target.value);
        
    }

    function handleChangePassword(event) {
        updatePassword(event.target.value);
        
    }

    function submit() {
        console.log(username, password);
    }


    return <>
        <input type="text" value={username} onChange= {handleChangeUsername} placeholder="username" /><br/>
        <input type="password" value={password} onChange= {handleChangePassword} placeholder="password"/><br/>
        <button onClick={submit}>Login</button>
    </>
}



