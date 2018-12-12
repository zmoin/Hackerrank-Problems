#!/bin/bash
read input
[[ "$input" == [yY] ]] && echo "YES" ||
    echo "NO"
