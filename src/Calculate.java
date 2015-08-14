/**
 * Created by asusnote on 02.08.15.
 */
public class Calculate {

    private int result = 0;
    /** функция добавления элемента */
    public void add(int[] params){
        for (Integer param: params){
            this.result =+ param;
        }
    }
    /**получить результат*/
    public int getResult(){
        return this.result;
    }
    /**очистить результат вычислений */
    public void clearResult(){
        this.result = 0;

    }


}
