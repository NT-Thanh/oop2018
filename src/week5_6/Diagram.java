package week5_6;

import java.util.ArrayList;

public class Diagram {
    ArrayList<Layer> layerList = new ArrayList<>();

    //TODO: Constructor
    Diagram(){
    }
    //TODO: delete all Circle in this Diagram
    public void deleteAllCircle(){
        for(int i=0; i<layerList.size(); i++){
            layerList.get(i).deleteAllCircle();
        }
    }

    @Override
    public String toString() {
        String s = new String();
        for(int i=0; i<layerList.size(); i++){
            s+="layer[" + i + ']' + '\n';
            for(int j=0; j<layerList.get(i).shapeList.size(); j++){
                Shape thisShape = layerList.get(i).shapeList.get(j);
                s+= "    " +thisShape.toString() + "----" + thisShape.position() + '\n';
            }
        }

        return s;
    }

    public static void main(String[] args){
        Diagram diagram = new Diagram();
        Layer layer = null;

        //Create a layer
        diagram.layerList.add(new Layer());
        layer = diagram.layerList.get(0);

        //Draw shapes onto layer[0]
        layer.shapeList.add(new Rectangle(5, 6, 2, 7, "red", true));
        layer.shapeList.add(new Square(2.6, 3, 4, "green", false));
        layer.shapeList.add(new Circle(3, 1, 1));

        //Create a layer
        diagram.layerList.add(new Layer());
        layer = diagram.layerList.get(1);

        //Draw shapes onto layer[1]
        layer.shapeList.add(new Triangle(6, 8, 10, -2, 3, "golden", false));
        layer.shapeList.add(new Triangle(2, 4, 5, 2.6, 8.5));
        layer.shapeList.add(new Circle(10, 5.5, -4.6, "gray", true));
        layer.shapeList.add(new Square(4, 7, 6, "white", true));

        //Create a layer
        diagram.layerList.add(new Layer());
        layer = diagram.layerList.get(2);

        //Draw shapes onto layer[2]
        layer.shapeList.add(new Rectangle(5, 6, 2, 7));
        layer.shapeList.add(new Circle(6, 3, 4, "brown", true));
        layer.shapeList.add(new Circle(3, 7, 4, "blue", false));
        //Move shapes on layer[2]
        layer.shapeList.get(0).moveTo(3,7);
        layer.shapeList.get(1).moveTo(-4, -5.6);

        //print the tests
        System.out.println("---------BEFORE REMOVING----------");
        System.out.println(diagram.toString());
        // Remove all Circle and all Triangle in layer[1]
        System.out.println("---------AFTER REMOVING----------");
        diagram.deleteAllCircle();
        layer = diagram.layerList.get(1);
        layer.deleteAllTriangle();
        System.out.println(diagram.toString());
    }
}
