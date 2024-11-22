package hello.controller;

import java.util.Arrays;

import hello.service.ProblemsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProblemsController {
    
   @Autowired
   ProblemsService service;
    
  private Logger logger = LoggerFactory.getLogger(ProblemsController.class);



    @GetMapping("/piramid")
    public String piramid(@RequestParam(required = true, name = "size") String size){
        try{
            return service.piramide( Integer.parseInt(size));
        }catch(NumberFormatException ex){
            return "Size params should be integer. Received = " + size;
        }
      
    }


    @GetMapping("/duplicates")
    public String findDuplicates(@RequestParam("data") String  data){
    
        String[] array = data.split(",");

        return service.findDuplicates(array);
    }


    @GetMapping("/reverseList")

    public String reverseList(@RequestParam("data") String data){
        String[] array = data.split(",");
        return service.reverserList(array);
    }



    @GetMapping("/islands")
    public String testworks(){

        int[][] array ={ 
            {1,0,0,1},
            {0,0,0,0},
            {1,0,1,1},
            {1,1,0,0}            
        };
        



        logger.info("Test was invoked from problems");
        StringBuilder builder = new StringBuilder();
        for( int[] arr : array){
            builder.append(Arrays.toString(arr));
            builder.append("<br/>");
           
        }

        int result = findIslands(array);
        builder.append("<br/>");
        builder.append("result is " + result);
        return builder.toString();
    }


    private int findIslands(int[][] array){
        int result = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if(array[i][j] == 1){
                    result++;
                    removeIsland(array,i,j);

                }
            }

        }
        return result;
    }
    private void removeIsland(int[][] array, int i, int j){
        if(i < 0 || j < 0 || i >= array.length || j >= array[i].length || array[i][j] == 0)return;

        array[i][j] = 0;

        removeIsland(array, i-1, j);
        removeIsland(array, i+1, j);
        removeIsland(array, i, j+1);
        removeIsland(array, i, j-1);
    }


}
