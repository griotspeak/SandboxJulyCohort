import java.util.HashSet;
import java.util.List;


public class HanoiTowerRod extends HashSet<Integer> {

    public HanoiTowerRod () {
        super();
    }

    @Override
    public boolean add (Integer disc) {
        Integer smallestValue = this.findSmallestValue();

        if ((smallestValue == null) || (smallestValue > disc)) {
            super.add(disc);
            return true;
        } else {
            return false;
        }
    }

    public Integer removeTop () {
        Integer smallest = findSmallestValue();

        if (this.size() == 0) {
            return null;
        }
        super.remove(findSmallestValue());
        return smallest;
    }

    public Integer findSmallestValue () {
        if (this.size() == 0) {
            return null;
        } else {
            Integer back = Integer.MAX_VALUE;

            for (Integer value : this) {
                back = Math.min(value, back);
            }

            return back;
        }
    }
}
