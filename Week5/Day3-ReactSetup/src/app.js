import { useState, useEffect } from 'react';
import './App.css';

function App() {
  const [students, setStudents] = useState([]);

  useEffect(() => {
    fetchStudents();
  }, []);

  const fetchStudents = () => {
    fetch('http://localhost:8080/students')
      .then(res => res.json())
      .then(data => setStudents(data))
      .catch(err => console.error('Error:', err));
  };

  return (
    <div className="App">
      <h1>Student Management System</h1>
      <ul>
        {students.map(s => (
          <li key={s.id}>{s.name} - {s.course}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;