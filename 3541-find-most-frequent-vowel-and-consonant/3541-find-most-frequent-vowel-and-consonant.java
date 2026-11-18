            class Solution {
                public int maxFreqSum(String s) {
                    Map<Character, Integer> map = new HashMap<>();
                    Map<Character, Integer> map1 = new HashMap<>();
                    String str = "aeiou";
                    for(char c : s.toCharArray()){
                        if(str.contains(c+"")){
                            map.put(c, map.getOrDefault(c,0)+1);
                        }
                        else{
                            map1.put(c, map1.getOrDefault(c,0)+1);
                        }
                    }
                    int maxVowels = 0;
                    for(int val : map.values()){
                        if(maxVowels<val){
                            maxVowels = val;
                        }
                    }
                    int maxConstants = 0;
                    for(int val : map1.values()){
                        if(maxConstants < val){
                            maxConstants = val;
                        }
                    }
                    return maxVowels + maxConstants;
                }
            }