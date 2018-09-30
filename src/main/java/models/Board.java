package models;

public class Board {

    private Color [] secrectCode;

    private Color [] colorsArray;

    private Color colorA, colorR, colorV, colorZ, colorB, colorN;


    public Board(int secretCodeLength){
        secrectCode = generateSecretCode(secretCodeLength);
        colorA = Color.A;
        colorR = Color.R;
        colorV = Color.V;
        colorZ = Color.Z;
        colorB = Color.B;
        colorN = Color.N;
    }

    public void clear(){
    }

    public boolean existMastermind(int turn, int numAttempts){
        if (turn<=numAttempts) {
        }
        return true;
    }

    public Color[] generateSecretCode(int secretCodeLength) {
        secrectCode = new Color[secretCodeLength];

        for (int i=0; i<=secrectCode.length; i++){

        }

        return secrectCode;
    }
}
