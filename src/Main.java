import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;

//LinkedList тизменин биринчи элементин алуу үчүн Java
//        программасын жазыңыз.
//        2. LinkedList тизменин акыркы элементин алуу үчүн Java
//        программасын жазыңыз.
//        3. LinkedList тизмеде белгилүү бир элемент бар же жок
//        экенин текшерүү үчүн Java программасын жаз.
//        4. LinkedList тизмени массивдердин тизмесине которуу
//        үчүн Java программасын жазыңыз
//        5. Эки LinkedList тизмесин салыштыруу үчүн Java
//        программасын жазыңыз.
//        6. LinkedList тизме бош же жок экенин текшерүү үчүн Java
//        программасын жазыңыз.
//        7. LinkedList тизмедеги элементти алмаштыруу үчүн Java
//        программасын жазыңыз.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList= new LinkedList<>(Set.of("Ermek","Asan","Asanbek","Aibek","Esen"));
        LinkedList<String> linkedList2= new LinkedList<>(Set.of("Erfemek","Afwsan","Asafwnbek","Aibefewk","Esfeen"));
        System.out.println("linkedList.getFirst() = " + linkedList.getFirst());
        System.out.println("linkedList.getLast() = " + linkedList.getLast());
        System.out.println("linkedList.contains(\"Atabek\") = " + linkedList.contains("Atabek"));
        String [] massive = new String[linkedList.size()];
        for (int i = 0; i < massive.length; i++) {
            massive[i]= linkedList.get(i);
        }
        System.out.println(Arrays.toString(massive));
        System.out.println("linkedList2.equals(linkedList) = " + linkedList2.equals(linkedList));
        System.out.println("linkedList.equals(!null) = " + (linkedList != null));
        linkedList.set(1,"KOIICHU");
        System.out.println(linkedList);

    }
}