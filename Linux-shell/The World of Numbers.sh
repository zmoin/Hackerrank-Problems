#!/bin/bash
read a
read b
printf "%s\n" $a{+,-,*,/}"($b)" | bc -s

