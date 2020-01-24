package edu.eci.arep;

import static spark.Spark.*;

public class SparkWebApp 
{
    public static void main( String[] args )
    {
       get("/hello", (req,res)->"Hello There");
    }
    
    static int getPort() {
    	return System.getenv("PORT")!=null ? Integer.parseInt(System.getenv("PORT")) : 4567;
    }
}
