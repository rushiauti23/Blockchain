public class RushChain {

    public static void main(String[] args) {

        Block block1 = new Block("Hi I am the first RushChainCoin", "0");
        System.out.println("Hash for the Block 1 = "+ block1.hash);

        Block block2 = new Block("Hi I am the second RushChainCoin", block1.hash);
        System.out.println("Hash for the Block 2 = "+ block2.hash);

        Block block3 = new Block("Hi I am the third RushChainCoin", block2.hash);
        System.out.println("Hash for the Block 3 = "+ block3.hash);

        Block block4 = new Block("Hi I am the fourth RushChainCoin", block3.hash);
        System.out.println("Hash for the Block 4 = "+ block4.hash);



    }
}
