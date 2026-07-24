const CourseDetails = ({ course }) => {
  return (
    <div className="card">
      <h2>Course Details</h2>

      {course.map((course) => (
        <div key={course.id}>
          <h3>{course.name}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
};

export default CourseDetails;