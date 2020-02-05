![Cognifide logo](https://assets.cognifide.com/github/cognifide-logo.png)

Slice-CQ56
========

![Slice logo](https://github.com/Cognifide/Slice/raw/master/assets/slice_logo.png)

## Purpose

This is add-on which extends [Slice](https://github.com/Cognifide/Slice) functionality to support CQ version 5.6. It defines additional Guice modules which provides CQ-specific objects like Page, PageManager, etc.

Slice - a framework which simplifies Sling/CQ development by using dependency injection pattern and mapping Sling resources into Java objects. Slice repository: https://github.com/Cognifide/Slice

## Prerequisites

* Slice 4.2
* CQ 5.6
* Apache Sling 2
* Maven 2.x, 3.x

## Installation

Slice and all add-ons are available from Maven Central Repo. However if you want to check out the newest development version, do the following:

Checkout the source code:

    cd [folder of your choice]
    git clone git://github.com/Cognifide/Slice-CQ56.git
    cd Slice-CQ56

Compile and install:

    mvn clean install

## Usage

Add dependencies to your POM file:

   
    <dependency>
        <groupId>com.cognifide.slice-addon</groupId>
        <artifactId>slice-cq56</artifactId>
        <version>2.1.0</version>
    </dependency>
    
## Documentation

* [Slice wiki](https://cognifide.atlassian.net/wiki/display/SLICE)
* [Slice users mailing group](http://slice-users.2340343.n4.nabble.com/) if you have any question on how to use it
* [Slice issue tracking](https://cognifide.atlassian.net/browse/SLICE)

## Commercial Support

Technical support can be made available if needed. Please [contact us](mailto:slice-support@cognifide.com) for more details.

We can:

* prioritize your feature request,
* tailor the product to your needs,
* provide a training for your engineers,
* support your development teams.
