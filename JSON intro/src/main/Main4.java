package main;

import java.io.FileReader;

import com.google.gson.Gson;

import movie.Movie;

public class Main4 {

	public static void main(String[] args) {
		
		try(FileReader file=new FileReader("many_movies.json")){
			
			Gson gson=new Gson();
			
			Movie[] movies=gson.fromJson(file, Movie[].class);
			for (Movie movie : movies) {
				System.out.println(movie);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
