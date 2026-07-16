import "./App.css";

import { book } from "./data/book";
import { blog } from "./data/blog";
import { course } from "./data/course";

import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

const App = () => {
  return (
    <div className="container">
      <CourseDetails course={course} />
      <BookDetails book={book} />
      <BlogDetails blog={blog} />
    </div>
  );
};

export default App;