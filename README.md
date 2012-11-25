Sample demo for EclipseLink JPA-RS Feature
=============

Prerequisites
-------------
* Glassfish 3.1.2
* Update ecliplselink bundles (zip at the root folder, to replace in glassfish modules)

Resources
---------
* http://www.unitask.com/oracledaily/2012/10/30/easy-way-to-access-jpa-with-rest-json-xml/
* http://wiki.eclipse.org/EclipseLink/Development/2.4.0/JPA-RS/REST-API

REST API
---------
* PUT : http://localhost:8080/eclipselink-jpars/persistence/plm/entity/Product/
	{
	"id":1,
	"studyCode":"dqs",
	"techCode":"dssd"
	}

* GET : http://localhost:8080/eclipselink-jpars/persistence/plm/entity/Product/3

* GET : http://localhost:8080/eclipselink-jpars/persistence/plm/query/Product.findAll