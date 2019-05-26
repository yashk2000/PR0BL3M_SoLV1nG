#include<bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    int n;
    string ss;
	cin >> n >> s;
	for(int i=0;i<n;i++)
	{
		if(ss.size() % 2 == 0 || ss.back() != s[i])
			ss.push_back(s[i]);
	}
	if(ss.size() % 2 == 1)
	ss.pop_back();
	cout << n-int(ss.size()) << endl << ss << endl;
}
