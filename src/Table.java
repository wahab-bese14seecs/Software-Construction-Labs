/**
 * Created by AWShades on 3/2/2017.
 */
public class Table {
    private int available;

    public int getAvailable() {
        return available;
    }

    public void availableup(){
        available++;
    }
    public void availabledown(){
        available--;
    }
    public boolean checkavailable(){
        if(available != 0){
            return true;
        }
        else
            return false;
    }
    Table(int a){
        available = a;
    }
}

