#!/usr/bin/env bash
cp prepopulatesql_applicationinformation_dc_testthirdpartysecure.sql prepopulatesql_applicationinformation_dc.sql
cp prepopulatesql_tokenstore_testthirdpartysecure.sql prepopulatesql_tokenstore.sql
./initializedatabases.sh
