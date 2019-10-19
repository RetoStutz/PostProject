package post;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MeanOfTransport <T extends PostItem> {
    List<T> list = new ArrayList<>();

    //add new PostItem
    public void add(T content){
        this.list.add(content);
    }

    public int getNumberOfItems(){
        int numberOfExpres = 0;
        for (T p : list) {
            if (p.getDispatchMode() == 'E'){
                numberOfExpres ++;
            }
        }
        return numberOfExpres;
    }

    public T getMaxElement(){
        return list.stream()
                //.sorted(Comparator.comparingDouble(PostItem::getWeight))
                .sorted((t1, t2) -> Double.compare(t2.getWeight(), t1.getWeight()))
                .findFirst().orElse(null);
    }

    public List<T> getPostItem (String r){
        return list.stream()
                .filter(c -> (c.getReceiver().equals(r)))
                .collect(Collectors.toList());
    }

    public List<T> extractExpress(T [] inlist){
        List<T> output = new ArrayList<>();
        for (T e : inlist) {
            if(e.getDispatchMode() == 'E'){
               output.add(e);
            }
        }
        return output;
    }

    public List<T> removeDoubles(List<T> list) {
        return list.stream()
            .distinct()
            .collect(Collectors.toList());
    }
}
