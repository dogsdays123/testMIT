package com.test;

public class supertest {
    public static void main(String[] args) {
        point3D p3 = new point3D();
    }
}

class point{
    int x, y;
    point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class point3D extends point {
    int z;
    point3D() {
        super(1, 2);
        System.out.println("point3D(x, y, z) = " + x + ", " + y + ", " + z);
    }
}
