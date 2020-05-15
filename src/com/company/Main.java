//PRACTICE
//A.A.

    //a)
    public boolean hasConsecutiveDuplicates() {
        for (int i = 1; i < tiles.length; i++){
            if(tiles[i].getLetter().equals(tiles[i+1].getLetter)){
                return true;
            }
        }
        return false;
    }


    //b)
    public int getTotalPoints(){
        int pints = 0;
        for(int i=0; i<tiles.length; i++){
            points += tiles[i].getValue();
            }
        if(hasConsecutiveDuplicates()){
            points*=2;
            }
        return points;
    }

    //c)
    public static Word getHighestScoreWord(List <Word> words){
    int max = words.get(0).getTotalPoints();
    for(int i=1; i< words.size()-1, i++){
        if(words.get(i).getTotalPoints()>words.get(i-1).getTotalPoints())
            max = words.get(i).getTotalPoints;
        }
    return max;
    }