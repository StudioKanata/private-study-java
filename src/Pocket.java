/**
 * Eを使用して作られたPocketクラスはこの時点ではまだ未完成
 * Eの部分が同のような型になるかは、この時点ではまだ決まっていない
 * 2024/01/28
 *
 * -- メモ --
 * ツールからAPI経由でDBに登録する際にSpring BootでJsonArrayを使用できなかった時に使用した
 */

public class Pocket<E> {
    private E data;

    public void add(E generics){
        this.data = data;
    }

    public E get(){
        return this.data;
    }
}
