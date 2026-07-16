import { useEffect, useState } from "react";
import Post from "./Post";
const Posts = () => {
    const [posts, setPosts] = useState([]);
    useEffect(() => {
        loadPosts();
    }, []);
    const loadPosts = async () => {
        try {
            const response = await fetch(
                "https://jsonplaceholder.typicode.com/posts"
            );
            const data = await response.json();
            const postList = data.map(
                p => new Post(p.id, p.title, p.body)
            );
            setPosts(postList);
        } catch (error) {
            alert(error.message);
        }
    };
    return (
        <div>
            <h1>Posts</h1>
            {posts.map(post => (
                <div key={post.id}>
                    <h3>{post.title}</h3>
                    <p>{post.body}</p>
                    <hr />
                </div>
            ))}
        </div>
    );
};

export default Posts;