package com.gameshopcorp.heroes.graphics;

import com.jme3.texture.Image;
import com.jme3.texture.image.ColorSpace;

import java.nio.ByteBuffer;
import java.util.ArrayList;

public class ATMS {

    public int width;
    public int height;
    public Layer layer;
    public String name;
    public ATMS(String name, int width, int height){

        this.name = name;
        //this.name = name;
        this.width = width;
        this.height = height;
        this.layer = new Layer(width, height);
    }

    public Image makeATMS(){

        ArrayList<ByteBuffer> pixels = new ArrayList<>();
        ByteBuffer pixel = ByteBuffer.wrap(layer.outputLayer());
        pixels.add(pixel);
        return new Image(Image.Format.RGBA8, width, height, 8, pixels, ColorSpace.Linear);
    }

}
