#!/bin/sh
#For each line in a given input file, transform the first occurrence of the word 'the' with 'this'.
sed -e '/the / s/the/this/'