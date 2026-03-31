// 921. Minimum Add to Make Parentheses Valid


class Solution {
public:
    int minAddToMakeValid(string s) {
        stack<char> st;
        int additions = 0;
        for(auto it: s)
        {
            if(it == '(')
                st.push(it);
            else
            {
                if(st.empty())
                    additions++;
                else
                    st.pop();
            }
        }        
        return additions+st.size();
    }
};