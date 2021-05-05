package Source;
import javax.swing.JOptionPane;
public class Ea_Xp_IMHighLow {
public static void main(String args[]) {
int N=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de datos"));
float FA[],Xp1=0,Ea[],Eapos[],Mayor=0,IMa=0,IMe=0;
Ea= new float[N];Eapos= new float[N];FA = new float[N];
for(int i=0; i<N; ++i){
FA[i]=Float.parseFloat(JOptionPane.showInputDialog("dato Numero "+i));}
for (float i : FA){
    Xp1 += i;}
float Xp=Xp1/N;
System.out.println(Xp);
for(int i=0;i<N;++i){
    Ea[i]=FA[i]-Xp;
    Eapos[i] = Math.abs(Ea[i]);
    System.out.println("Ea"+i+" = "+Eapos[i]);}
for(int i=0;i<N;++i){
    if(Eapos[i]>Mayor){
        Mayor=Eapos[i];}}
IMa=Xp+Mayor;IMe=Xp-Mayor;
System.out.println("Ea mas alto"+Mayor);
System.out.println("Intervalo de la medicion Max= "+IMa);
System.out.println("Intervalo de la medicion Min= "+IMe);
JOptionPane.showMessageDialog(null,"Ea Mayor: "+Mayor +"\nXp = "+Xp+"\nIntervalo de medicion Alto/bajo: "+IMa+" / "+IMe);
}}