package gemastiktraining;

public final class posisiNode {
    public int x;
    public int y;
    public double m;
    public boolean kiri;
    
    public posisiNode(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public posisiNode(int x, int y, posisiNode blangkon){
        this.x = x;
        this.y = y;
        hitungM(blangkon);
        hitungKiri(blangkon);
    }
    
    public void hitungM(posisiNode blangkon){
        m = (this.y - blangkon.y * 1.0)  / (this.x - blangkon.x * 1.0);
    }
    
    public void hitungKiri(posisiNode blangkon){
        kiri =  (blangkon.x - this.x * 1.0) > 0;
    }
}
