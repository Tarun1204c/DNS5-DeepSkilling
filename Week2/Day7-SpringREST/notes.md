# Day 7 - Spring REST APIs

## Key Concepts

### 1. REST API
A way for different applications (frontend, Postman, mobile app) to communicate 
with the backend over HTTP, using standard operations.

### 2. CRUD Operations (HTTP Methods)
- **GET** - Read/fetch data
- **POST** - Create new data
- **PUT** - Update existing data
- **DELETE** - Remove data

### 3. Key Annotations
- `@RestController` - Marks a class as a REST API controller (combines @Controller + @ResponseBody)
- `@RequestMapping` - Defines the base URL path for a controller
- `@GetMapping` - Maps HTTP GET requests to a method
- `@PostMapping` - Maps HTTP POST requests to a method
- `@PutMapping` - Maps HTTP PUT requests to a method
- `@DeleteMapping` - Maps HTTP DELETE requests to a method
- `@PathVariable` - Extracts values from the URL (e.g., /students/{id})
- `@RequestBody` - Extracts JSON data sent in the request body

### 4. Example Flow