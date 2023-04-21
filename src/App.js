// import './App.css';
// import axios from "axios";
// import {useState} from "react";
// import {useEffect} from "react";
// function App() {
//   const quoteUrl="https://gist.githubusercontent.com/camperbot/5a022b72e96c4c9585c32bf6a75f62d9/raw";
//   const [quote,setQuote]=useState("");
//   const [author,setAuthor]=useState("");
  
//   useEffect(() => {
//     return () => {
//       generateQuote();
//     };
//   },[]);

//   function generateQuote(){
//     let x=Math.floor((Math.random()*100));

//     axios.get(quoteUrl).then((res)=>{
//       setQuote(res.data.quotes[x].quote);
//       setAuthor(res.data.quotes[x].author);
//       console.log(res);
//     });
//   }
//   return (
//     <div className='wrap'>
//       <div className='inner-wrap'>
//         <h1 className='quote'>{quote}</h1>
//         <h3 className='author'>-{author}</h3>
//         <button onClick={generateQuote}>Click for a quote!</button>
//       </div>
//     </div>
//   );
// }

// export default App;


import './App.css';
import axios from "axios";
import {useState} from "react";
import {useEffect} from "react";
import Header from './header';
import Footer from './footer';
function App() {
  const quoteUrl="https://gist.githubusercontent.com/camperbot/5a022b72e96c4c9585c32bf6a75f62d9/raw";
  const [quote,setQuote]=useState("");
  const [author,setAuthor]=useState("");
  const [color, setColor] = useState('#4CAF50');
  
  
  useEffect(() => {
    return () => {
      generateQuote();
    };
  },[]);

  function generateQuote(){
    let x=Math.floor((Math.random()*100));

    axios.get(quoteUrl).then((res)=>{
      setQuote(res.data.quotes[x].quote);
      setAuthor(res.data.quotes[x].author);
      console.log(res);

      
      const colors = ['#392b44', '#6f244e', '#ca135e', '#dde3f4', '#fe7c73', '#b23b6b', '#ffbdbd', '#FFA07A', '#F08080','#95d0dc','#dd585b','#82282b','#aface6','#ffbdbd'];
      const randomColor = colors[Math.floor(Math.random() * colors.length)];
      setColor(randomColor);

    });
  }
  return (
    <div className='wrap' style={{backgroundColor:color}}>
    <Header/>
      <div className='inner-wrap' style={{backgroundColor:color}}>
        <h1 className='quote'>{quote}</h1>
        <h3 className='author'>-{author}</h3>
        <button onClick={generateQuote}>Click for a quote!</button>
      </div>
      <h1>  </h1>
      <h1>  </h1>
      <Footer/>
      
    </div>
  );
}

export default App;