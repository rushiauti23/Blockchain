import java.util.Date;

public class Block {

    public String hash;
    public String previousHash;
    private String data;
    private long timestamp;

    public Block(String data, String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.timestamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash(){
        return StringUtil.applySha256(previousHash
        +Long.toString(timestamp)+data);
    }

}
