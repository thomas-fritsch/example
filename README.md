# Example Eclipse Project

[![Build Status](https://travis-ci.org/thomas-fritsch/example.svg?branch=master)](https://travis-ci.org/thomas-fritsch/example)
[![License](https://img.shields.io/badge/license-GPL%203.0-blue.svg)](http://www.gnu.org/licenses/gpl-3.0)
[![Download](https://api.bintray.com/packages/thomas-fritsch/eclipse/example/images/download.svg) ](https://bintray.com/thomas-fritsch/eclipse/example/_latestVersion)

Just a meaningless sample Eclipse project

## Features
* Build by Maven/Tycho
* Continuous Integration on [![](https://avatars.githubusercontent.com/u/639823?s=24)Travis CI](https://travis-ci.org/thomas-fritsch/example)
* Releases deployed on [![](https://avatars.githubusercontent.com/u/4857392?s=24)Bintray](https://bintray.com/thomas-fritsch/eclipse/example)
* P2 Composite Update Site hosted on [![](https://avatars.githubusercontent.com/u/9919?s=24)GitHub Pages](https://thomas-fritsch.github.io/example/repository/)

## Installation

Make sure you have the following prerequisites installed:
* [Java](https://www.java.com/) (version 6 or higher).
* [Eclipse](http://www.eclipse.org) (version 4.4 or higher).
  
#### Installation from Update Site

* In Eclipse open menu _Help_ -> _Install New Software..._
* Use the _Add..._ button to add a new repository with  
  _Name:_ `Example`  
  _Location:_ `http://thomas-fritsch.github.io/example/repository/` 
* Wait for the software list to be displayed, select _Example_
* Follow the instructions in the usual manner

## Development setup

#### Prerequisites

* [JDK](http://www.oracle.com/technetwork/java/javase/downloads/) (version 7 or higher).
* [Maven](http://maven.apache.org/) (version 3).  
  Follow the instructions given in "Download, Install, Run Maven".

#### Build

A complete build (including unit tests) is done by:

    mvn clean verify

The generated update site will be in directory `de.tfritsch.example.updatesite/target/repository`.

## Release History

* [1.0.1](https://github.com/thomas-fritsch/example/releases/tag/1.0.1) - 27 Nov 2016
* [1.0.0](https://github.com/thomas-fritsch/example/releases/tag/1.0.0) - 30 Oct 2016
