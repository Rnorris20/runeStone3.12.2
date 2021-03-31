public class Main
{
   public String getGreeting()
   {
     return "Hello, let's talk.";
   }

   public String getResponse(String statement)
   {
     String response = "";
     //if the statement includes a no then it will print "why so negative"
     if (statement.indexOf("no") >= 0) {
       response = "Why so negative?";
     ////if the statement includes a "mother" "father" "sister" ""
     } else if (statement.indexOf("mother") >= 0
                 || statement.indexOf("father") >= 0
                 || statement.indexOf("sister") >= 0
                 || statement.indexOf("brother") >= 0) {
       response = "Tell me more about your family.";
      } 
      //added this else if, is the statement has eithr dog or cat, it will print "What no way?!" 
      else if (statement.indexOf("dog") >= 0
                 ||statement.indexOf("cat") >= 0) {
       response = "What no way?!";
      }
      else {
       response = getRandomResponse();
     }
     return response;
   }

   private String getRandomResponse()
   {
     final int NUMBER_OF_RESPONSES = 4;
     double r = Math.random();
     int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
     String response = "";

     if (whichResponse == 0) {
       response = "Interesting, tell me more.";
     } else if (whichResponse == 1) {
       response = "Hmmm.";
     } else if (whichResponse == 2) {
       response = "Do you really think so?";
     } else if (whichResponse == 3) {
       response = "You don't say.";
     }
     return response;
         }

   public static void main(String[] args)
   {
    Main maggie = new Main();
    
     System.out.println(maggie.getGreeting());
     System.out.println(">My mother and I talked last night.");
     System.out.println(maggie.getResponse("My mother and I talked last night."));
     System.out.println(">I said no.");
     System.out.println(maggie.getResponse("I said no!"));
     System.out.println(">The weather is nice.");
     System.out.println(maggie.getResponse("The weather is nice."));
     System.out.println(">Do you know my brother?");
     System.out.println(maggie.getResponse("Do you know my brother?"));
     //added these two print statements 
     //this one is just for show
     System.out.println("> Oh by the way we got a dog!");
     //this one is the one that the code is actually using to determine the response
     System.out.println(maggie.getResponse("Oh by the way we got a dog!"));
   }
}
