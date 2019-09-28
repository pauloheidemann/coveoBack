# coveoBack
Repository for Coveo Backend

# Build the project
The project uses Maven, so to build the project you have to run:
```
mvn clean install
```

If you want to skip the tests run:
```
mvn clean install -DskipTests
```

## Run the project
You can run the project two ways:
1. By running the docker-compose.yml in the project. To do that, navigate to the project folder and execute docker-compose up.
If you are using windows you may have to turn off your firewall.
To access the application, open a browser and access http://localhost:8082.

The backend application will run on http://localhost:8080

2. You can clone this project and deploy it to a wildfly server, but you'll have to clone the frontend project as well, which is located in the repository [here](https://github.com/pauloheidemann/coveofront).
The backend project will run in http://localhost:8080 and the frontend project will run on http://localhost:8081
You'll find further instructions on how to run the frontend project in it's repository
