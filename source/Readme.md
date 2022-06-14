# Source Code of NLX

Install Instructions: 

1. to run the code import all projects into eclipse as plugin projects
skip all plugin projects wich ends with `.test`
create a new launch configuration from NLX.product
be sure only org.antlr.runtime.3.2.0 is selected in the launch configuration

2. install Neo4j Database and dumb the database under `database\` with
neo4j-admin dump --database=<database> --to=<destination-path>
(see Neo4j Documentation: [Neo4j Documentation dump-load](https://neo4j.com/docs/operations-manual/3.5/tools/dump-load/)
  
3. import the demo workspace: [resources/demo.project](https://github.com/validas/NLX/tree/master/resources/demo.project)

4. enjoy!

- Felix Schaller
