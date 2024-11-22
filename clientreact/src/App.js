import './App.css';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import Navbar from './layout/Navbar';
import Home from './pages/Home';
import { BrowserRouter as Router,Routes, Route } from 'react-router-dom';
import AddUsers from './users/AddUsers';
function App() {
  return (
    <div className="App">
      <Router>
        <Navbar/>

        <Routes>
          <Route exact path="/" element={<Home/>}/>
          <Route exact path="/adduser" element={<AddUsers/>}/>



        </Routes>



      </Router>

    </div>
  );
}

export default App;
//https://www.youtube.com/watch?v=uk6b97qyTag&list=PL1oBBulPlvs84AmRmT-_3dGz4KHYuINsj&index=15