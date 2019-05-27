k = int(input())
for i in range(5,k//5+1):
    if k%i==0 and k//i>=5 and i>=5:
        s='aeiou'
        for j in range(i):
            for kk in range(k // i):
                print(s[(j + kk) % 5], end='')
        print('')
        break
else:
    print('-1')
