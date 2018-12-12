#!/bin/bash
read counter
sum=0
for ((i=0; i<counter; i++))
    do
        read x
        sum=`expr $x + $sum`
    done
average=$sum/$counter
printf "%.3f\n" `echo $average | bc -l`