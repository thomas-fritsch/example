# Example Eclipse Project

[![Build Status](https://travis-ci.org/thomas-fritsch/example.svg?branch=master)](https://travis-ci.org/thomas-fritsch/example)
[![License](https://img.shields.io/badge/license-GPL%203.0-blue.svg)](http://www.gnu.org/licenses/gpl-3.0)

## Features

## Installation

Make sure you have the following prerequisites installed:
* [Java](https://www.java.com/) (version 6 or higher).
* [Eclipse](http://www.eclipse.org) (version 4.4 or higher).
  
Install Example into Eclipse from the update site (not yet available).

## Development setup

Make sure you have the following prerequisites installed:
* [JDK](http://www.oracle.com/technetwork/java/javase/downloads/) (version 7 or higher).
* [Maven](http://maven.apache.org/) (version 3).  
  Follow the instructions given in "Download, Install, Run Maven".

A complete build (including unit tests) is done by:

    mvn clean verify

The generated update site will be in directory `de.tfritsch.example.updatesite/target/repository`.

## Release History

* 1.0.0 (not yet released)
  - First public release
