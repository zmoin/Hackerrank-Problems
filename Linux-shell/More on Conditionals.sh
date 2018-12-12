#!/bin/bash
read X
read Y
read Z
if [ $X -eq $Y ] || [ $Y -eq $Z ] || [ $Z -eq $X ]; then
    if [ $((X+Y)) -eq $((Z*2)) ] ||  [ $((Y+Z)) -eq $((X*2)) ] ||  [ $((Z+X)) -eq $((Y*2)) ]; then
        echo 'EQUILATERAL'
    else 
        echo 'ISOSCELES'
        fi
else
    echo 'SCALENE'
    fi


