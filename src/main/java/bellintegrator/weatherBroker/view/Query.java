package bellintegrator.weatherBroker.view;

public class Query {
 private float count;
 private String created;
 private String lang;
 Results ResultsObject;


 // Getter Methods

 public float getCount() {
  return count;
 }

 public String getCreated() {
  return created;
 }

 public String getLang() {
  return lang;
 }

 public Results getResults() {
  return ResultsObject;
 }

 // Setter Methods

 public void setCount(float count) {
  this.count = count;
 }

 public void setCreated(String created) {
  this.created = created;
 }

 public void setLang(String lang) {
  this.lang = lang;
 }

 public void setResults(Results resultsObject) {
  this.ResultsObject = resultsObject;
 }
}
