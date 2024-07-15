import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class RushChain {

    public static ArrayList<Block> blockChain = new ArrayList<Block>();

    public static void main(String[] args) {

        blockChain.add(new Block("Hi, I am the first Block", "0"));

        blockChain.add(new Block("I am the second block", blockChain.get(blockChain.size()-1).hash));

        blockChain.add(new Block("Hey!! I am the third block", blockChain.get(blockChain.size()-1).hash));

        String blockChainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockChain);
        System.out.println(blockChainJson);


        System.out.println(isChainValid());

    }

    public static Boolean isChainValid(){
        Block currentBlock;
        Block previousBlock;

        for (int i = 1; i<blockChain.size();i++) {
            currentBlock = blockChain.get(i);
            previousBlock = blockChain.get(i-1);

            if(!currentBlock.hash.equals(currentBlock.calculateHash())){
                System.out.println("Current hashes are not equal..");
                return false;
            }



            if(!previousBlock.hash.equals(currentBlock.previousHash)){
                System.out.println("Current hash and previous hash are not equal");
                return false;
            }
        }


        return true;
    }
}
