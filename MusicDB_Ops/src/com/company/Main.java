package com.company;

import com.company.model.Artist;
import com.company.model.Datasources;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Datasources datasources=new Datasources();
        if(!datasources.open()){
            System.out.println("Can't open datasource");
        }
        List<Artist> artists= datasources.queryArtists();
        if(artists==null){
            System.out.println("No artist");
        }
        else {
            for(Artist artist:artists){
                System.out.println("ID= "+artist.getId()+" name= "+artist.getName());
            }
        }
        datasources.close();
    }
}
