package day11_Switch_Scanner;

public class Browser {

    public static void main(String[] args) {

        String browserName = "firefox" ;
        String result = null;

        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera" || browserName== "safari" || browserName == "edge";

        if (validBrowser){
            if(browserName=="chrome") {
                result = "Chrome";
            } else if (browserName=="firefox"){
                result = "Firefox";
            } else if (browserName=="opera"){
                result = "Opera";
            } else if (browserName=="safari"){
                result = "Safari";
            } else{
                result = "Edge";
            }
            System.out.println(result+" Browser selected.");
        }else {
            System.out.println("Invalid Browser Selected");
        }


    }
}
/*
1. Create a class called Browser. Write a program that can display the name of selected browser
	        1. declare a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name

	        Ex:
	        	String browser = "chrome";

	    	Output:
	    		Chrome Browser is selected

			Note: MUST use nested if
 */