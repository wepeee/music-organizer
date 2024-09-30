import java.util.ArrayList;

public class music {
    public ArrayList<String> music;

    public music(){
        music = new ArrayList<>();
    }

    public boolean isKosong(){
        return music.isEmpty();
    }

    public void add(String musicName){
        music.add(musicName);
    }

    public void show(){
        int i = 0;
        System.out.println("Music list :");
        for(String m : music){
            System.out.println((i + 1) + " " + m);
            i++;
        }    
    }
    
    public void showTotal(){
        System.out.println("Total music: " + music.size());
    }

    public void remove(int index){
        music.remove(index - 1);
    }

    public void showOption(){
        System.out.println("-------------------------");
        System.out.println("|1. add \t\t|");
        System.out.println("|2. Show List \t\t|");
        System.out.println("|3. Show Total Music \t|");
        System.out.println("|4. Remove Music \t|");
        System.out.println("|5. Exit \t\t|");
        System.out.println("-------------------------");
    }
}
