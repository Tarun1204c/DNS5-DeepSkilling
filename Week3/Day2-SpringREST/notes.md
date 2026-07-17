# Week3 Day2 - Spring REST APIs

## Key Concepts

### REST Controller
`@RestController` - Marks a class as a REST API that returns JSON data directly.

### CRUD Endpoints
- `@GetMapping` - Fetch data (GET request)
- `@PostMapping` - Create new data (POST request)
- `@PutMapping` - Update data (PUT request)
- `@DeleteMapping` - Remove data (DELETE request)

### Example Flow
Postman/Browser → sends request → Controller → calls Repository → Database → JSON response back

## Why It Matters
This connects the database layer (JPA) to the outside world, exactly like 
Node/Express routes in SnapFlow.