#!/bin/bash
find -name .settings -exec rm {} -rf \; 
find -name .project -exec rm {} -rf \;
find -name .tern-project -exec rm {} -rf \;
find -name .classpath -exec rm {} -rf \;
find -name .idea -exec rm {} -rf \;
find -name *.iml -exec rm {} -rf \;
find -name *.externalToolBuilders -exec rm {} -rf \;
