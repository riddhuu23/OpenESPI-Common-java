#!/usr/bin/env bash
cp prepopulatesql_applicationinformation_dc_localhost8080.sql prepopulatesql_applicationinformation_dc.sql
cp prepopulatesql_applicationinformation_tp_localhost8080.sql prepopulatesql_applicationinformation_tp.sql
cp prepopulatesql_tokenstore_localhost8080.sql prepopulatesql_tokenstore.sql
./initializedatabases.sh

