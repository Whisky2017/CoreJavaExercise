package ChapterEight;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by 世康 on 2016/10/17.
 */
public class ShowHand {
    //定义玩家数量、卡牌、玩家、玩家手牌
    private int PLAYER_NUM = 5;
    private String[] types = {"方块","梅花","红心","黑桃"};
    private String[] values = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private List<String> cards = new LinkedList<String>();
    private String[] players = new String[PLAYER_NUM];
    private List<String>[] playersCards = new List[PLAYER_NUM];

    //初始化52张卡牌
    public void initCards(){
        for(int i = 0;i < types.length;i++){
            for (int j = 0; j < values.length; j++) {
                cards.add(types[i]+values[j]);
            }
        }
        Collections.shuffle(cards);
    }

    //测试
    //查看cards中卡牌
    public void showAllCards(){
        for (String card : cards){
            System.out.println(card);
        }
    }

    //初始化玩家，为玩家命名
    public void initPlayer(String... names){
        if(names.length > PLAYER_NUM || names.length < 2){
            System.out.println("玩家数量不合格！");
            return;
        }else{
            for (int i = 0; i < names.length ; i++) {
                players[i]=names[i];
            }
        }
    }

    //初始化玩家手牌，玩家起始手牌为空
    public void initPlayerCards(){
        for (int i = 0; i < players.length; i++) {
            if(players[i]!=null && !players.equals("")){
                playersCards[i] = new LinkedList<String>();
            }
        }
    }

    /**
     * 给玩家派发扑克牌
     * @param first 最先派发的玩家
     */
    public void deliverCard(String first){
        int firstPos = ArrayUtils.search(players,first);
        for (int i = firstPos; i < PLAYER_NUM; i++) {
            if (players[i]!=null){
                playersCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }
        for (int i = 0; i < firstPos ; i++) {
            if (players[i]!=null){
                playersCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }
    }

    /**
     * 输出玩家手牌
     */
    public void showPlayerCards(){
        for (int i = 0; i < PLAYER_NUM; i++) {
            if(players[i]!=null){
                System.out.print(players[i]+"：");
                for (String card:playersCards[i]){
                    System.out.print(card+"\t");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args){
        ShowHand showHand = new ShowHand();
        showHand.initPlayer("玩家A","玩家B","玩家C","玩家D","玩家E");
        showHand.initCards();
        showHand.initPlayerCards();
        showHand.showAllCards();
        System.out.println("-----------------");
        showHand.deliverCard("玩家C");
        showHand.showPlayerCards();
        System.out.println("-----------------");
        showHand.deliverCard("玩家A");
        showHand.showPlayerCards();
    }



}
