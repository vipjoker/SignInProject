import React, { useEffect, useState } from 'react'
import axios from "axios"
export default function Home() {

    const [users, setUsers] = useState([])

    useEffect(()=>{
        console.log("Code with arjun")

        loadUsers()
    },[])

    const loadUsers = async ()=>{
        const result = await axios.get('http://localhost:8080/api/user')
        setUsers(result.data);
    }

  return (
    <div className='container'>

        <div className='py-4'>
        <table className="table border shadow">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Country</th>
      <th scope="col">Capital</th>
    </tr>
  </thead>
  <tbody>


    {
        users.map((user,index)=>(

         <tr>
        <th scope="row" key={index}>{index + 1}</th>
        <td>{user.id}</td>
        <td>{user.username}</td>

        <td>
            <button className='btn btn-primary mx-2'>View</button>
            <button className='btn btn-outline-primary mx-2'>Edit</button>
            <button className='btn btn-danger mx-2'>Delete</button>
        </td>
        </tr>

        ))
    }


  
  </tbody>
</table>

        </div>


    </div>
  )
}
