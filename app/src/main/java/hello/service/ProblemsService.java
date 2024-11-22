package hello.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import hello.model.ListNode;

@Service
public class ProblemsService {

    Logger logger = LoggerFactory.getLogger(ProblemsService.class);


    public String piramide(int size){
        logger.info("Building piramide with size " + size);


        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        lists.add(first);


        for (int i = 0; i < size; i++){
            List<Integer> newRow = new ArrayList<>();

            newRow.add(1);

            List<Integer> old = lists.get(i);
            for (int j = 1; j <  old.size(); j++){
                newRow.add(old.get(j - 1) + old.get(j));
            }


            newRow.add(1);
            lists.add(newRow);



        }



        //print result
        StringBuilder builder = new StringBuilder();
        for (List<Integer> list : lists){
            builder.append(list.toString());
            builder.append("<br/>");

        }

        
        return builder.toString();
    }

    public String findDuplicates(String[] array){
        List<String> buffer = new ArrayList<>();
        for(String str: array){
            if(buffer.contains(str)){
                return "List has duplicates";
            }
            buffer.add(str);
        }
        return "List does NOT have duplicates";

    }

    public String reverserList(String[] array){
        logger.info("Received array " + Arrays.toString(array));
        ListNode head = null;
        ListNode last = null;
        for (String str : array){
            if(head == null){
                head = new ListNode(str);
                last = head;
            }else{
                ListNode node = new ListNode(str);
                last.next = node;
                last = node;
            }
        }

        StringBuilder builder = new StringBuilder();

      return printNode(head);
    }

    String printNode(ListNode node) {
        StringBuilder builder = new StringBuilder();

        ListNode temp = node;
        while (temp != null) {
            builder.append(temp.value);
            builder.append("<br/>");
            temp = temp.next;
        }
        return builder.toString();
    }

}



