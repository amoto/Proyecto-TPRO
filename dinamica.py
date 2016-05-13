from sys import stdin
F,n,d=None,None,None
def func(h):
    global F
    F=[[0 for i in range (h+1)]for i in range(n)]
    for i in range(h+1):
        F[1][i]=i+2
        F[0][i]=2*i+3
        #F[2][i]=i*i-i
        #F[3][i]=3*i+i//2
def recurr(n,h):
    global F
    if(n==1):
        return F[n-1][h]
    elif (h==0):
        #return max(F[0][0],F[1][0],F[2][0],F[3][0])//n
        return max(F[0][0],F[1][0])//n
    else:
        maxi=0
        for i in range(n):
            maxi=max(maxi,F[i][h])
        maxi=maxi//n
        return max(maxi, max(F[n-1][i]//n+recurr(n-1,h-i) for i in range(h+1)))
def dp(n,h):
    global F,d
    d=[[0 for i in range(h+1)]for i in range(n)]
    '''for i in range(h+1):
        d[0][i]=F[0][i]'''
    for i in range(1,n):
        d[i][0]=max(F[j][0] for j in range(n))//i
    for i in range(1,n):
        for j in range(1,h+1):
            d[i][j]=max(max(F[k][j]//n for k in range(i)),max(F[i][k]//n+d[i-1][j-k] for k in range(j+1)))
def main():
    global n,d
    n=2
    h=int(stdin.readline().strip())
    func(h)
    for i in range(n):
        print(F[i])
    print(recurr(n,h))
    dp(n,h)
    print(d[n-1][h])


main()
