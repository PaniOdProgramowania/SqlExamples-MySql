# How to run
1. Run these commands in the terminal:
`docker run paniodprogramowania/pop-dancers-mysql`
2. Run App from IntelliJ

## Further Troubleshooting: 
- ### How to rebuild Dockerfile?
In `git bash` or in UNIX-command line run this command `./run.sh <password> <username>`. It should build and run a fresh docker container directly from `infrastructure` directory.

- ### Docker seems to turn off unexpectedly?
Delete old Docker's image by using this command:
`docker image remove pop-dancers`
or
`docker container remove pop-dancers`

- ### How to run from local docker image and container
1. Make sure you have `docker` installed and running. `docker run hello-world` should work for you
2. In `git bash` or in UNIX-command line run the following commands. Remember to <b> exchange `<password>` and `username` with data I provided to you!</b>
   ```shell
   chmod 755 run.sh
   ./run.sh <password> <username>
   ```
3. Fill in the blanks in file `application-local.properties` with password and username. They should be of the same value as the ones in the previous point.


