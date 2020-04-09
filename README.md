## Acebook

This is a java/springboot and react project to be developed on.

It uses:
  - `maven` to build the project
  - `webpack` to bundle the javascript
  - `thymeleaf` to serve `index.html`
  - `react` to make requests to the api and render the component views
  - `flyway` to manage `postgres` db migrations

### QuickStart Instructions

- Fork and clone this repository to your machine
- Use an IDE, like `intellij`, and select the project directory to load into the editor (you may need to set the source folder in the project settings)
- From the command line create a dev database `createdb acebook_springboot_development`
- Install Maven `brew install maven`
- Build the app and start the server, using the Maven command `mvn spring-boot:run`
- Visit `localhost:8080`

- Temporarily, if you want to add some posts you can use `curl` to post data to the API and then refresh the page. 
```
curl -X POST 'localhost:8080/api/posts' -d '{"content": "Hi, Folks!"}' -H 'Content-Type: application/json'
```
