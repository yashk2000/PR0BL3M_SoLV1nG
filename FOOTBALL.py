str=raw_input("enter arrangment of players:")
count=0
for i in range (len(str)-1):
    if(str[i]==str[i+1]):
       count=count+1
if(count>=7):
   print "dangerous"
else:
   print "not dangerous"
