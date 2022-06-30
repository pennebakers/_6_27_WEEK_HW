public class Reverse {
    public boolean isExactReverse(String x, String y){
        int xLength = x.length();
        int yLength = y.length()-1;
        int correctTotal = 0;

        if(x.length() == y.length()){
            for(int i = 0; i < x.length(); i++){
                if(x.charAt(i) == y.charAt(yLength)){
                    correctTotal++;
                    yLength--;
                }
                else{
                    continue;
                }
            }
            if(correctTotal == xLength){
                return true;
            }

        }


        return false;
    }
}
