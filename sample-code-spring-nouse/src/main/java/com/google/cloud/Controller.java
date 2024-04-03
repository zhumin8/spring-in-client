package com.google.cloud;

import com.google.cloud.language.v1.Document;
import com.google.cloud.language.v1.LanguageServiceClient;
import com.google.cloud.language.v1.Sentiment;
import com.google.cloud.language.v2.Entity;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
  private String[] texts = {
    "I love this!",
    "I hate this!",
    "Google, headquartered in Mountain View (1600 Amphitheatre Pkwy, Mountain View, CA 940430),"
        + " unveiled the new Android phone for $799 at the Consumer Electronic Show. "
        + "Sundar Pichai said in his keynote that users love their new Android phones."
  };


  @GetMapping("/")
  void WelcomePage() {
    System.out.println("Hello world!");
  }

  @GetMapping("/client")
  void CallWithAutoconfigClient() throws IOException {
    LanguageServiceClient language = LanguageServiceClient.create();
    for (String text : this.texts) {
      com.google.cloud.language.v1.Document doc =
          com.google.cloud.language.v1.Document.newBuilder().setContent(text).setType(Document.Type.PLAIN_TEXT).build();
      // Detects the sentiment of the text
      Sentiment sentiment = language.analyzeSentiment(doc).getDocumentSentiment();

      System.out.printf("Text: \"%s\"%n", text);
      System.out.printf(
          "Sentiment: score = %s, magnitude = %s%n",
          sentiment.getScore(), sentiment.getMagnitude());
    }
  }
}
