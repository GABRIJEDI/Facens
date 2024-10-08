const byte led_1=13;
const byte led_2=12;
const byte led_3=11;
long aux;

void setup() {
  pinMode(led_1, OUTPUT);
  pinMode(led_2, OUTPUT);
  pinMode(led_3, OUTPUT);
  digitalWrite(led_1, LOW);
  digitalWrite(led_2, LOW);
  digitalWrite(led_3, LOW);
  aux=millis();
}

void loop() {
  if((millis()-aux)<3000){
  
  ledVerde(led_1);
  ledAmarelo(led_2);
  ledVermelho(led_3);
  }
  else{

    digitalWrite(led_2, HIGH);
    delay(500);
    digitalWrite(led_2, LOW);
    delay(500);
  }
  if((millis()-aux)>5000){
    aux=millis();
  }
}

void ledVerde(byte led){

  digitalWrite(led, HIGH);
  delay(500);
  digitalWrite(led, LOW);

}
void ledAmarelo(byte led){

  digitalWrite(led, HIGH);
  delay(300);
  digitalWrite(led, LOW);

}
void ledVermelho(byte led){

  digitalWrite(led, HIGH);
  delay(500);
  digitalWrite(led, LOW);

}