class MixerRunner{
public static void main(String[] mixer){

System.out.println("THE MAIN STARTED");
Mixer.onOrOff();
Mixer.increaseVolume();
Mixer.decreaseVolume();

System.out.println("THE MAIN ENDED");
}
}