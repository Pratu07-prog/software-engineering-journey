// 739. Daily Temperatures

class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        stack<int> st;
        int n = temperatures.size();
        vector<int> res(n);
        for(int i=0;i<n;i++)
        {
            while(!st.empty() && temperatures[i] > temperatures[st.top()])
            {
                int j = st.top();
                st.pop();
                res[j] = i-j;
            }
            st.push(i);
        }
        while(!st.empty())
        {
            res[st.top()] = 0;
            st.pop();
        }
        return res;
    }
};