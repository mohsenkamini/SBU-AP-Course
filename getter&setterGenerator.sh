#!/bin/bash
PARAMETERS_FILE=./parameters.txt
GS_FILE=./getterAndSetterFormat.txt

while read -r line;
do
    TYPE=`echo $line | awk '{print $1}'`
    PARAMETER=`echo $line | awk '{print $2}'`
    CPARAMETER=`echo "${PARAMETER^}"`
    cat ${GS_FILE} | sed "s/{TYPE}/${TYPE}/g" | sed "s/{PARAMETER}/${PARAMETER}/g" | sed "s/{CPARAMETER}/${CPARAMETER}/g"
    echo ""
done < ${PARAMETERS_FILE}

