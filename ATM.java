class ATM {
  public int countBanknotes(int sum) {
    int result = 0;
    int ostatok = 0;
    int i = 0;
    if(sum>=500){
      i = sum/500;
      result +=i;
      ostatok = sum%500;}
    if(ostatok>=200){
      i = ostatok/200;
      result +=i;
      ostatok = ostatok%200;}
    if(ostatok>=100){
      i = ostatok/100;
      result +=i;
      ostatok = ostatok%100;}
    if(ostatok>=50){
      i = ostatok/50;
      result +=i;
      ostatok = ostatok%50;}
    if(ostatok>=20){
      i = ostatok/20;
      result +=i;
      ostatok = ostatok%20;}
    if(ostatok>=10){
      i = ostatok/10;
      result +=i;
      ostatok = ostatok%10;}
    if(ostatok>=5){
      i = ostatok/5;
      result +=i;
      ostatok = ostatok%5;}
    if(ostatok>=2){
      i = ostatok/2;
      result +=i;
      ostatok = ostatok%2;}
    if(ostatok>=1){
      result +=1;}
    return result;
  }
}
