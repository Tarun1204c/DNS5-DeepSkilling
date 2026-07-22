import { useState, useEffect } from 'react';
import './App.css';

function App() {
  const [students, setStudents] = useState([]);
  const [name, setName] = useState('');
  const [course, setCourse] = useState('');

  useEffect(() => {
    fetchStudents();
  }, []);

  const fetchStudents = () => {
    fetch('http://localhost:8080/students')
      .then(res => res.json())
      .then(data => setStudents(data));
  };

  const handleAddStudent = (e) => {
    e.preventDefault();
    fetch('http://localhost:8080/students', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ name, course })
    })
      .then(res => res.json())
      .then(() => {
        setName('');
        setCourse('');
        fetchStudents();
      });
  };

  return (
    <div className="App">
      <h1>Student Management System</h1>

      <form onSubmit={handleAddStudent}>
        <input
          type="text"
          placeholder="Name"
          value={name}
          onChange={(e) => setName(e.target.value)}
          required
        />
        <input
          type="text"
          placeholder="Course"
          value={course}
          onChange={(e) => setCourse(e.target.value)}
          required
        />
        <button type="submit">Add Student</button>
      </form>

      <ul>
        {students.map(s => (
          <li key={s.id}>{s.name} - {s.course}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;