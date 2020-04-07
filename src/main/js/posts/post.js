import React from 'react';

const Post = (props) => {
	return (
		<div className='post-main'>
			<div className='post-content'>
				{props.post.content}
			</div>
            <div className='post-timestamp'>
                {props.post.timestamp}
            </div>
		</div>
	)
}

export default Post;
