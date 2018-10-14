package week5_6;

import java.util.ArrayList;

public class Layer  {
    ArrayList<Shape> shapeList = new ArrayList<>();
    //TODO: delete all Triangle in this Layer
    public void deleteAllTriangle(){
        for(int i=0; i<shapeList.size(); i++){
            if(shapeList.get(i) instanceof Triangle){
                shapeList.remove(i);
                i--;
            }
        }
    }
    public void deleteAllCircle() {
        for(int i=0; i<shapeList.size(); i++){
            if(shapeList.get(i) instanceof Circle){
                shapeList.remove(i);
                i--;
            }
        }
    }
}
