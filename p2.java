abstract class solid{
    double r;
    public solid(double r){
        this.r=r;
    }

    abstract void Area();
    abstract void Volume();
    
}

class cylinder extends solid{
    double h;
    public cylinder(double r,double height){
        super(r);
        h=height;
    }

    void Area(){
        return (2*Math.PI*r*r)+(2*Math.PI*r*h);
    }

    void Volume(){
        return (Math.PI*r*r*h);
    }
}