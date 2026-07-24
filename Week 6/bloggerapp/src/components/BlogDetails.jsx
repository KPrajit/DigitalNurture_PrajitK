const BlogDetails = ({ blog }) => {
  return (
    <div className="card">
      <h2>Blog Details</h2>

      {blog.map((blog) => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <h4>{blog.author}</h4>
          <p>{blog.description}</p>
        </div>
      ))}
    </div>
  );
};

export default BlogDetails;