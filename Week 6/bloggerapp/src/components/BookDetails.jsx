const BookDetails = ({ book}) => {
  return (
    <div className="card">
      <h2>Book Details</h2>

      {book.map((book) => (
        <div key={book.id}>
          <h3>{book.name}</h3>
          <p>₹ {book.price}</p>
        </div>
      ))}
    </div>
  );
};

export default BookDetails;