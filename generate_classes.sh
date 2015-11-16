#!/bin/bash
# use this script on the console, if maven is not installed
# if maven is installed follow the instructions in the README.txt

xjc -d src/main/java -p net.impact_eu.ecvet.entity src/main/resources/xsd/draft.xsd

