class Solution {
    //Shaikh_Mohammad_Shoaib
    public int calculate(String s) {
        Stack<Integer> stk = new Stack<>();
        int num = 0;
        int result = 0;
        int sign = 1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' ') continue;
            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
            }else if(ch == '+'){
                result += sign * num;
                num = 0;
                sign = 1;
            }else if(ch == '-'){
                result += num * sign;
                num = 0;
                sign = -1;
            }else if(ch == '('){
                stk.push(result);
                stk.push(sign);
                result = 0;
                sign = 1;
            }else if(ch == ')'){
                result += sign * num;
                num = 0;
                result *= stk.pop();
                result += stk.pop();
            }
        }
        result += sign * num;
        return result;
    }
}