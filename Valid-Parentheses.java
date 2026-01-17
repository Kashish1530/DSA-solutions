1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4        for(int i=0; i<s.length(); i++){
5            char ch = s.charAt(i);
6
7        if (ch == '{' || ch== '[' || ch== '('){
8            stack.push(ch);
9        } else{
10           if (stack.isEmpty()) return false; 
11           char top = stack.pop();
12           if(ch == ')' && top != '(') return false;
13           if (ch == ']' && top != '[') return false;
14           if(ch == '}' && top != '{') return false;        }
15        }
16        return stack.isEmpty();
17    }
18        
19}