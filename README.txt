for documentation visit: 
https://github.com/openecvet/specification 
http://open-ecvet.eu
use:

mvn clean generate-sources -P xjc 

to build the jaxb classes

a mysql5 database is required

host: localhost
user: ecvet
database: ecvet_draft
password: ecvet

running the tests:

mvn clean test -P xjc 
