class Solution {

    public String encode(List<String> strs) {
      //we will use StringBuilder cause its mutable 
        StringBuilder res = new StringBuilder();
      //we will loop and add in res
        for(String s : strs){
          //mark lenth and stopping point 
            res.append(s.length()).append('#').append(s);
        }
      // just to convert it back to string cuz it needs string type as a return statement
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i<str.length()){
            int j = i;
          //look for checkpoint
            while (str.charAt(j)!='#'){
                j++;
            }
          //take out the lenght so that we now know how long is this
            int length = Integer.parseInt(str.substring(i,j));
            i = j+1;
            j = i+length;
          //add it
            res.add(str.substring(i,j));
          // for the next iteration
            i=j;
        }
        return res;
    }
}
