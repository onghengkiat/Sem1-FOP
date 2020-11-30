//an interface that consists of encode and decode method to be implemented inside the other class
public interface MessageEncoder {
    //encrypty the plain text
    void encode();

    //decode the encrypted text
    void decode();
}