import React from 'react';

const Post = (props) => {
	return (
		<div className='post-main'>
			<div className='post-content'>
				<strong>{props.post.content}</strong>
			</div>
            <div className='post-timestamp'>
                Posted on: {props.post.timestamp}
            </div>
		</div>
	)
}

export default Post;
