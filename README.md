# Scala Seed Project

This is maven based scala project skeleton


## Requirements

- JDK
- Python and PIP when using docs

## Features


* Mixed Java and Scala Code
* Incremental Compiling with Zinc (need to download Zinc and run `zinc -start`)
* Scala style checking
* Comprehensive `.gitignore`
* Scalatest integration
* Version management for scala, java and maven
* Markdown based documentation site generation (in `doc` folder)


## Usage

Package

```
mvn clean package
```

Test only

```
mvn test
```


## Documentation

The documents are written in markdown format.

```
cd doc
```


### Install Mkdocs

```
pip install Mkdocs
```

### Preview

In the current directory
```
mkdocs serve
```

Open up <http://127.0.0.1:8000/>

### Add New Pages

* Create new markdown page under `docs`
* Update configuration file `mkdocs.yml`


### More details

<http://www.mkdocs.org/>


