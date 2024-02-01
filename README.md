# LBG-SOFTWARE-PROJECT4
Reference solution for project 4, covering testing with selenium

## Requirements
* Java 17 JDK
* Jenkins (latest)
* NodeJS (version 16.2)
* Google Chrome
* Chromedriver
* IIS Enabled

## Jenkins Config
* Maven:
  *   Under manage jenkins > tools, add a maven installation called 'M3'.
  *   Under manage jenkins > plugins > available plugins, install 'maven pipeline integration'

## Server Config
* IIS
  *  Ensure that IIS is enabled
  *  Ensure that C:\Windows\System32\inetsrv is added to the system path 
