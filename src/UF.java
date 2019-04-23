/**
 * @ClassName UF
 * @Description
 * @Author zhangzx
 * @Date 2019/4/23 10:39
 * Version 1.0
 **/
public interface UF {

    int getSize();
    boolean isConnected(int p, int q);
    void unionElements(int p, int q);
}
