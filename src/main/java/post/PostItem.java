package post;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PostItem {

    protected final String receiver;
    protected final double weight;
    //Versandart (A = A-post, B = B-post, E = Express)
    protected final char dispatchMode;
    public PostItem(String receiver, double weight, char dispatchMode){
        this.receiver = receiver;
        this.weight = weight;
        this.dispatchMode = dispatchMode;
    }
    public PostItem() {
        this("Santa Clause", 0.2, 'E');
    }
    @Override
    public String toString() {
        return "PI[" + receiver + ", "+ weight + ", " + dispatchMode + "]";
    }

    public void printSortedList(List<PostItem> list){
        /*Collections.sort(list, new Comparator<PostItem>() {
            @Override
            public int compare(PostItem o1, PostItem o2) {
                return Double.compare (o1.getWeight(), o2.getWeight());
            }
        });

        list.forEach(c -> {
            System.out.println(c);
        });*/

        /*list.stream()
            .mapToDouble(c -> c.getWeight())
            .sorted()
            .forEach(c -> System.out.println(c));*/

        Collections.sort(list, (c1, c2) -> Double.compare(c1.getWeight(), c2.getWeight()));
        list.forEach(c -> System.out.println(c));
    }

    public double getExpressWeight(List<PostItem> list){
        return list.stream()
                .filter(c-> (c.getDispatchMode() == 'E'))
                .collect(Collectors.summingDouble(PostItem::getWeight));
    }


// alle notwendigen Setter und Getter


    public String getReceiver() {
        return receiver;
    }

    public double getWeight() {
        return weight;
    }

    public char getDispatchMode() {
        return dispatchMode;
    }
}

