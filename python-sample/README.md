# BCX20 Python sample code for Bosch IoT Cloud

https://docs.cloudfoundry.org/buildpacks/python/index.html

## Running the application locally
1. Clone the repository and move to the project folder
    ```
    git clone https://github.com/tsalm-pivotal/bcx20-samples
    cd bcx20-samples/python-sample
    ```
2. Run the application
    ```
    FLASK_APP=app.py flask run --host=0.0.0.0 --port=8080
    ```
3. Call the API
    ```
    curl http://localhost:8080/api/v1/messages
    ```

## Running the application on the BIC (Cloud Foundry)
1. Clone the repository and move to the project folder
    ```
    git clone https://github.com/tsalm-pivotal/bcx20-samples
    cd bcx20-samples/python-sample
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
4. Build and push your app to Bosch IoT Cloud
    ```
    cf push
    ```   
5. Call the API
    ```
    curl https://YOUR-APP-URL/api/v1/messages
    ```