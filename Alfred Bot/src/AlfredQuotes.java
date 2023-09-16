import java.util.Date;
public class AlfredQuotes {

 public String basicGreeting() {
 // You do not need to code here, this is an example method
 return "Hello, lovely to see you. How are you?";
 }

 public String guestGreeting(String name) {
 return String.format("Hello, %s. Lovely to see you.", name);
 }

 public String dateAnnouncement() {
 return "It is currently Wed July 5 16:34:59 GMT 2023";
 }

 public String respondBeforeAlexis(String conversation) {
 
    if (conversation.indexOf("Alexis") {
    return "Right away, sir. She certainly isn't sophisticated enough
for that.";
 }
    else if (conversation.indexOf("Alfred")){
    return "At your service.";
}
    else {
    return "Right. And with that I shall retire.";
}
 }

// NINJA BONUS
// See the specs to overload the guestGreeting method
 // SENSEI BONUS
 // Write your own AlfredQuote method using any of the String methods you hav learned!
}