# Example Eclipse Project

[![Build Status](https://travis-ci.org/thomas-fritsch/example.svg?branch=master)](https://travis-ci.org/thomas-fritsch/example)
[![License](https://img.shields.io/badge/license-GPL%203.0-blue.svg)](http://www.gnu.org/licenses/gpl-3.0)

## Features

## Installation

Make sure you have the following prerequisites installed:
* [Java](https://www.java.com/) (version 6 or higher).
* [Eclipse](http://www.eclipse.org) (version 4.4 or higher).
  
#### Installation from Update Site

In Eclipse, do the following:
* Go to menu _Help_ -> _Install New Software..._
* At _Work with:_ enter the URL <http://thomas-fritsch.github.io/example/repository/>
* The install view will present the available things, select the _Example_ category
* Proceed to install the software in the usual manner accepting all defaults
* Eclipse will prompt for a restart, accept this, then Example is usable

#### Installation of Alternate Versions

The above installation mechanism will install the latest official version of
Example. It is possible to install older or newer beta versions of the software
by using <http://dl.bintray.com/thomas-fritsch/eclipse/example/x.y.z> as the
update site URL, where x.y.z is the desired version. You can see the available
versions at <http://dl.bintray.com/thomas-fritsch/eclipse/example/>.

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
