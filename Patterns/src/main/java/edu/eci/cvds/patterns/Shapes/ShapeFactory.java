package edu.eci.cvds.patterns.shapes;

public class ShapeFctory {
    public int ShapeFctory(RegularShapeType type) {
        switch (type){
            case Triangle:

                return ;

            case Quadrilateral:

                return 4;

            case Pentagono:

                return 5;

            case Hexagono:

                return 6;

        }
    }
}