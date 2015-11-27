#!/bin/bash
# use this script on the console, if maven is not installed
# if maven is installed follow the instructions in the README.txt

xjc -d src/main/java -extension -p eu.open_ecvet.entity -b src/main/resources/xsd/bindings.xjb src/main/resources/xsd/draft.xsd 

