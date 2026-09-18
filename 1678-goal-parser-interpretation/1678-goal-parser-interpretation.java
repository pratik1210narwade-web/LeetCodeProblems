class Solution {
    public String interpret(String command) {
        String result1 = command.replace("()","o");
        String result2 = result1.replace("(al)", "al");
        return result2;
    }
}