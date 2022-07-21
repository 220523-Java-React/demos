// props- a concept in react of supplying statements to subcomponents

//What is conditional Rendering??
//  change what is rendering based on some kind of condition
export default function Navbar({user}) {

   // console.log(props);
   // return <h1>Hello (props.user.name) Welcome to Flashbash</h1>


   // if the user exists render one thing
   // if they don't render something different
   //if(props.user) {
   // return <h1>Hello {props.user.name}!</h1>    
   // } else {
   //     return <h1>Please log in !! :D</h1>
   // }
   
   // typically, React devs use ternary based conditional 
   // syntax: return <condition> ? <truthy> : <falsey>
    return user ?
    <h1>Hello {user.name}!</h1> : 
    <h1>Please log in!! :D</h1>
}