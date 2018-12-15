#!/bin/sh
#For each line in a given input file, transform all the occurrences of the word 'thy' with 'your'. Case insisitive
sed -r 's/thy/your/Ig'