# BCX20 Spring Boot Kotlin sample code for Bosch IoT Cloud

https://docs.cloudfoundry.org/buildpacks/java/index.html
https://docs.bosch-iot-suite.com/things/dev-guide/java-api/

## Running the application locally
1. Clone the repository and move to the project folder
    ```
    git clone https://github.com/tsalm-pivotal/bcx20-samples
    cd bcx20-samples/java-bosch-iot-things-sample
    ```
2. Open the application.yml file in src/main/resources and replace the placeholder values with those appropriate for your environment
    ```
    things-api:
      token-endpoint: https://access.bosch-iot-suite.com/token
      client-id: YOUR_CLIENT_ID
      client-secret: YOUR_CLIENT_SECRET
      scopes: YOUR_SCOPE(S) # e.g. service:iot-things-eu-1:0d7ab098-ebca-4964-89b1-079f6615e982_things/full-access
      websocket-endpoint: wss://things.eu-1.bosch-iot-suite.com
3. Run the application
    ```
    ./mvnw spring-boot:run
    ```
4. Call the API with your Thing id including the namespace
    ```
    curl http://localhost:8080/api/v1/things/[YOUR-THING-ID]
    ```

## Running the application on the BIC (Cloud Foundry)
1. Clone the repository and move to the project folder
    ```
    git clone https://github.com/tsalm-pivotal/bcx20-samples
    cd bcx20-samples/java-bosch-iot-things-sample
    ```
   
2. Install the 'cf' command-line interface for Cloud Foundry

    Follow the instructions on how to install the cf CLI using a **package manager** on Mac OS X and Linux operating systems [here](https://docs.cloudfoundry.org/cf-cli/install-go-cli.html#pkg).
    
    You can install the cf CLI using a **compressed binary** on Windows, Mac OS X, and Linux operating systems [here](https://github.com/cloudfoundry/cli#installers-and-compressed-binaries).
    
3. Log in to the cf CLI with the Bosch IoT Cloud as target
    
    Log in to the cf CLI targeting the Bosch IoT Cloud with the user credentials provided by the BIC team.

    *Hint: The endpoint is not exposed to the public internet, so you have to be connected to Bosch network.*
    ```
    cf login -a api.sys.de1.bosch-iot-cloud.com
    ```
4. Open the application.yml file in src/main/resources and replace the placeholder values with those appropriate for your environment
    ```
    things-api:
      token-endpoint: https://access.bosch-iot-suite.com/token
      client-id: YOUR_CLIENT_ID
      client-secret: YOUR_CLIENT_SECRET
      scopes: YOUR_SCOPE(S) # e.g. service:iot-things-eu-1:0d7ab098-ebca-4964-89b1-079f6615e982_things/full-access
      websocket-endpoint: wss://things.eu-1.bosch-iot-suite.com
5. Build and push your app to Bosch IoT Cloud
    ```
    ./mvnw clean package
    cf push
    ```   
6. Call the API with your Thing id including the namespace
   ```
   curl http://YOUR-APP-URL/api/v1/things/[YOUR-THING-ID]
   ```