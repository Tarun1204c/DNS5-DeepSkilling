import { useState, useEffect } from 'react';
import './App.css';

function App() {
  const [students, setStudents] = useState([]);
  const [name, setName] = useState('');
  const [course, setCourse] = useState('');
  const [editingId, setEditingId] = useState(null);

  useEffect(() => {
    fetchStudents();
  }, []);

  const fetchStudents = () => {
    fetch('http://localhost:8080/students')
      .then(res => res.json())
      .then(data => setStudents(data));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (editingId) {
      // UPDATE
      fetch(`http://localhost:8080/students/${editingId}`, {
        method: 'PUT',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ name, course })
      }).then(() => {
        resetForm();
        fetchStudents();
      });
    } else {
      // CREATE
      fetch('http://localhost:8080/students', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ name, course })
      }).then(() => {
        resetForm();
        fetchStudents();
      });
    }
  };

  const handleEdit = (student) => {
    setName(student.name);
    setCourse(student.course);
    setEditingId(student.id);
  };

  const resetForm = () => {
    setName('');
    setCourse('');
    setEditingId(null);
  };

  return (
    <div className="App">
      <h1>Student Management System</h1>

      <form onSubmit={handleSubmit}>
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
        <button type="submit">{editingId ? 'Update' : 'Add'} Student</button>
        {editingId && <button type="button" onClick={resetForm}>Cancel</button>}
      </form>

      <ul>
        {students.map(s => (
          <li key={s.id}>
            {s.name} - {s.course}
            <button onClick={() => handleEdit(s)}>Edit</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;