public class Hiddenword{

public String puzzle；

public Hiddenword(String HW){
HW=puzzle;
}

public String getHint(String guess ){

for(i = 0; i<puzzle.length;i++){
if(HW.substring(i).equalTo(guess.substring(i，i+1))
HW.substring(i,i+1).equalTo(guess.substring(i，i+！));

else if(HW.substring(i,i+1)！equalTo(guess.substring(i，i+1))
HW.substring(i,i+1).equalTo("+");

else
HW.substring(i,i+1).equalTo("*");

}

}

}
