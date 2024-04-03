package com.google.cloud;

import com.google.cloud.language.v2.Document;
import com.google.cloud.language.v2.Entity;
import com.google.cloud.language.v2.Sentiment;
import com.google.cloud.language.v2.LanguageServiceClient;
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

  @Autowired LanguageServiceClient languageClient;

  @GetMapping("/")
  void WelcomePage() {
    System.out.println("Hello world!");
  }

  @GetMapping("/auto")
  void CallWithAutoconfigClient() {
    for (String text : this.texts) {
      Document doc =
          Document.newBuilder().setContent(text).setType(Document.Type.PLAIN_TEXT).build();
      // Detects the sentiment of the text
      Sentiment sentiment = this.languageClient.analyzeSentiment(doc).getDocumentSentiment();

      System.out.printf("Text: \"%s\"%n", text);
      System.out.printf(
          "Sentiment: score = %s, magnitude = %s%n",
          sentiment.getScore(), sentiment.getMagnitude());
    }
  }
}
