//an interface that consists of encode and decode method to be implemented inside the other class
public interface MessageEncoder {
    //encrypty the plain text
    public String encode(String plainText);

    //decode the encrypted text
    public String decode(String cipherText);
}