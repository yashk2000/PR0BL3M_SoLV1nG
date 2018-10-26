import sys
import string
str1=raw_input("enter string one:")
str2=raw_input("enter string two:")
str11=str1.upper()
str22=str2.upper()
for i in range (len(str1)):
    if str11[i]>str22[i]:
       print "1"
       sys.exit()
    elif str11[i]<str22[i]:
       print "-1"
       sys.exit()
    else:
       continue
print "0"
