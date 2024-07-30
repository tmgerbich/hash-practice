import java.util.HashMap;

public class IOU {
    private HashMap<String, String> directory;

    public IOU() {
        this.directory = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        directory.put(toWhom, String.valueOf(amount));
    }

    public double howMuchDoIOweTo(String toWhom) {
        return Double.parseDouble(directory.get(toWhom));
    }

}
