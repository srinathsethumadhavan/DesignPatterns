

class Game{

    String gameId;
    String gameName;
    Set<Player> players;

    Game(String gameName){
        this.gameId = getRandomId();
        this.gameName = gameName;
        this.players = new HashSet<Player>();
    }


    public void addPlayer(Player player){
        this.set.add(player);
    }

    public void removePlayer(Player player){
        this.set.remove(player);
    }

    private String generateRandomId(){
        return new String();
    }
}




class Player{

    String playerId;
    String playerName;
    int score;


    Player(String playerName){
        this.playerId = generateRandomId();
        this.playerName = playerName;
    }

    public int getScore(){
        return this.score;
    }

    private void setScore(int score){
        this.score = score;
    }


    private String generateRandomId(){
        return new String();
    }
}


class PlayerRepo{
    Map<String,Player> playerRepo = new HashMap<String,Player>();

}


clas GameService{

    public boolean startGame(){

    }

    public boolean endGame(){
        
       
    }
}


class PlayerService{

     public boolean updatePlayerScore(String playerId,int score){
        Player player = map.get(playerId);
        player.setScore(player.getScore()+score);
        return true;
    }
}


class ScoreService{

    public List<Player> getTopPlayers(String gameId){


        List<Player> players = getPlayers(gameId);

        if(players ==null || players.size()==0)
            return new ArrayList<Integer>();
        
        Map<Integer,Set<Player>> map = new HashMap<Integer,Set<Player>>();

        for(Player player : players){
            int score = player.getScore();

            if(!map.containsKey(score))
                map.put(score,new HashSet<Player>());
            map.get(score).add(player);

        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

        maxHeap.addAll(map.keySet());

        List<Player> result = new ArrayList<Player>();
        int count =0;
        while(!maxHeap.isEmpty() && count<5){
            int score = maxHeap.poll();

            for(Player player  : map.get(score)){
                result.add(player);
            }
            count++;
        }


        return list;


}


}