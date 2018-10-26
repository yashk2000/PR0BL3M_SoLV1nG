
str1=raw_input("enter string:")
str1=str1.upper()
str2=""
for i in range (len(str1)-1):
    if str1[i]!='A' and str1[i]!='E' and str1[i]!='I' and str1[i]!='O' and str1[i]!='U' and str1[i]!='Y' :
        str2+="."
        str2+=str1[i]
    else:
        continue

print(str2)
