package post;

import java.util.*;

public class main {
    /*public static void main(String[] args) {
        List<PostItem> listA = new ArrayList<>();
        listA.add(new PostItem("Paul", 4.3, 'A'));
        listA.add(new PostItem("Anna", 0.5, 'B'));
        listA.add(new PostItem("Karl", 0.91, 'E'));
        listA.add(new PostItem("Peter", 3.5, 'B'));
        for (PostItem item : listA) {
            System.out.println(item);
        }
    }*/


    /*public static void main(String[] args) {
        PostItem test = new PostItem();
        List<PostItem> listB = new ArrayList<>();
        listB.add(new PostItem("Paul", 4.3, 'A'));
        listB.add(new PostItem("Anna", 0.5, 'B'));
        listB.add(new PostItem("Karl", 0.91, 'E'));
        listB.add(new PostItem("Peter", 3.5, 'B'));
        /*for (int i = listB.size() - 1; i > 0; i--) {
            System.out.println(listB.get(i));
        }*/

        /*test.printSortedList(listB);
        System.out.println(test.getExpressWeight(listB));



    }*/

    /*public static void main(String[] args) {
        HashMap<Character, PostItem> map= new HashMap<>();
        PostItem i1= new PostItem("Paul", 4.3, 'A');
        PostItem i2= new PostItem("Anna", 0.5, 'B');
        PostItem i3= new PostItem("Karl", 0.91, 'E');
        PostItem i4= new PostItem("Peter", 3.5, 'B');
        map.put(i1.getDispatchMode(), i1);
        map.put(i2.getDispatchMode(), i2);
        map.put(i3.getDispatchMode(), i3);
        map.put(i4.getDispatchMode(), i4);
        for(char k : map.keySet()){
            System.out.println(map.get(k).getReceiver());
        }
    }*/
    /*public static void main(String[] args) {
        Set<PostItem> set= new TreeSet<>(new Comparator<PostItem>() {
            @Override
            public int compare(PostItem o1, PostItem o2) {
                return Character.compare(o1.getDispatchMode(),
                        o2.getDispatchMode());
            }
        });
        set.add(new PostItem("Karl", 0.91, 'E'));
        set.add(new PostItem("Anna", 0.5, 'B'));
        set.add(new PostItem("Paul", 4.3, 'A'));
        set.add(new PostItem("Peter", 3.5, 'B'));
        for(PostItem item : set){
            System.out.println(item);
        }
    }*/
    //Aufgabe 3
    public static void main(String[] args) {
        /*MeanOfTransport postItemList = new MeanOfTransport();
        postItemList.add(new PostItem("Karl", 0.91, 'E'));
        postItemList.add(new PostItem("Anna", 0.5, 'B'));
        postItemList.add(new PostItem("Paul", 4.3, 'A'));
        postItemList.add(new PostItem("Peter", 3.5, 'B'));

        System.out.println(postItemList.getNumberOfItems());
        System.out.println(postItemList.getMaxElement());
        System.out.println(postItemList.getPostItem("Karl"));*/

        /*MeanOfTransport<Parcel> m1= new MeanOfTransport<>();
        m1.add(new Parcel("Peter",3.2,'A'));
        PostItem p= m1.getMaxElement();

        MeanOfTransport<Parcel> m2= new MeanOfTransport<>();
        m2.add(new PostItem("Peter",3.2,'A'));
        Parcel p2= m2.getMaxElement();

        MeanOfTransport<PostItem> m3=
                new MeanOfTransport<Letter>();
        m3.add(new Letter("Peter",3.2,'A'));
        Letter l3= m3.getMaxElement();

        MeanOfTransport<? extends PostItem> m4=
                new MeanOfTransport<PostItem>();
        m4.add(new Letter("Peter", 3.2, 'A'));
        PostItem p4= m4.getMaxElement();

        MeanOfTransport<PostItem> m5 = new MeanOfTransport<>();
        m5.add(new Letter("Peter", 3.2, 'A'));
        List<Letter> letters = m5.getPostItem("Peter");

        MeanOfTransport<PostItem> m6= new MeanOfTransport<>();
        m6.add(new Parcel("Peter",3.2,'A'));
        m6.add(new Letter("Peter", 0.2, 'B'));
        Object o1 = m6.getMaxElement();*/


        Letter[] letters= new Letter[4];
        MeanOfTransport m = new MeanOfTransport();
        letters[0]= new Letter("Paul", 4.3, 'A');
        letters[1]= new Letter("Anna", 0.5, 'B');
        letters[2]= new Letter("Karl", 0.91, 'E');
        letters[3]= new Letter("Peter", 3.5, 'B');
        List<Letter> expressLetter= m.extractExpress(letters);
        System.out.println(expressLetter);
// Element in expressLetter: [PostItem [Karl, 0.91, E]]
        Parcel[] parcels= new Parcel[2];
        parcels[0]= new Parcel("Karl", 0.91, 'E');
        parcels[1]= new Parcel("Peter", 3.5, 'E');
        List<Parcel> expressParcels= m.extractExpress(parcels);
// Elemente in expressParcels :
// [PostItem [Karl, 0.91, E]], PostItem [Peter, 3.5, E]]
        System.out.println(expressLetter);

        List<Integer> intList= new ArrayList<>();
        intList.add(1);
        intList.add(4);
        intList.add(4);
        List<Integer> intOhneDoubles= m.removeDoubles(intList); // [1, 4]
        System.out.println(intOhneDoubles);
        List<String> stringList= new LinkedList<>();
        stringList.add("Hallo");
        stringList.add("Hallo");
        stringList.add("Hallo");
        List<String> stringOhneDoubles= m.removeDoubles(stringList); // [Hallo]
        System.out.println(stringOhneDoubles);
    }
}