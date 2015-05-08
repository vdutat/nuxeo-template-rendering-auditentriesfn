# nuxeo-template-rendering-auditentriesfn
===

## About this module

This module provides a a new `template rendering` function extension called `auditentriesfn`. It provide function `auditentriesfn.last(number)` which returns the last `number` entries in the current document's history.

## Why this module

The context variable `auditentries` contains all the document's audit entries. With `auditentriesfn` you are able to retrieve a reduced set of the last audit entries.

e.g. `${auditentriesfn.last(5)}` returns the last 5 entries in the document history.

## Building 

        mvn clean install

## Using

All you have to do is:

 - to copy the bundle in `nxserver/plugins` or `nxserver/bundles`
 - restart the server

After restart, the `auditentriesfn` extension will be available in templates.
