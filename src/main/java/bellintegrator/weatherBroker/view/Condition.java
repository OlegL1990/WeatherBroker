package bellintegrator.weatherBroker.view;

public class Condition {
 private String code;
 private String date;
 private String temp;
 private String text;


 // Getter Methods

 public String getCode() {
  return code;
 }

 public String getDate() {
  return date;
 }

 public String getTemp() {
  return temp;
 }

 public String getText() {
  return text;
 }

 // Setter Methods

 public void setCode(String code) {
  this.code = code;
 }

 public void setDate(String date) {
  this.date = date;
 }

 public void setTemp(String temp) {
  this.temp = temp;
 }

 public void setText(String text) {
  this.text = text;
 }
}
