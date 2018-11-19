/* Enter your macros here */
# define toStr(input) #input
# define io(target) cin >> target
# define FUNCTION(name, operator) inline void name(int &x, int &y){if(!(x operator y)){x = y;}}
# define INF 2147483647
# define foreach(vector, i) for(int i = 0; i < vector.size(); i++)