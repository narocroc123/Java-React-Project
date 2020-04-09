import React from 'react';
const client = require('../client');

class CreatePost extends React.Component {
    constructor(props) {
        super(props)
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleSubmit(e) {
        e.preventDefault();
        fetch('/api/posts', {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({
                content: this.refs.content.value
            })
        });
        this.refs.content.value='';
        this.props.update;
        window.location.reload();
    }

    render() {
        return(
            <div>
                <div className='create-post-header'>
                    <h4>Create A Post</h4>
                </div>
                <div className='create-post-body'>
                    <form onSubmit={this.handleSubmit}>
                        <input className='create-post-content' ref='content' id='content' name='content' type='text' placeholder='Create Post' />
                        <input className='button' type='submit' name='Create Post' />
                    </form>
                </div>
            </div>
        );
    }
}

export default CreatePost;